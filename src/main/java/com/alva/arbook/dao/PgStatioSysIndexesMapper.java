package com.alva.arbook.dao;

import com.alva.arbook.entity.PgStatioSysIndexes;
import java.util.List;

public interface PgStatioSysIndexesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_statio_sys_indexes
     *
     * @mbg.generated
     */
    int insert(PgStatioSysIndexes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_statio_sys_indexes
     *
     * @mbg.generated
     */
    List<PgStatioSysIndexes> selectAll();
}