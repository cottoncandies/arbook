package com.alva.arbook.dao;

import com.alva.arbook.entity.PgAttrdef;
import java.util.List;

public interface PgAttrdefMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_attrdef
     *
     * @mbg.generated
     */
    int insert(PgAttrdef record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_attrdef
     *
     * @mbg.generated
     */
    List<PgAttrdef> selectAll();
}