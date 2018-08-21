package com.alva.arbook.service;

import com.alva.arbook.entity.SysPublishingT;

import java.util.List;

public interface SysPublishingTService {

    int deleteByPrimaryKey(String szId);

    int insert(SysPublishingT record);

    SysPublishingT selectByPrimaryKey(String szId);

    List<SysPublishingT> selectAll();

    int updateByPrimaryKey(SysPublishingT record);

    // 根据出版社名查询出版社id
    String selectIdByPublishName(String publishName);

}
