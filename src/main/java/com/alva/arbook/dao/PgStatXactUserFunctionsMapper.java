package com.alva.arbook.dao;

import com.alva.arbook.entity.PgStatXactUserFunctions;
import java.util.List;

public interface PgStatXactUserFunctionsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_stat_xact_user_functions
     *
     * @mbg.generated
     */
    int insert(PgStatXactUserFunctions record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_stat_xact_user_functions
     *
     * @mbg.generated
     */
    List<PgStatXactUserFunctions> selectAll();
}