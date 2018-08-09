package com.alva.arbook.service;

import com.alva.arbook.entity.SysOrgT;

import java.util.List;

public interface SysOrgTService {

    int deleteByPrimaryKey(String szId);

    int insert(SysOrgT record);

    SysOrgT selectByPrimaryKey(String szId);

    List<SysOrgT> selectAll();

    int updateByPrimaryKey(SysOrgT record);
}