package com.alva.arbook.dao;

import com.alva.arbook.entity.AdministrableRoleAuthorizations;
import java.util.List;

public interface AdministrableRoleAuthorizationsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table administrable_role_authorizations
     *
     * @mbg.generated
     */
    int insert(AdministrableRoleAuthorizations record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table administrable_role_authorizations
     *
     * @mbg.generated
     */
    List<AdministrableRoleAuthorizations> selectAll();
}