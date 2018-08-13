package com.alva.arbook.service.impl;

import com.alva.arbook.dao.AppKeyTMapper;
import com.alva.arbook.entity.AppKeyT;
import com.alva.arbook.service.AppKeyTService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AppKeyTServiceImpl implements AppKeyTService {

    @Resource
    private AppKeyTMapper appKeyTMapper;

    @Override
    public int deleteByPrimaryKey(String szId) {
        return 0;
    }

    @Override
    public int insert(AppKeyT record) {
        return 0;
    }

    @Override
    public AppKeyT selectByPrimaryKey(String szId) {
        return null;
    }

    @Override
    public List<AppKeyT> selectAll() {
        return null;
    }

    @Override
    public int updateByPrimaryKey(AppKeyT record) {
        return 0;
    }

    @Override
    public AppKeyT selectByAccessKey(String accessKey) {
        return appKeyTMapper.selectByAccessKey(accessKey);
    }
}