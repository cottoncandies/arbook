package com.alva.arbook.dao;

import com.alva.arbook.entity.SqlSizing;
import java.util.List;

public interface SqlSizingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sql_sizing
     *
     * @mbg.generated
     */
    int insert(SqlSizing record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sql_sizing
     *
     * @mbg.generated
     */
    List<SqlSizing> selectAll();
}