package com.alva.arbook.service;

import com.alva.arbook.dto.TextbookDTO;
import com.alva.arbook.dto.TextbookQueryDTO;
import com.alva.arbook.entity.SysTextbookT;
import com.alva.arbook.vo.TextbookVO;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.List;

public interface SysTextbookTService extends BaseService<SysTextbookT> {

    int deleteByPrimaryKey(String szId);

    int insert(TextbookDTO textbookDTO, File file);

    //SysTextbookT selectByPrimaryKey(String szId);

    int updateByPrimaryKey(SysTextbookT record);

    List<TextbookVO> selectByCustom(TextbookQueryDTO textbookQueryDTO);

    Long countByCustomQuery(TextbookQueryDTO textbookQueryDTO);

    List<String> selectDistinctSection();

    List<String> selectDistinctGrade();

    boolean exportBookList(String[] bookIds, String directory, String exportPath, HttpSession session);

    int editBook(TextbookVO textbookVO);

}