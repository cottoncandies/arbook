package com.alva.arbook.dao;

import com.alva.arbook.entity.SqlImplementationInfo;
import java.util.List;

public interface SqlImplementationInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sql_implementation_info
     *
     * @mbg.generated
     */
    int insert(SqlImplementationInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sql_implementation_info
     *
     * @mbg.generated
     */
    List<SqlImplementationInfo> selectAll();
}