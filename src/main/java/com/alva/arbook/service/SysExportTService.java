package com.alva.arbook.service;

import com.alva.arbook.entity.SysExportT;

import java.util.List;

public interface SysExportTService {

    int deleteByPrimaryKey(String szId);

    int insert(SysExportT record);

    SysExportT selectByPrimaryKey(String szId);

    List<SysExportT> selectAll();

    int updateByPrimaryKey(SysExportT record);

    // 查询目录是否存在
    SysExportT selectByDirectory(String szDirectory);

}
