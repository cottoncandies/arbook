package com.alva.arbook.controller;

import com.alva.arbook.dao.SysTextbookTMapper;
import com.alva.arbook.service.SysTextbookTService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SysSubjectTControllerTest {

    @Autowired
    private SysTextbookTService sysTextbookTService;
    @Autowired
    private SysTextbookTMapper sysTextbookTMapper;


    @Test
    public void insert() {

    }
}