package com.alva.arbook.service;

import com.alva.arbook.entity.AppKeyT;

import java.util.List;

public interface AppKeyTService{

    int deleteByPrimaryKey(String szId);

    int insert(AppKeyT record);

    AppKeyT selectByPrimaryKey(String szId);

    List<AppKeyT> selectAll();

    int updateByPrimaryKey(AppKeyT record);

    AppKeyT selectByAccessKey(String accessKey);
}