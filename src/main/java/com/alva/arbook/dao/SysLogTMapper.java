package com.alva.arbook.dao;

import com.alva.arbook.entity.SysLogT;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysLogTMapper {
    int deleteByPrimaryKey(String szId);

    int insert(SysLogT record);

    SysLogT selectByPrimaryKey(Integer szId);

    List<SysLogT> selectAll();

    int updateByPrimaryKey(SysLogT record);

    List<SysLogT> selectAllByPage(@Param("offset") Integer offset, @Param("limit") Integer limit, @Param("type") String type );

    Long selectAllCount();
}