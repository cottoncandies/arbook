package com.alva.arbook.dao;

import com.alva.arbook.entity.PgStatisticExt;
import java.util.List;

public interface PgStatisticExtMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_statistic_ext
     *
     * @mbg.generated
     */
    int insert(PgStatisticExt record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_statistic_ext
     *
     * @mbg.generated
     */
    List<PgStatisticExt> selectAll();
}