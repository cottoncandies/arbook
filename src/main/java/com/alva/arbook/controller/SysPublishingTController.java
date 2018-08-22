package com.alva.arbook.controller;

import com.alva.arbook.entity.SysPublishingT;
import com.alva.arbook.service.SysPublishingTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SysPublishingTController {

    @Autowired
    private SysPublishingTService sysPublishingTService;

    @RequestMapping("selectPublish")
    public List<SysPublishingT> selectSubject() {
        return sysPublishingTService.selectAll();
    }
}
