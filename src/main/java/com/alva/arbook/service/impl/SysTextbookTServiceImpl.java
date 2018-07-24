package com.alva.arbook.service.impl;

import com.alva.arbook.dao.SysTextbookTMapper;
import com.alva.arbook.entity.SysTextbookT;
import com.alva.arbook.service.SysTextbookTService;
import com.alva.arbook.vo.TextBookVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class SysTextbookTServiceImpl implements SysTextbookTService {

    @Autowired
    private SysTextbookTMapper sysTextbookTMapper;

    @Override
    public int deleteByPrimaryKey(String szId) {
        return 0;
    }

    @Override
    public int insert(SysTextbookT record) {
        return 0;
    }

    @Override
    public SysTextbookT selectByPrimaryKey(String szId) {
        return null;
    }


    @Override
    public List<SysTextbookT> selectAll() {
        return null;
    }

    @Override
    public int updateByPrimaryKey(SysTextbookT record) {
        return 0;
    }

    @Override
    public List<TextBookVO> selectByCustom(String subject, String publish, String section, String grade, int page, int rows) {
        List<SysTextbookT> sysTextbookTS = sysTextbookTMapper.selectByCustom(subject, publish, section, grade, (page - 1) * rows, rows);
        //转化为VO
        List<TextBookVO> textBookVOList = new ArrayList<>();
        for (SysTextbookT sysTextbookT : sysTextbookTS) {
            TextBookVO textBookVO = new TextBookVO();
            textBookVO.setId(sysTextbookT.getSzId());
            textBookVO.setPublish(sysTextbookT.getPublish().getSzCaption());
            textBookVO.setSubject(sysTextbookT.getSubject().getSzCaption());
            textBookVO.setCaption(sysTextbookT.getSzCaption());
            textBookVO.setCover(sysTextbookT.getSzCover());
            textBookVO.setEdition(sysTextbookT.getSzEdition());
            textBookVO.setGrade(sysTextbookT.getSzGrade());
            textBookVO.setMd5(sysTextbookT.getSzMd5());
            textBookVO.setSection(sysTextbookT.getSzSection());
            textBookVO.setSize(sysTextbookT.getNgSize());
            textBookVOList.add(textBookVO);
        }
        return textBookVOList;
    }

    @Override
    public Long count(String subject, String publish, String section, String grade) {
        return sysTextbookTMapper.count(subject,publish,section,grade);
    }
}