package com.alva.arbook.service;

import com.alva.arbook.entity.SysOrgT;

import java.util.List;

public interface SysOrgTService {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_org_t
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String szId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_org_t
     *
     * @mbg.generated
     */
    int insert(SysOrgT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_org_t
     *
     * @mbg.generated
     */
    SysOrgT selectByPrimaryKey(String szId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_org_t
     *
     * @mbg.generated
     */
    List<SysOrgT> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_org_t
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SysOrgT record);
}