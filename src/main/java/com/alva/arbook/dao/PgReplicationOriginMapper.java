package com.alva.arbook.dao;

import com.alva.arbook.entity.PgReplicationOrigin;
import java.util.List;

public interface PgReplicationOriginMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_replication_origin
     *
     * @mbg.generated
     */
    int insert(PgReplicationOrigin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_replication_origin
     *
     * @mbg.generated
     */
    List<PgReplicationOrigin> selectAll();
}