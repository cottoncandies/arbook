package com.alva.arbook.service.impl;

import com.alva.arbook.dao.SysSubjectTMapper;
import com.alva.arbook.entity.SysSubjectT;
import com.alva.arbook.service.SysSubjectTService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysSubjectTServiceImpl implements SysSubjectTService {

    @Resource
    private SysSubjectTMapper sysSubjectTMapper;

    @Override
    public int deleteByPrimaryKey(String szId) {
        return 0;
    }

    @Override
    public int insert(SysSubjectT record) {
        return 0;
    }

    @Override
    public SysSubjectT selectByPrimaryKey(String szId) {
        return null;
    }

    @Override
    public List<SysSubjectT> selectAll() {
        return sysSubjectTMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(SysSubjectT record) {
        return 0;
    }

    @Override
    public String selectIdBySubjectName(String subjectName) {
        return sysSubjectTMapper.selectIdBySubjectName(subjectName);
    }
}
