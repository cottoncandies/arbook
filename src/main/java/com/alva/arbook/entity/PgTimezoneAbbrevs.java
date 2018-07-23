package com.alva.arbook.entity;

import java.io.Serializable;

public class PgTimezoneAbbrevs implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_timezone_abbrevs.abbrev
     *
     * @mbg.generated
     */
    private String abbrev;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_timezone_abbrevs.utc_offset
     *
     * @mbg.generated
     */
    private Object utcOffset;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_timezone_abbrevs.is_dst
     *
     * @mbg.generated
     */
    private Boolean isDst;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pg_timezone_abbrevs
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_timezone_abbrevs.abbrev
     *
     * @return the value of pg_timezone_abbrevs.abbrev
     *
     * @mbg.generated
     */
    public String getAbbrev() {
        return abbrev;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_timezone_abbrevs.abbrev
     *
     * @param abbrev the value for pg_timezone_abbrevs.abbrev
     *
     * @mbg.generated
     */
    public void setAbbrev(String abbrev) {
        this.abbrev = abbrev == null ? null : abbrev.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_timezone_abbrevs.utc_offset
     *
     * @return the value of pg_timezone_abbrevs.utc_offset
     *
     * @mbg.generated
     */
    public Object getUtcOffset() {
        return utcOffset;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_timezone_abbrevs.utc_offset
     *
     * @param utcOffset the value for pg_timezone_abbrevs.utc_offset
     *
     * @mbg.generated
     */
    public void setUtcOffset(Object utcOffset) {
        this.utcOffset = utcOffset;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_timezone_abbrevs.is_dst
     *
     * @return the value of pg_timezone_abbrevs.is_dst
     *
     * @mbg.generated
     */
    public Boolean getIsDst() {
        return isDst;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_timezone_abbrevs.is_dst
     *
     * @param isDst the value for pg_timezone_abbrevs.is_dst
     *
     * @mbg.generated
     */
    public void setIsDst(Boolean isDst) {
        this.isDst = isDst;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_timezone_abbrevs
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", abbrev=").append(abbrev);
        sb.append(", utcOffset=").append(utcOffset);
        sb.append(", isDst=").append(isDst);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}