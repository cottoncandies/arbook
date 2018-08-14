package com.alva.arbook.service.impl;

import com.alva.arbook.dao.SysTextbookTMapper;
import com.alva.arbook.entity.SysTextbookT;
import com.alva.arbook.service.SysPublishingTService;
import com.alva.arbook.service.SysSubjectTService;
import com.alva.arbook.service.SysTextbookTService;
import com.alva.arbook.transform.JsonTextbook;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;


@Service
public class SysTextbookTServiceImpl implements SysTextbookTService {

    @Resource
    private SysTextbookTMapper sysTextbookTMapper;

    @Resource
    private SysSubjectTService sysSubjectTService;

    @Resource
    private SysPublishingTService sysPublishingTService;

    @Override
    public int deleteByPrimaryKey(String szId) {
        return 0;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, rollbackFor = RuntimeException.class)
    public int insert(JsonTextbook jsonTextbook,SysTextbookT sysTextbookT) {
        String term = jsonTextbook.getTerm();
        String publishName = jsonTextbook.getPublish();
        String subjectName = jsonTextbook.getSubject();
        String subjectId = sysSubjectTService.selectIdBySubjectName(subjectName);
        String publishId = sysPublishingTService.selectIdByPublishName(publishName);
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
    public List<SysTextbookT> selectByCustom(String subject, String publish, String section, String grade, int page, int rows) {
        return sysTextbookTMapper.selectByCustom(subject, publish, section, grade, (page - 1) * rows, rows);
    }

    @Override
    public Long countByCustomQuery(String subject, String publish, String section, String grade) {
        return sysTextbookTMapper.countByCustomQuery(subject, publish, section, grade);
    }

}