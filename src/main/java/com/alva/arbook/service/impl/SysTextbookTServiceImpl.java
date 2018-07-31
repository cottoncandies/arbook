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
        return sysTextbookTMapper.selectByPrimaryKey(szId);
    }


    @Override
    public List<SysTextbookT> selectAll(Integer page, Integer rows) {
        return sysTextbookTMapper.selectAll((page - 1) * rows, rows);
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

    @Override
    public Long countAllTextBook() {
        return sysTextbookTMapper.countAllTextBook();
    }
}