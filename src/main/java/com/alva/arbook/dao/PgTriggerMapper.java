package com.alva.arbook.dao;

import com.alva.arbook.entity.PgTrigger;
import java.util.List;

public interface PgTriggerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_trigger
     *
     * @mbg.generated
     */
    int insert(PgTrigger record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_trigger
     *
     * @mbg.generated
     */
    List<PgTrigger> selectAll();
}