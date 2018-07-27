package com.alva.arbook.controller;

import com.alva.arbook.dao.SysTextbookTMapper;
import com.alva.arbook.entity.SysTextbookT;
import com.alva.arbook.service.SysTextbookTService;
import com.alva.arbook.vo.TextBookVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SysSubjectTControllerTest {

    @Autowired
    private SysTextbookTService sysTextbookTService;
    @Autowired
    private SysTextbookTMapper sysTextbookTMapper;


    @Test
    public void insert() {
//
//        List<SysTextbookT> sysTextbookTS = sysTextbookTService.selectAll();
//        for (int i = 0; i < sysTextbookTS.size() ; i++) {
//            System.out.println(sysTextbookTS.get(i));
//        }

//        Long count = sysTextbookTService.count();
//        System.out.println(count);

        List<SysTextbookT> sysTextbookTS = sysTextbookTMapper.selectByCustom("语文", null, null, null, 0, 3);
        //转化为VO
        List<TextBookVO> textBookVOList = new ArrayList<>();
        for (SysTextbookT sysTextbookT : sysTextbookTS) {
            System.out.println(sysTextbookT);
            TextBookVO textBookVO = new TextBookVO();
            //BeanUtils.copyProperties(sysTextbookT,textBookVO);//属性名相同才可以转换
            System.out.println(textBookVO);
            textBookVOList.add(textBookVO);
        }
        System.out.println(textBookVOList.size());
    }
}