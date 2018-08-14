package com.alva.arbook.service.impl;

import com.alva.arbook.dao.SysPublishingTMapper;
import com.alva.arbook.service.SysPublishingTService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SysPublishingTServiceImpl implements SysPublishingTService {

    @Resource
    private SysPublishingTMapper sysPublishingTMapper;

    @Override
    public String selectIdByPublishName(String publishName) {
        return sysPublishingTMapper.selectIdByPublishName(publishName);
    }
}
