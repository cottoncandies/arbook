package com.alva.arbook.dao;

import com.alva.arbook.entity.SqlSizingProfiles;
import java.util.List;

public interface SqlSizingProfilesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sql_sizing_profiles
     *
     * @mbg.generated
     */
    int insert(SqlSizingProfiles record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sql_sizing_profiles
     *
     * @mbg.generated
     */
    List<SqlSizingProfiles> selectAll();
}