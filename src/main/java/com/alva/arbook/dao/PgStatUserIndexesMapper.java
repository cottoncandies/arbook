package com.alva.arbook.dao;

import com.alva.arbook.entity.PgStatUserIndexes;
import java.util.List;

public interface PgStatUserIndexesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_stat_user_indexes
     *
     * @mbg.generated
     */
    int insert(PgStatUserIndexes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_stat_user_indexes
     *
     * @mbg.generated
     */
    List<PgStatUserIndexes> selectAll();
}