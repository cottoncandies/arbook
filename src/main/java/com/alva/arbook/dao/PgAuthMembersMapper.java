package com.alva.arbook.dao;

import com.alva.arbook.entity.PgAuthMembers;
import java.util.List;

public interface PgAuthMembersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_auth_members
     *
     * @mbg.generated
     */
    int insert(PgAuthMembers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_auth_members
     *
     * @mbg.generated
     */
    List<PgAuthMembers> selectAll();
}