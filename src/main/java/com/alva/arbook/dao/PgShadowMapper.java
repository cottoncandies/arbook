package com.alva.arbook.dao;

import com.alva.arbook.entity.PgShadow;
import java.util.List;

public interface PgShadowMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_shadow
     *
     * @mbg.generated
     */
    int insert(PgShadow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_shadow
     *
     * @mbg.generated
     */
    List<PgShadow> selectAll();
}