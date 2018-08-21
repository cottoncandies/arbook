package com.alva.arbook.service;

import com.alva.arbook.entity.SysSubjectT;

import java.util.List;

public interface SysSubjectTService {

    int deleteByPrimaryKey(String szId);

    int insert(SysSubjectT record);

    SysSubjectT selectByPrimaryKey(String szId);

    List<SysSubjectT> selectAll();

    int updateByPrimaryKey(SysSubjectT record);

    // 根据学科名查询学科id
    String selectIdBySubjectName(String subjectName);
}
