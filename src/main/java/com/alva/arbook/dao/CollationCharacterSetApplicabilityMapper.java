package com.alva.arbook.dao;

import com.alva.arbook.entity.CollationCharacterSetApplicability;
import java.util.List;

public interface CollationCharacterSetApplicabilityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collation_character_set_applicability
     *
     * @mbg.generated
     */
    int insert(CollationCharacterSetApplicability record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collation_character_set_applicability
     *
     * @mbg.generated
     */
    List<CollationCharacterSetApplicability> selectAll();
}