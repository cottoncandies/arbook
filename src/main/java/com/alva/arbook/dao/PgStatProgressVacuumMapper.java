package com.alva.arbook.dao;

import com.alva.arbook.entity.PgStatProgressVacuum;
import java.util.List;

public interface PgStatProgressVacuumMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_stat_progress_vacuum
     *
     * @mbg.generated
     */
    int insert(PgStatProgressVacuum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_stat_progress_vacuum
     *
     * @mbg.generated
     */
    List<PgStatProgressVacuum> selectAll();
}