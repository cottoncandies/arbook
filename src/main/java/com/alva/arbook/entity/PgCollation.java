package com.alva.arbook.entity;

import java.io.Serializable;

public class PgCollation implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_collation.collname
     *
     * @mbg.generated
     */
    private String collname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_collation.collnamespace
     *
     * @mbg.generated
     */
    private Long collnamespace;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_collation.collowner
     *
     * @mbg.generated
     */
    private Long collowner;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_collation.collprovider
     *
     * @mbg.generated
     */
    private String collprovider;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_collation.collencoding
     *
     * @mbg.generated
     */
    private Integer collencoding;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_collation.collcollate
     *
     * @mbg.generated
     */
    private String collcollate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_collation.collctype
     *
     * @mbg.generated
     */
    private String collctype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_collation.collversion
     *
     * @mbg.generated
     */
    private String collversion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pg_collation
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_collation.collname
     *
     * @return the value of pg_collation.collname
     *
     * @mbg.generated
     */
    public String getCollname() {
        return collname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_collation.collname
     *
     * @param collname the value for pg_collation.collname
     *
     * @mbg.generated
     */
    public void setCollname(String collname) {
        this.collname = collname == null ? null : collname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_collation.collnamespace
     *
     * @return the value of pg_collation.collnamespace
     *
     * @mbg.generated
     */
    public Long getCollnamespace() {
        return collnamespace;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_collation.collnamespace
     *
     * @param collnamespace the value for pg_collation.collnamespace
     *
     * @mbg.generated
     */
    public void setCollnamespace(Long collnamespace) {
        this.collnamespace = collnamespace;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_collation.collowner
     *
     * @return the value of pg_collation.collowner
     *
     * @mbg.generated
     */
    public Long getCollowner() {
        return collowner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_collation.collowner
     *
     * @param collowner the value for pg_collation.collowner
     *
     * @mbg.generated
     */
    public void setCollowner(Long collowner) {
        this.collowner = collowner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_collation.collprovider
     *
     * @return the value of pg_collation.collprovider
     *
     * @mbg.generated
     */
    public String getCollprovider() {
        return collprovider;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_collation.collprovider
     *
     * @param collprovider the value for pg_collation.collprovider
     *
     * @mbg.generated
     */
    public void setCollprovider(String collprovider) {
        this.collprovider = collprovider == null ? null : collprovider.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_collation.collencoding
     *
     * @return the value of pg_collation.collencoding
     *
     * @mbg.generated
     */
    public Integer getCollencoding() {
        return collencoding;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_collation.collencoding
     *
     * @param collencoding the value for pg_collation.collencoding
     *
     * @mbg.generated
     */
    public void setCollencoding(Integer collencoding) {
        this.collencoding = collencoding;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_collation.collcollate
     *
     * @return the value of pg_collation.collcollate
     *
     * @mbg.generated
     */
    public String getCollcollate() {
        return collcollate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_collation.collcollate
     *
     * @param collcollate the value for pg_collation.collcollate
     *
     * @mbg.generated
     */
    public void setCollcollate(String collcollate) {
        this.collcollate = collcollate == null ? null : collcollate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_collation.collctype
     *
     * @return the value of pg_collation.collctype
     *
     * @mbg.generated
     */
    public String getCollctype() {
        return collctype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_collation.collctype
     *
     * @param collctype the value for pg_collation.collctype
     *
     * @mbg.generated
     */
    public void setCollctype(String collctype) {
        this.collctype = collctype == null ? null : collctype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_collation.collversion
     *
     * @return the value of pg_collation.collversion
     *
     * @mbg.generated
     */
    public String getCollversion() {
        return collversion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_collation.collversion
     *
     * @param collversion the value for pg_collation.collversion
     *
     * @mbg.generated
     */
    public void setCollversion(String collversion) {
        this.collversion = collversion == null ? null : collversion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_collation
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", collname=").append(collname);
        sb.append(", collnamespace=").append(collnamespace);
        sb.append(", collowner=").append(collowner);
        sb.append(", collprovider=").append(collprovider);
        sb.append(", collencoding=").append(collencoding);
        sb.append(", collcollate=").append(collcollate);
        sb.append(", collctype=").append(collctype);
        sb.append(", collversion=").append(collversion);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}