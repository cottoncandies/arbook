package com.alva.arbook.dao;

import com.alva.arbook.entity.PgSettings;
import java.util.List;

public interface PgSettingsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_settings
     *
     * @mbg.generated
     */
    int insert(PgSettings record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_settings
     *
     * @mbg.generated
     */
    List<PgSettings> selectAll();
}