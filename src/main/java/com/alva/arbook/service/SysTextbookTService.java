package com.alva.arbook.service;

import com.alva.arbook.entity.SysExportT;
import com.alva.arbook.entity.SysTextbookT;
import com.alva.arbook.jsonresponse.ResponseBook;
import com.alva.arbook.transform.JsonTextbook;

import javax.servlet.http.HttpSession;
import java.util.List;

public interface SysTextbookTService {

    int deleteByPrimaryKey(String szId);

    int insert(JsonTextbook jsonTextbook, SysTextbookT sysTextbookT);

    SysTextbookT selectByPrimaryKey(String szId);

    int updateByPrimaryKey(SysTextbookT record);

    List<ResponseBook> selectByCustom(String subjectId, String publishId, String section, String grade, int page, int rows);

    Long countByCustomQuery(String subjectId, String publishId, String section, String grade);

    List<String> selectDistinctSection();

    List<String> selectDistinctGrade();

    SysExportT exportBookList(String[] bookIds, String directory, String exportPath, HttpSession session, String sessionLoginUser);

}