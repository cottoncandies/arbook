package com.alva.arbook.dao;

import com.alva.arbook.entity.SysExportT;

import java.util.List;

public interface SysExportTMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_export_t
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String szId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_export_t
     *
     * @mbg.generated
     */
    int insert(SysExportT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_export_t
     *
     * @mbg.generated
     */
    SysExportT selectByPrimaryKey(Integer szId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_export_t
     *
     * @mbg.generated
     */
    List<SysExportT> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_export_t
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SysExportT record);

    // 查询目录是否存在
    SysExportT selectByDirectory(String szDirectory);

}