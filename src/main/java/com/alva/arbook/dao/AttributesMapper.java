package com.alva.arbook.dao;

import com.alva.arbook.entity.Attributes;
import java.util.List;

public interface AttributesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attributes
     *
     * @mbg.generated
     */
    int insert(Attributes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attributes
     *
     * @mbg.generated
     */
    List<Attributes> selectAll();
}