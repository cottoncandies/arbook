package com.alva.arbook.entity;

import java.io.Serializable;

public class PgMatviews implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_matviews.schemaname
     *
     * @mbg.generated
     */
    private String schemaname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_matviews.matviewname
     *
     * @mbg.generated
     */
    private String matviewname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_matviews.matviewowner
     *
     * @mbg.generated
     */
    private String matviewowner;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_matviews.tablespace
     *
     * @mbg.generated
     */
    private String tablespace;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_matviews.hasindexes
     *
     * @mbg.generated
     */
    private Boolean hasindexes;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_matviews.ispopulated
     *
     * @mbg.generated
     */
    private Boolean ispopulated;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_matviews.definition
     *
     * @mbg.generated
     */
    private String definition;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pg_matviews
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_matviews.schemaname
     *
     * @return the value of pg_matviews.schemaname
     *
     * @mbg.generated
     */
    public String getSchemaname() {
        return schemaname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_matviews.schemaname
     *
     * @param schemaname the value for pg_matviews.schemaname
     *
     * @mbg.generated
     */
    public void setSchemaname(String schemaname) {
        this.schemaname = schemaname == null ? null : schemaname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_matviews.matviewname
     *
     * @return the value of pg_matviews.matviewname
     *
     * @mbg.generated
     */
    public String getMatviewname() {
        return matviewname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_matviews.matviewname
     *
     * @param matviewname the value for pg_matviews.matviewname
     *
     * @mbg.generated
     */
    public void setMatviewname(String matviewname) {
        this.matviewname = matviewname == null ? null : matviewname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_matviews.matviewowner
     *
     * @return the value of pg_matviews.matviewowner
     *
     * @mbg.generated
     */
    public String getMatviewowner() {
        return matviewowner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_matviews.matviewowner
     *
     * @param matviewowner the value for pg_matviews.matviewowner
     *
     * @mbg.generated
     */
    public void setMatviewowner(String matviewowner) {
        this.matviewowner = matviewowner == null ? null : matviewowner.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_matviews.tablespace
     *
     * @return the value of pg_matviews.tablespace
     *
     * @mbg.generated
     */
    public String getTablespace() {
        return tablespace;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_matviews.tablespace
     *
     * @param tablespace the value for pg_matviews.tablespace
     *
     * @mbg.generated
     */
    public void setTablespace(String tablespace) {
        this.tablespace = tablespace == null ? null : tablespace.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_matviews.hasindexes
     *
     * @return the value of pg_matviews.hasindexes
     *
     * @mbg.generated
     */
    public Boolean getHasindexes() {
        return hasindexes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_matviews.hasindexes
     *
     * @param hasindexes the value for pg_matviews.hasindexes
     *
     * @mbg.generated
     */
    public void setHasindexes(Boolean hasindexes) {
        this.hasindexes = hasindexes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_matviews.ispopulated
     *
     * @return the value of pg_matviews.ispopulated
     *
     * @mbg.generated
     */
    public Boolean getIspopulated() {
        return ispopulated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_matviews.ispopulated
     *
     * @param ispopulated the value for pg_matviews.ispopulated
     *
     * @mbg.generated
     */
    public void setIspopulated(Boolean ispopulated) {
        this.ispopulated = ispopulated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_matviews.definition
     *
     * @return the value of pg_matviews.definition
     *
     * @mbg.generated
     */
    public String getDefinition() {
        return definition;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_matviews.definition
     *
     * @param definition the value for pg_matviews.definition
     *
     * @mbg.generated
     */
    public void setDefinition(String definition) {
        this.definition = definition == null ? null : definition.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_matviews
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", schemaname=").append(schemaname);
        sb.append(", matviewname=").append(matviewname);
        sb.append(", matviewowner=").append(matviewowner);
        sb.append(", tablespace=").append(tablespace);
        sb.append(", hasindexes=").append(hasindexes);
        sb.append(", ispopulated=").append(ispopulated);
        sb.append(", definition=").append(definition);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}