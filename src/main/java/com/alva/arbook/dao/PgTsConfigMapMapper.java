package com.alva.arbook.dao;

import com.alva.arbook.entity.PgTsConfigMap;
import java.util.List;

public interface PgTsConfigMapMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_ts_config_map
     *
     * @mbg.generated
     */
    int insert(PgTsConfigMap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_ts_config_map
     *
     * @mbg.generated
     */
    List<PgTsConfigMap> selectAll();
}