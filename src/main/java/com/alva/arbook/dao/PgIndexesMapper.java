package com.alva.arbook.dao;

import com.alva.arbook.entity.PgIndexes;
import java.util.List;

public interface PgIndexesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_indexes
     *
     * @mbg.generated
     */
    int insert(PgIndexes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_indexes
     *
     * @mbg.generated
     */
    List<PgIndexes> selectAll();
}