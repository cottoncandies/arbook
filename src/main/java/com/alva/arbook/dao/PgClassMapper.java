package com.alva.arbook.dao;

import com.alva.arbook.entity.PgClass;
import java.util.List;

public interface PgClassMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_class
     *
     * @mbg.generated
     */
    int insert(PgClass record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_class
     *
     * @mbg.generated
     */
    List<PgClass> selectAll();
}