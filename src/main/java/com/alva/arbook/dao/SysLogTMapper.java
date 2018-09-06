package com.alva.arbook.dao;

import com.alva.arbook.dto.LogQueryDTO;
import com.alva.arbook.entity.SysLogT;

import java.util.List;

public interface SysLogTMapper {
    int deleteByPrimaryKey(String szId);

    int insert(SysLogT record);

    SysLogT selectByPrimaryKey(Integer szId);

    List<SysLogT> selectAll();

    int updateByPrimaryKey(SysLogT record);

    List<SysLogT> selectAllByPage(LogQueryDTO logQueryDTO);

    Long selectAllCount(LogQueryDTO logQueryDTO);

    List<String> selectDistinctType();
}