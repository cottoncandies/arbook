package com.alva.arbook.dao;

import com.alva.arbook.entity.PgInherits;
import java.util.List;

public interface PgInheritsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_inherits
     *
     * @mbg.generated
     */
    int insert(PgInherits record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_inherits
     *
     * @mbg.generated
     */
    List<PgInherits> selectAll();
}