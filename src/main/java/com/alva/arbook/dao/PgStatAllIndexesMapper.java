package com.alva.arbook.dao;

import com.alva.arbook.entity.PgStatAllIndexes;
import java.util.List;

public interface PgStatAllIndexesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_stat_all_indexes
     *
     * @mbg.generated
     */
    int insert(PgStatAllIndexes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_stat_all_indexes
     *
     * @mbg.generated
     */
    List<PgStatAllIndexes> selectAll();
}