package com.alva.arbook.dao;

import com.alva.arbook.entity.PgStatistic;
import java.util.List;

public interface PgStatisticMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_statistic
     *
     * @mbg.generated
     */
    int insert(PgStatistic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_statistic
     *
     * @mbg.generated
     */
    List<PgStatistic> selectAll();
}