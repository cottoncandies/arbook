package com.alva.arbook.controller;

import com.alva.arbook.entity.SysSubjectT;
import com.alva.arbook.service.SysSubjectTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SysSubjectTController {

    @Autowired
    private SysSubjectTService sysSubjectTService;

    @RequestMapping("selectSubject")
    public List<SysSubjectT> selectSubject() {
        return sysSubjectTService.selectAll();
    }
}
