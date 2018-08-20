package com.alva.arbook.service.impl;

import com.alva.arbook.dao.SysExportTMapper;
import com.alva.arbook.dao.SysPublishingTMapper;
import com.alva.arbook.dao.SysSubjectTMapper;
import com.alva.arbook.dao.SysTextbookTMapper;
import com.alva.arbook.entity.*;
import com.alva.arbook.jsonresponse.ResponseBook;
import com.alva.arbook.service.SysTextbookTService;
import com.alva.arbook.transform.JsonTextbook;
import org.apache.commons.io.FileUtils;
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
    private SysExportTMapper sysExportTMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, rollbackFor = RuntimeException.class)
    public int deleteByPrimaryKey(String szId) {
        return sysTextbookTMapper.deleteByPrimaryKey(szId);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, rollbackFor = RuntimeException.class)
    public int insert(JsonTextbook jsonTextbook, SysTextbookT sysTextbookT) {
        String term = jsonTextbook.getTerm();
        String publishName = jsonTextbook.getPublish();
        String subjectName = jsonTextbook.getSubject();
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
        sysTextbookT.setSzId(jsonTextbook.getId());
        sysTextbookT.setSzCaption(jsonTextbook.getCaption());
        sysTextbookT.setSzCover(jsonTextbook.getCover());
        sysTextbookT.setSzEdition(jsonTextbook.getEdition());
        sysTextbookT.setSzSection(jsonTextbook.getSection());
        sysTextbookT.setSzGrade(jsonTextbook.getGrade());
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
    public List<ResponseBook> selectByCustom(String subjectId, String publishId, String section, String grade, int page, int rows) {
        List<ResponseBook> responseBooks = new ArrayList<>();
        List<SysTextbookT> textbookTS = sysTextbookTMapper.selectByCustom(subjectId, publishId, section, grade, (page - 1) * rows, rows);

        for (SysTextbookT textbookT : textbookTS) {
            SysSubjectT sysSubjectT = sysSubjectTMapper.selectByPrimaryKey(textbookT.getSzSubjectId());
            String subject = sysSubjectT.getSzCaption();
            SysPublishingT sysPublishingT = sysPublishingTMapper.selectByPrimaryKey(textbookT.getSzPubId());
            String publish = sysPublishingT.getSzCaption();
            ResponseBook responseBook = new ResponseBook(textbookT.getSzId(), textbookT.getSzCaption(), textbookT.getSzCover(), textbookT.getSzEdition(), textbookT.getSzSection(),
                    textbookT.getSzGrade(), publish, subject, textbookT.getSzMd5(), textbookT.getNgSize());
            responseBooks.add(responseBook);
        }
        return responseBooks;
    }

    @Override
    public Long countByCustomQuery(String subjectId, String publishId, String section, String grade) {
        return sysTextbookTMapper.countByCustomQuery(subjectId, publishId, section, grade);
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
    public SysExportT exportBookList(String[] bookIds, String directory, String exportPath, HttpSession session, String sessionLoginUser) {
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
        SysUserT sysUserT = (SysUserT) session.getAttribute(sessionLoginUser);
        sysExportT.setSzDirectory(directory);
        //sysExportT.setSzOperator(sysUserT.getSzEmail());
        return sysExportT;
    }

}