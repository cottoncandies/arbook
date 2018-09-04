package com.alva.arbook.service.impl;

import com.alva.arbook.dao.SysPublishingTMapper;
import com.alva.arbook.entity.SysPublishingT;
import com.alva.arbook.service.SysPublishingTService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class SysPublishingTServiceImpl implements SysPublishingTService {

    @Resource
    private SysPublishingTMapper sysPublishingTMapper;

    @Override
    public int deleteByPrimaryKey(String szId) {
        return 0;
    }

    @Override
    public int insert(SysPublishingT record) {
        return 0;
    }

    @Override
    public SysPublishingT selectByPrimaryKey(String szId) {
        return null;
    }

    @Override
    public List<SysPublishingT> selectAll() {
        return sysPublishingTMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(SysPublishingT record) {
        return 0;
    }

    @Override
    public String selectIdByPublishName(String publishName) {
        return sysPublishingTMapper.selectIdByPublishName(publishName);
    }
}
