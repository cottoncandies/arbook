package com.alva.arbook.service;

import com.alva.arbook.dto.LogQueryDTO;
import com.alva.arbook.entity.SysLogT;
import com.alva.arbook.vo.LogVO;

import java.util.List;

public interface SysLogTService {
    int deleteByPrimaryKey(String szId);

    int insert(SysLogT record);

    SysLogT selectByPrimaryKey(String szId);

    List<LogVO> selectAll();

    int updateByPrimaryKey(SysLogT record);

    List<LogVO> selectAllByPage(LogQueryDTO logQueryDTO);

}
