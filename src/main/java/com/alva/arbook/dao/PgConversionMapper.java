package com.alva.arbook.dao;

import com.alva.arbook.entity.PgConversion;
import java.util.List;

public interface PgConversionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_conversion
     *
     * @mbg.generated
     */
    int insert(PgConversion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_conversion
     *
     * @mbg.generated
     */
    List<PgConversion> selectAll();
}