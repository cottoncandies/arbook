package com.alva.arbook.entity;

import java.io.Serializable;

public class PgStatioUserSequences implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_statio_user_sequences.relid
     *
     * @mbg.generated
     */
    private Long relid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_statio_user_sequences.schemaname
     *
     * @mbg.generated
     */
    private String schemaname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_statio_user_sequences.relname
     *
     * @mbg.generated
     */
    private String relname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_statio_user_sequences.blks_read
     *
     * @mbg.generated
     */
    private Long blksRead;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_statio_user_sequences.blks_hit
     *
     * @mbg.generated
     */
    private Long blksHit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pg_statio_user_sequences
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_statio_user_sequences.relid
     *
     * @return the value of pg_statio_user_sequences.relid
     *
     * @mbg.generated
     */
    public Long getRelid() {
        return relid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_statio_user_sequences.relid
     *
     * @param relid the value for pg_statio_user_sequences.relid
     *
     * @mbg.generated
     */
    public void setRelid(Long relid) {
        this.relid = relid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_statio_user_sequences.schemaname
     *
     * @return the value of pg_statio_user_sequences.schemaname
     *
     * @mbg.generated
     */
    public String getSchemaname() {
        return schemaname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_statio_user_sequences.schemaname
     *
     * @param schemaname the value for pg_statio_user_sequences.schemaname
     *
     * @mbg.generated
     */
    public void setSchemaname(String schemaname) {
        this.schemaname = schemaname == null ? null : schemaname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_statio_user_sequences.relname
     *
     * @return the value of pg_statio_user_sequences.relname
     *
     * @mbg.generated
     */
    public String getRelname() {
        return relname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_statio_user_sequences.relname
     *
     * @param relname the value for pg_statio_user_sequences.relname
     *
     * @mbg.generated
     */
    public void setRelname(String relname) {
        this.relname = relname == null ? null : relname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_statio_user_sequences.blks_read
     *
     * @return the value of pg_statio_user_sequences.blks_read
     *
     * @mbg.generated
     */
    public Long getBlksRead() {
        return blksRead;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_statio_user_sequences.blks_read
     *
     * @param blksRead the value for pg_statio_user_sequences.blks_read
     *
     * @mbg.generated
     */
    public void setBlksRead(Long blksRead) {
        this.blksRead = blksRead;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_statio_user_sequences.blks_hit
     *
     * @return the value of pg_statio_user_sequences.blks_hit
     *
     * @mbg.generated
     */
    public Long getBlksHit() {
        return blksHit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_statio_user_sequences.blks_hit
     *
     * @param blksHit the value for pg_statio_user_sequences.blks_hit
     *
     * @mbg.generated
     */
    public void setBlksHit(Long blksHit) {
        this.blksHit = blksHit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_statio_user_sequences
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
        sb.append(", schemaname=").append(schemaname);
        sb.append(", relname=").append(relname);
        sb.append(", blksRead=").append(blksRead);
        sb.append(", blksHit=").append(blksHit);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}