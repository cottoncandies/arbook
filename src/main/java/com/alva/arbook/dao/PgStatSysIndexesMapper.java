package com.alva.arbook.dao;

import com.alva.arbook.entity.PgStatSysIndexes;
import java.util.List;

public interface PgStatSysIndexesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_stat_sys_indexes
     *
     * @mbg.generated
     */
    int insert(PgStatSysIndexes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_stat_sys_indexes
     *
     * @mbg.generated
     */
    List<PgStatSysIndexes> selectAll();
}