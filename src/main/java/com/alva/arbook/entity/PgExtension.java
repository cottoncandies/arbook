package com.alva.arbook.entity;

import java.io.Serializable;

public class PgExtension implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_extension.extname
     *
     * @mbg.generated
     */
    private String extname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_extension.extowner
     *
     * @mbg.generated
     */
    private Long extowner;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_extension.extnamespace
     *
     * @mbg.generated
     */
    private Long extnamespace;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_extension.extrelocatable
     *
     * @mbg.generated
     */
    private Boolean extrelocatable;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_extension.extversion
     *
     * @mbg.generated
     */
    private String extversion;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_extension.extconfig
     *
     * @mbg.generated
     */
    private Object extconfig;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_extension.extcondition
     *
     * @mbg.generated
     */
    private Object extcondition;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pg_extension
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_extension.extname
     *
     * @return the value of pg_extension.extname
     *
     * @mbg.generated
     */
    public String getExtname() {
        return extname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_extension.extname
     *
     * @param extname the value for pg_extension.extname
     *
     * @mbg.generated
     */
    public void setExtname(String extname) {
        this.extname = extname == null ? null : extname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_extension.extowner
     *
     * @return the value of pg_extension.extowner
     *
     * @mbg.generated
     */
    public Long getExtowner() {
        return extowner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_extension.extowner
     *
     * @param extowner the value for pg_extension.extowner
     *
     * @mbg.generated
     */
    public void setExtowner(Long extowner) {
        this.extowner = extowner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_extension.extnamespace
     *
     * @return the value of pg_extension.extnamespace
     *
     * @mbg.generated
     */
    public Long getExtnamespace() {
        return extnamespace;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_extension.extnamespace
     *
     * @param extnamespace the value for pg_extension.extnamespace
     *
     * @mbg.generated
     */
    public void setExtnamespace(Long extnamespace) {
        this.extnamespace = extnamespace;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_extension.extrelocatable
     *
     * @return the value of pg_extension.extrelocatable
     *
     * @mbg.generated
     */
    public Boolean getExtrelocatable() {
        return extrelocatable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_extension.extrelocatable
     *
     * @param extrelocatable the value for pg_extension.extrelocatable
     *
     * @mbg.generated
     */
    public void setExtrelocatable(Boolean extrelocatable) {
        this.extrelocatable = extrelocatable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_extension.extversion
     *
     * @return the value of pg_extension.extversion
     *
     * @mbg.generated
     */
    public String getExtversion() {
        return extversion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_extension.extversion
     *
     * @param extversion the value for pg_extension.extversion
     *
     * @mbg.generated
     */
    public void setExtversion(String extversion) {
        this.extversion = extversion == null ? null : extversion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_extension.extconfig
     *
     * @return the value of pg_extension.extconfig
     *
     * @mbg.generated
     */
    public Object getExtconfig() {
        return extconfig;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_extension.extconfig
     *
     * @param extconfig the value for pg_extension.extconfig
     *
     * @mbg.generated
     */
    public void setExtconfig(Object extconfig) {
        this.extconfig = extconfig;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_extension.extcondition
     *
     * @return the value of pg_extension.extcondition
     *
     * @mbg.generated
     */
    public Object getExtcondition() {
        return extcondition;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_extension.extcondition
     *
     * @param extcondition the value for pg_extension.extcondition
     *
     * @mbg.generated
     */
    public void setExtcondition(Object extcondition) {
        this.extcondition = extcondition;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_extension
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", extname=").append(extname);
        sb.append(", extowner=").append(extowner);
        sb.append(", extnamespace=").append(extnamespace);
        sb.append(", extrelocatable=").append(extrelocatable);
        sb.append(", extversion=").append(extversion);
        sb.append(", extconfig=").append(extconfig);
        sb.append(", extcondition=").append(extcondition);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}