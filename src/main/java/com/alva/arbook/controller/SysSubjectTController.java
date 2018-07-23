package com.alva.arbook.controller;

import com.alva.arbook.entity.SysSubjectT;
import com.alva.arbook.service.SysSubjectTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aa")
public class SysSubjectTController {

    @Autowired
    private SysSubjectTService sysSubjectTService;
    @RequestMapping("/bb")
    public int insert(SysSubjectT record) {
//        try {
//            URLDecoder.decode(record.getSzCaption(),"utf-8");
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
        return sysSubjectTService.insert(record);
    }

}