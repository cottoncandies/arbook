package com.alva.arbook.dao;

import com.alva.arbook.entity.PgEventTrigger;
import java.util.List;

public interface PgEventTriggerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_event_trigger
     *
     * @mbg.generated
     */
    int insert(PgEventTrigger record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_event_trigger
     *
     * @mbg.generated
     */
    List<PgEventTrigger> selectAll();
}