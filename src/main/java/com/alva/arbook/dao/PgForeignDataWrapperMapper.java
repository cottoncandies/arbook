package com.alva.arbook.dao;

import com.alva.arbook.entity.PgForeignDataWrapper;
import java.util.List;

public interface PgForeignDataWrapperMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_foreign_data_wrapper
     *
     * @mbg.generated
     */
    int insert(PgForeignDataWrapper record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_foreign_data_wrapper
     *
     * @mbg.generated
     */
    List<PgForeignDataWrapper> selectAll();
}