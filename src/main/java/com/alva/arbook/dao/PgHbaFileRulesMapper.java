package com.alva.arbook.dao;

import com.alva.arbook.entity.PgHbaFileRules;
import java.util.List;

public interface PgHbaFileRulesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_hba_file_rules
     *
     * @mbg.generated
     */
    int insert(PgHbaFileRules record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_hba_file_rules
     *
     * @mbg.generated
     */
    List<PgHbaFileRules> selectAll();
}