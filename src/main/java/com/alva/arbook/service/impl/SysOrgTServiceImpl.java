package com.alva.arbook.service.impl;

import com.alva.arbook.dao.SysOrgTMapper;
import com.alva.arbook.entity.SysOrgT;
import com.alva.arbook.service.SysOrgTService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SysOrgTServiceImpl implements SysOrgTService {

    @Autowired
    private SysOrgTMapper sysOrgTMapper;

    @Override
    public int deleteByPrimaryKey(String szId) {
        return 0;
    }

    @Override
    public int insert(SysOrgT record) {
        return sysOrgTMapper.insert(record);
    }

    @Override
    public SysOrgT selectByPrimaryKey(String szId) {
        return null;
    }

    @Override
    public List<SysOrgT> selectAll() {
        return null;
    }

    @Override
    public int updateByPrimaryKey(SysOrgT record) {
        return 0;
    }
}