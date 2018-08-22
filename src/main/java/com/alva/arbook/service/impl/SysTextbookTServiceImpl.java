package com.alva.arbook.service.impl;

import com.alva.arbook.dao.SysPublishingTMapper;
import com.alva.arbook.dao.SysSubjectTMapper;
import com.alva.arbook.dao.SysTextbookTMapper;
import com.alva.arbook.dto.TextbookDTO;
import com.alva.arbook.dto.TextbookQueryDTO;
import com.alva.arbook.entity.SysExportT;
import com.alva.arbook.entity.SysTextbookT;
import com.alva.arbook.entity.SysUserT;
import com.alva.arbook.service.SysTextbookTService;
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
import java.util.Date;
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
    private DozerBeanMapper mapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, rollbackFor = RuntimeException.class)
    public int deleteByPrimaryKey(String szId) {
        return sysTextbookTMapper.deleteByPrimaryKey(szId);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, rollbackFor = RuntimeException.class)
    public int insert(TextbookDTO TextbookDTO, SysTextbookT sysTextbookT) {
        String term = TextbookDTO.getTerm();
        String publishName = TextbookDTO.getPublish();
        String subjectName = TextbookDTO.getSubject();
        String subjectId = sysSubjectTMapper.selectIdBySubjectName(subjectName);
        String publishId = sysPublishingTMapper.selectIdByPublishName(publishName);
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
        sysTextbookT.setSzSubjectId(subjectId);
        sysTextbookT.setSzPubId(publishId);
        sysTextbookT.setNtRowState(1);
        sysTextbookT.setNtRowVersion(1);
        sysTextbookT.setSzInsti("633");
        sysTextbookT.setSzTag(" ");
        sysTextbookT.setTsCreated(new Date());
        sysTextbookT.setTsUpdated(new Date());
        sysTextbookT.setSzId(TextbookDTO.getId());
        sysTextbookT.setSzCaption(TextbookDTO.getCaption());
        sysTextbookT.setSzCover(TextbookDTO.getCover());
        sysTextbookT.setSzEdition(TextbookDTO.getEdition());
        sysTextbookT.setSzSection(TextbookDTO.getSection());
        sysTextbookT.setSzGrade(TextbookDTO.getGrade());
        return sysTextbookTMapper.insert(sysTextbookT);
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

    @Override
    @Transactional
    public SysExportT exportBookList(String[] bookIds, String directory, String exportPath, HttpSession session) {
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
                File desFile = new File(exportPath + "/" + directory + "/" + fileName + ".zip");
                try {
                    FileUtils.copyFile(file, desFile);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        // 将导出信息添加到数据库
        SysExportT sysExportT = new SysExportT();
        SysUserT sysUserT = (SysUserT) session.getAttribute("user");
        sysExportT.setSzDirectory(directory);
        //sysExportT.setSzOperator(sysUserT.getSzEmail());
        return sysExportT;
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