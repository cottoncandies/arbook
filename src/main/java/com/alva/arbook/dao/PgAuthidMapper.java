package com.alva.arbook.dao;

import com.alva.arbook.entity.PgAuthid;
import java.util.List;

public interface PgAuthidMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_authid
     *
     * @mbg.generated
     */
    int insert(PgAuthid record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_authid
     *
     * @mbg.generated
     */
    List<PgAuthid> selectAll();
}