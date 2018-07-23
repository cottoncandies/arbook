package com.alva.arbook.service.impl;

import com.alva.arbook.dao.SysTextbookTMapper;
import com.alva.arbook.entity.SysTextbookT;
import com.alva.arbook.service.SysTextbookTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SysTextbookTServiceImpl implements SysTextbookTService {

    @Autowired
    private SysTextbookTMapper sysTextbookTMapper;

    @Override
    public int deleteByPrimaryKey(String szId) {
        return 0;
    }

    @Override
    public int insert(SysTextbookT record) {
        return 0;
    }

    @Override
    public SysTextbookT selectByPrimaryKey(String szId) {
        return null;
    }

    @Override
    public List<SysTextbookT> selectAll() {
        return sysTextbookTMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(SysTextbookT record) {
        return 0;
    }
}