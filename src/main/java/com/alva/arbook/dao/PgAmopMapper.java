package com.alva.arbook.dao;

import com.alva.arbook.entity.PgAmop;
import java.util.List;

public interface PgAmopMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_amop
     *
     * @mbg.generated
     */
    int insert(PgAmop record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_amop
     *
     * @mbg.generated
     */
    List<PgAmop> selectAll();
}