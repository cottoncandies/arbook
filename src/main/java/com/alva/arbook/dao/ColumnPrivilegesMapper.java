package com.alva.arbook.dao;

import com.alva.arbook.entity.ColumnPrivileges;
import java.util.List;

public interface ColumnPrivilegesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table column_privileges
     *
     * @mbg.generated
     */
    int insert(ColumnPrivileges record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table column_privileges
     *
     * @mbg.generated
     */
    List<ColumnPrivileges> selectAll();
}