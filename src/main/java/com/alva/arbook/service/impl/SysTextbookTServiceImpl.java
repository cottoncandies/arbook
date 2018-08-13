package com.alva.arbook.service.impl;

import com.alva.arbook.dao.SysTextbookTMapper;
import com.alva.arbook.entity.SysTextbookT;
import com.alva.arbook.service.SysTextbookTService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.UUID;


@Service
public class SysTextbookTServiceImpl implements SysTextbookTService {

    @Resource
    private SysTextbookTMapper sysTextbookTMapper;

    @Override
    public int deleteByPrimaryKey(String szId) {
        return 0;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,rollbackFor = RuntimeException.class)
    public int insert(SysTextbookT record) {
        record.setNtRowState(1);
        record.setNtRowVersion(1);
        record.setSzInsti("633");
        record.setSzTag("tag");
        record.setTsCreated(new Date());
        record.setTsUpdated(new Date());
        return sysTextbookTMapper.insert(record);
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