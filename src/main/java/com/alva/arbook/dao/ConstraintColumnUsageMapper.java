package com.alva.arbook.dao;

import com.alva.arbook.entity.ConstraintColumnUsage;
import java.util.List;

public interface ConstraintColumnUsageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table constraint_column_usage
     *
     * @mbg.generated
     */
    int insert(ConstraintColumnUsage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table constraint_column_usage
     *
     * @mbg.generated
     */
    List<ConstraintColumnUsage> selectAll();
}