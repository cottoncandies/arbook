package com.alva.arbook.entity;

import java.io.Serializable;

public class PgRange implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_range.rngtypid
     *
     * @mbg.generated
     */
    private Long rngtypid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_range.rngsubtype
     *
     * @mbg.generated
     */
    private Long rngsubtype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_range.rngcollation
     *
     * @mbg.generated
     */
    private Long rngcollation;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_range.rngsubopc
     *
     * @mbg.generated
     */
    private Long rngsubopc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_range.rngcanonical
     *
     * @mbg.generated
     */
    private Object rngcanonical;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_range.rngsubdiff
     *
     * @mbg.generated
     */
    private Object rngsubdiff;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pg_range
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_range.rngtypid
     *
     * @return the value of pg_range.rngtypid
     *
     * @mbg.generated
     */
    public Long getRngtypid() {
        return rngtypid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_range.rngtypid
     *
     * @param rngtypid the value for pg_range.rngtypid
     *
     * @mbg.generated
     */
    public void setRngtypid(Long rngtypid) {
        this.rngtypid = rngtypid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_range.rngsubtype
     *
     * @return the value of pg_range.rngsubtype
     *
     * @mbg.generated
     */
    public Long getRngsubtype() {
        return rngsubtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_range.rngsubtype
     *
     * @param rngsubtype the value for pg_range.rngsubtype
     *
     * @mbg.generated
     */
    public void setRngsubtype(Long rngsubtype) {
        this.rngsubtype = rngsubtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_range.rngcollation
     *
     * @return the value of pg_range.rngcollation
     *
     * @mbg.generated
     */
    public Long getRngcollation() {
        return rngcollation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_range.rngcollation
     *
     * @param rngcollation the value for pg_range.rngcollation
     *
     * @mbg.generated
     */
    public void setRngcollation(Long rngcollation) {
        this.rngcollation = rngcollation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_range.rngsubopc
     *
     * @return the value of pg_range.rngsubopc
     *
     * @mbg.generated
     */
    public Long getRngsubopc() {
        return rngsubopc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_range.rngsubopc
     *
     * @param rngsubopc the value for pg_range.rngsubopc
     *
     * @mbg.generated
     */
    public void setRngsubopc(Long rngsubopc) {
        this.rngsubopc = rngsubopc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_range.rngcanonical
     *
     * @return the value of pg_range.rngcanonical
     *
     * @mbg.generated
     */
    public Object getRngcanonical() {
        return rngcanonical;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_range.rngcanonical
     *
     * @param rngcanonical the value for pg_range.rngcanonical
     *
     * @mbg.generated
     */
    public void setRngcanonical(Object rngcanonical) {
        this.rngcanonical = rngcanonical;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_range.rngsubdiff
     *
     * @return the value of pg_range.rngsubdiff
     *
     * @mbg.generated
     */
    public Object getRngsubdiff() {
        return rngsubdiff;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_range.rngsubdiff
     *
     * @param rngsubdiff the value for pg_range.rngsubdiff
     *
     * @mbg.generated
     */
    public void setRngsubdiff(Object rngsubdiff) {
        this.rngsubdiff = rngsubdiff;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_range
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rngtypid=").append(rngtypid);
        sb.append(", rngsubtype=").append(rngsubtype);
        sb.append(", rngcollation=").append(rngcollation);
        sb.append(", rngsubopc=").append(rngsubopc);
        sb.append(", rngcanonical=").append(rngcanonical);
        sb.append(", rngsubdiff=").append(rngsubdiff);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}