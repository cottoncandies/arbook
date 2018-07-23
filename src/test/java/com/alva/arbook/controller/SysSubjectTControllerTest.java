package com.alva.arbook.controller;

import com.alva.arbook.entity.SysSubjectT;
import com.alva.arbook.service.SysSubjectTService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class SysSubjectTControllerTest {

    @Autowired
    private SysSubjectTService sysSubjectTService;


    @Test
    public void insert() {
        SysSubjectT sysSubjectT = new SysSubjectT();
        sysSubjectT.setSzCaption("666");
        System.out.println(sysSubjectTService.insert(sysSubjectT));
    }
}