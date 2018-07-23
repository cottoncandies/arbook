package com.alva.arbook.dao;

import com.alva.arbook.entity.AppKeyT;
import java.util.List;

public interface AppKeyTMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_key_t
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String szId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_key_t
     *
     * @mbg.generated
     */
    int insert(AppKeyT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_key_t
     *
     * @mbg.generated
     */
    AppKeyT selectByPrimaryKey(String szId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_key_t
     *
     * @mbg.generated
     */
    List<AppKeyT> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_key_t
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(AppKeyT record);
}