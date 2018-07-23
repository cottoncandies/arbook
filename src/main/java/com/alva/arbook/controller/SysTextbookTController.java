package com.alva.arbook.controller;

import com.alva.arbook.service.SysTextbookTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/ApiV1")
public class SysTextbookTController {

    @Autowired
    private SysTextbookTService sysTextbookTService;

    @RequestMapping("GetIndex")
    public Map GetIndex(String ak,String sub,String pub,String s,String g,int p,int sz){
        Map<String,Object> map = new HashMap<>();





         return map;
    }
}