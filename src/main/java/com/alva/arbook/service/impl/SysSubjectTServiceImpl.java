package com.alva.arbook.service.impl;

import com.alva.arbook.dao.SysSubjectTMapper;
import com.alva.arbook.entity.SysSubjectT;
import com.alva.arbook.service.SysSubjectTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

@Service
public class SysSubjectTServiceImpl implements SysSubjectTService {

    @Autowired
    private SysSubjectTMapper sysSubjectTMapper;

    @Override
    public int deleteByPrimaryKey(String szId) {
        return 0;
    }

    @Override
    public int insert(SysSubjectT record) {
        record.setSzId(UUID.randomUUID().toString().replaceAll("-",""));
        return sysSubjectTMapper.insert(record);
    }

    @Override
    public SysSubjectT selectByPrimaryKey(String szId) {
        return null;
    }

    @Override
    public List<SysSubjectT> selectAll() {
        return null;
    }

    @Override
    public int updateByPrimaryKey(SysSubjectT record) {
        return 0;
    }
}