package com.alva.arbook.dao;

import com.alva.arbook.entity.Parameters;
import java.util.List;

public interface ParametersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parameters
     *
     * @mbg.generated
     */
    int insert(Parameters record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parameters
     *
     * @mbg.generated
     */
    List<Parameters> selectAll();
}