package com.alva.arbook.dao;

import com.alva.arbook.entity.PgExtension;
import java.util.List;

public interface PgExtensionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_extension
     *
     * @mbg.generated
     */
    int insert(PgExtension record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_extension
     *
     * @mbg.generated
     */
    List<PgExtension> selectAll();
}