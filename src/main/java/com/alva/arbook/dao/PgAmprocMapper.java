package com.alva.arbook.dao;

import com.alva.arbook.entity.PgAmproc;
import java.util.List;

public interface PgAmprocMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_amproc
     *
     * @mbg.generated
     */
    int insert(PgAmproc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_amproc
     *
     * @mbg.generated
     */
    List<PgAmproc> selectAll();
}