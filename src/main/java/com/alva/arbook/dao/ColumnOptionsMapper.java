package com.alva.arbook.dao;

import com.alva.arbook.entity.ColumnOptions;
import java.util.List;

public interface ColumnOptionsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table column_options
     *
     * @mbg.generated
     */
    int insert(ColumnOptions record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table column_options
     *
     * @mbg.generated
     */
    List<ColumnOptions> selectAll();
}