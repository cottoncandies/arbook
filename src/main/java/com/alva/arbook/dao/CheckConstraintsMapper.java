package com.alva.arbook.dao;

import com.alva.arbook.entity.CheckConstraints;
import java.util.List;

public interface CheckConstraintsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table check_constraints
     *
     * @mbg.generated
     */
    int insert(CheckConstraints record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table check_constraints
     *
     * @mbg.generated
     */
    List<CheckConstraints> selectAll();
}