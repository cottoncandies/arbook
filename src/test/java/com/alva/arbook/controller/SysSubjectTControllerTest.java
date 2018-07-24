package com.alva.arbook.controller;

import com.alva.arbook.entity.SysTextbookT;
import com.alva.arbook.service.SysTextbookTService;
import com.alva.arbook.vo.TextBookVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SysSubjectTControllerTest {

    @Autowired
    private SysTextbookTService sysTextbookTService;


    @Test
    public void insert() {
//
//        List<SysTextbookT> sysTextbookTS = sysTextbookTService.selectAll();
//        for (int i = 0; i < sysTextbookTS.size() ; i++) {
//            System.out.println(sysTextbookTS.get(i));
//        }

//        Long count = sysTextbookTService.count();
//        System.out.println(count);

        List<TextBookVO> textBookVOList = sysTextbookTService.selectByCustom("语文", "人民教育出版社", "初中", "七年级", 1, 2);
        System.out.println(textBookVOList.size());
    }
}