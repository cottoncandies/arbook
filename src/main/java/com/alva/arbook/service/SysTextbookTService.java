package com.alva.arbook.service;

import com.alva.arbook.entity.SysTextbookT;
import com.alva.arbook.transform.JsonTextbook;

import java.util.List;

public interface SysTextbookTService {

    int deleteByPrimaryKey(String szId);

    int insert(JsonTextbook jsonTextbook, SysTextbookT sysTextbookT);

    SysTextbookT selectByPrimaryKey(String szId);

    int updateByPrimaryKey(SysTextbookT record);

    List<SysTextbookT> selectByCustom(String subject, String publish, String section, String grade, int page, int rows);

    Long countByCustomQuery(String subject, String publish, String section, String grade);

}