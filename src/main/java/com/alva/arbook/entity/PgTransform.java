package com.alva.arbook.entity;

import java.io.Serializable;

public class PgTransform implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_transform.trftype
     *
     * @mbg.generated
     */
    private Long trftype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_transform.trflang
     *
     * @mbg.generated
     */
    private Long trflang;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_transform.trffromsql
     *
     * @mbg.generated
     */
    private Object trffromsql;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_transform.trftosql
     *
     * @mbg.generated
     */
    private Object trftosql;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pg_transform
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_transform.trftype
     *
     * @return the value of pg_transform.trftype
     *
     * @mbg.generated
     */
    public Long getTrftype() {
        return trftype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_transform.trftype
     *
     * @param trftype the value for pg_transform.trftype
     *
     * @mbg.generated
     */
    public void setTrftype(Long trftype) {
        this.trftype = trftype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_transform.trflang
     *
     * @return the value of pg_transform.trflang
     *
     * @mbg.generated
     */
    public Long getTrflang() {
        return trflang;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_transform.trflang
     *
     * @param trflang the value for pg_transform.trflang
     *
     * @mbg.generated
     */
    public void setTrflang(Long trflang) {
        this.trflang = trflang;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_transform.trffromsql
     *
     * @return the value of pg_transform.trffromsql
     *
     * @mbg.generated
     */
    public Object getTrffromsql() {
        return trffromsql;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_transform.trffromsql
     *
     * @param trffromsql the value for pg_transform.trffromsql
     *
     * @mbg.generated
     */
    public void setTrffromsql(Object trffromsql) {
        this.trffromsql = trffromsql;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_transform.trftosql
     *
     * @return the value of pg_transform.trftosql
     *
     * @mbg.generated
     */
    public Object getTrftosql() {
        return trftosql;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_transform.trftosql
     *
     * @param trftosql the value for pg_transform.trftosql
     *
     * @mbg.generated
     */
    public void setTrftosql(Object trftosql) {
        this.trftosql = trftosql;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_transform
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", trftype=").append(trftype);
        sb.append(", trflang=").append(trflang);
        sb.append(", trffromsql=").append(trffromsql);
        sb.append(", trftosql=").append(trftosql);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}