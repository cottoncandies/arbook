package com.alva.arbook.service.impl;

import com.alva.arbook.dao.SysSubjectTMapper;
import com.alva.arbook.service.SysSubjectTService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SysSubjectTServiceImpl implements SysSubjectTService {

    @Resource
    private SysSubjectTMapper sysSubjectTMapper;

    @Override
    public String selectIdBySubjectName(String subjectName) {
        return sysSubjectTMapper.selectIdBySubjectName(subjectName);
    }
}
