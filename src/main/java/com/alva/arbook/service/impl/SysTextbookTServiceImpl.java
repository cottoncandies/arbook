package com.alva.arbook.service.impl;

import com.alva.arbook.dao.SysExportTMapper;
import com.alva.arbook.dao.SysPublishingTMapper;
import com.alva.arbook.dao.SysSubjectTMapper;
import com.alva.arbook.dao.SysTextbookTMapper;
import com.alva.arbook.dto.TextbookDTO;
import com.alva.arbook.dto.TextbookQueryDTO;
import com.alva.arbook.entity.SysExportT;
import com.alva.arbook.entity.SysTextbookT;
import com.alva.arbook.entity.SysUserT;
import com.alva.arbook.service.SysTextbookTService;
import com.alva.arbook.util.MD5Util;
import com.alva.arbook.util.ZipUtil;
import com.alva.arbook.vo.TextbookVO;
import org.apache.commons.io.FileUtils;
import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@Service
public class SysTextbookTServiceImpl implements SysTextbookTService {

    @Resource
    private SysTextbookTMapper sysTextbookTMapper;

    @Resource
    private SysSubjectTMapper sysSubjectTMapper;

    @Resource
    private SysPublishingTMapper sysPublishingTMapper;

    @Resource
    private SysExportTMapper sysExportTMapper;

    @Resource
    private DozerBeanMapper mapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, rollbackFor = RuntimeException.class)
    public int deleteByPrimaryKey(String szId) {
        return sysTextbookTMapper.deleteByPrimaryKey(szId);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, rollbackFor = RuntimeException.class)
    public int insert(TextbookDTO textbookDTO,File file) {

        SysTextbookT sysTextbookT = mapper.map(textbookDTO, SysTextbookT.class);
        String publishName = textbookDTO.getPublish();
        String subjectName = textbookDTO.getSubject();
        String subjectId = sysSubjectTMapper.selectIdBySubjectName(subjectName);
        String publishId = sysPublishingTMapper.selectIdByPublishName(publishName);
        sysTextbookT.setSzPubId(publishId);
        sysTextbookT.setSzSubjectId(subjectId);
        String term = textbookDTO.getTerm();
        switch (term) {
            case "全学年":
                sysTextbookT.setNtTerm(0);
                break;
            case "上学期":
                sysTextbookT.setNtTerm(1);
                break;
            case "下学期":
                sysTextbookT.setNtTerm(2);
                break;
            default:
                sysTextbookT.setNtTerm(-1);
        }
        int writeToDB = 0;
        try {
            writeToDB = sysTextbookTMapper.insert(sysTextbookT);
        } catch (Exception e) {
            e.printStackTrace();
            // 上传的教材信息写入数据库失败时，删除已经上传到服务器的文件
            file.delete();
        }
        return writeToDB;
    }

    @Override
    public SysTextbookT selectByPrimaryKey(String szId) {
        return sysTextbookTMapper.selectByPrimaryKey(szId);
    }

    @Override
    public int updateByPrimaryKey(SysTextbookT record) {
        return 0;
    }

    @Override
    public List<TextbookVO> selectByCustom(TextbookQueryDTO textbookQueryDTO) {
        List<TextbookVO> textbookVOS = new ArrayList<>();
        Integer offset = (textbookQueryDTO.getPage() - 1) * textbookQueryDTO.getLimit();
        textbookQueryDTO.setPage(offset);
        List<SysTextbookT> textbookTS = sysTextbookTMapper.selectByCustom(textbookQueryDTO);
        for (SysTextbookT textbookT : textbookTS) {
            TextbookVO textbookVO = mapper.map(textbookT, TextbookVO.class);
            textbookVOS.add(textbookVO);
        }
        return textbookVOS;
    }

    @Override
    public Long countByCustomQuery(TextbookQueryDTO textbookQueryDTO) {
        return sysTextbookTMapper.countByCustomQuery(textbookQueryDTO);
    }

    @Override
    public List<String> selectDistinctSection() {
        return sysTextbookTMapper.selectDistinctSection();
    }

    @Override
    public List<String> selectDistinctGrade() {
        return sysTextbookTMapper.selectDistinctGrade();
    }

    /*
    将教材导出到用户指定目录
    导出成功后将导出信息添加到数据库
    添加导出信息失败时删除已导出的教材
     */
    @Override
    public boolean exportBookList(String[] bookIds, String directory, String exportPath, HttpSession session) {
        boolean isDownload = true;
        File desFile = null;
        try {
            File exportFile = new File(exportPath);
            //创建导出目录文件夹
            if (!exportFile.exists()) {
                exportFile.mkdirs();
            }
            //遍历导出
            for (String bookId : bookIds) {
                SysTextbookT sysTextbookT = sysTextbookTMapper.selectByPrimaryKey(bookId);
                String fileName = sysTextbookT.getSzCaption();// 查询教材文件名
                String realPath = sysTextbookT.getSzStore();// 查询教材存放位置
                File file = new File(realPath);
                if (file.exists()) {
                    desFile = new File(exportPath + "/" + directory + "/" + fileName + ".zip");
                    try {
                        FileUtils.copyFile(file, desFile);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (Exception e) {
            isDownload = false;
            e.printStackTrace();
        }
        if (isDownload) {
            try {
                // 将导出信息添加到数据库
                SysExportT sysExportT = new SysExportT();
                SysUserT sysUserT = (SysUserT) session.getAttribute("user");
                sysExportT.setSzDirectory(directory);
                sysExportT.setSzOperator(sysUserT.getSzEmail());
                sysExportTMapper.insert(sysExportT);
                return true;
            } catch (Exception e) {
                //添加数据库失败,将已经导出的教材删掉 确保服务器上的文件与数据库信息保持一致
                desFile = new File(exportPath + "/" + directory);
                try {
                    FileUtils.deleteDirectory(desFile);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
        return false;
    }

    @Override
    public int editBook(TextbookVO textbookVO) {
        String subjectId = sysSubjectTMapper.selectIdBySubjectName(textbookVO.getSubject());
        String publishId = sysPublishingTMapper.selectIdByPublishName(textbookVO.getPublish());
        SysTextbookT sysTextbookT = mapper.map(textbookVO, SysTextbookT.class);
        sysTextbookT.setSzSubjectId(subjectId);
        sysTextbookT.setSzPubId(publishId);
        return sysTextbookTMapper.editBook(sysTextbookT);
    }

}