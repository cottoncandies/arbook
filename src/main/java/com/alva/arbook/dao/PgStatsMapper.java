package com.alva.arbook.dao;

import com.alva.arbook.entity.PgStats;
import java.util.List;

public interface PgStatsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_stats
     *
     * @mbg.generated
     */
    int insert(PgStats record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_stats
     *
     * @mbg.generated
     */
    List<PgStats> selectAll();
}