package com.alva.arbook.entity;

import java.io.Serializable;

public class PgStatioSysIndexes implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_statio_sys_indexes.relid
     *
     * @mbg.generated
     */
    private Long relid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_statio_sys_indexes.indexrelid
     *
     * @mbg.generated
     */
    private Long indexrelid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_statio_sys_indexes.schemaname
     *
     * @mbg.generated
     */
    private String schemaname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_statio_sys_indexes.relname
     *
     * @mbg.generated
     */
    private String relname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_statio_sys_indexes.indexrelname
     *
     * @mbg.generated
     */
    private String indexrelname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_statio_sys_indexes.idx_blks_read
     *
     * @mbg.generated
     */
    private Long idxBlksRead;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_statio_sys_indexes.idx_blks_hit
     *
     * @mbg.generated
     */
    private Long idxBlksHit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pg_statio_sys_indexes
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_statio_sys_indexes.relid
     *
     * @return the value of pg_statio_sys_indexes.relid
     *
     * @mbg.generated
     */
    public Long getRelid() {
        return relid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_statio_sys_indexes.relid
     *
     * @param relid the value for pg_statio_sys_indexes.relid
     *
     * @mbg.generated
     */
    public void setRelid(Long relid) {
        this.relid = relid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_statio_sys_indexes.indexrelid
     *
     * @return the value of pg_statio_sys_indexes.indexrelid
     *
     * @mbg.generated
     */
    public Long getIndexrelid() {
        return indexrelid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_statio_sys_indexes.indexrelid
     *
     * @param indexrelid the value for pg_statio_sys_indexes.indexrelid
     *
     * @mbg.generated
     */
    public void setIndexrelid(Long indexrelid) {
        this.indexrelid = indexrelid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_statio_sys_indexes.schemaname
     *
     * @return the value of pg_statio_sys_indexes.schemaname
     *
     * @mbg.generated
     */
    public String getSchemaname() {
        return schemaname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_statio_sys_indexes.schemaname
     *
     * @param schemaname the value for pg_statio_sys_indexes.schemaname
     *
     * @mbg.generated
     */
    public void setSchemaname(String schemaname) {
        this.schemaname = schemaname == null ? null : schemaname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_statio_sys_indexes.relname
     *
     * @return the value of pg_statio_sys_indexes.relname
     *
     * @mbg.generated
     */
    public String getRelname() {
        return relname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_statio_sys_indexes.relname
     *
     * @param relname the value for pg_statio_sys_indexes.relname
     *
     * @mbg.generated
     */
    public void setRelname(String relname) {
        this.relname = relname == null ? null : relname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_statio_sys_indexes.indexrelname
     *
     * @return the value of pg_statio_sys_indexes.indexrelname
     *
     * @mbg.generated
     */
    public String getIndexrelname() {
        return indexrelname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_statio_sys_indexes.indexrelname
     *
     * @param indexrelname the value for pg_statio_sys_indexes.indexrelname
     *
     * @mbg.generated
     */
    public void setIndexrelname(String indexrelname) {
        this.indexrelname = indexrelname == null ? null : indexrelname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_statio_sys_indexes.idx_blks_read
     *
     * @return the value of pg_statio_sys_indexes.idx_blks_read
     *
     * @mbg.generated
     */
    public Long getIdxBlksRead() {
        return idxBlksRead;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_statio_sys_indexes.idx_blks_read
     *
     * @param idxBlksRead the value for pg_statio_sys_indexes.idx_blks_read
     *
     * @mbg.generated
     */
    public void setIdxBlksRead(Long idxBlksRead) {
        this.idxBlksRead = idxBlksRead;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_statio_sys_indexes.idx_blks_hit
     *
     * @return the value of pg_statio_sys_indexes.idx_blks_hit
     *
     * @mbg.generated
     */
    public Long getIdxBlksHit() {
        return idxBlksHit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_statio_sys_indexes.idx_blks_hit
     *
     * @param idxBlksHit the value for pg_statio_sys_indexes.idx_blks_hit
     *
     * @mbg.generated
     */
    public void setIdxBlksHit(Long idxBlksHit) {
        this.idxBlksHit = idxBlksHit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_statio_sys_indexes
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", relid=").append(relid);
        sb.append(", indexrelid=").append(indexrelid);
        sb.append(", schemaname=").append(schemaname);
        sb.append(", relname=").append(relname);
        sb.append(", indexrelname=").append(indexrelname);
        sb.append(", idxBlksRead=").append(idxBlksRead);
        sb.append(", idxBlksHit=").append(idxBlksHit);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}