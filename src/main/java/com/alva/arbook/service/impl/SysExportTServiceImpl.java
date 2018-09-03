package com.alva.arbook.service.impl;

import com.alva.arbook.dao.SysExportTMapper;
import com.alva.arbook.entity.SysExportT;
import com.alva.arbook.service.SysExportTService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysExportTServiceImpl implements SysExportTService {
    @Resource
    private SysExportTMapper sysExportTMapper;

    @Override
    public int deleteByPrimaryKey(String szId) {
        return 0;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, rollbackFor = RuntimeException.class)
    public int insert(SysExportT record) {
        return 0;
    }

    @Override
    public SysExportT selectByPrimaryKey(String szId) {
        return null;
    }

    @Override
    public List<SysExportT> selectAll() {
        return null;
    }

    @Override
    public int updateByPrimaryKey(SysExportT record) {
        return 0;
    }

    @Override
    public SysExportT selectByDirectory(String szDirectory) {
        return sysExportTMapper.selectByDirectory(szDirectory);
    }
}
