package com.alva.arbook.entity;

import java.io.Serializable;

public class PgSubscriptionRel implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_subscription_rel.srsubid
     *
     * @mbg.generated
     */
    private Long srsubid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_subscription_rel.srrelid
     *
     * @mbg.generated
     */
    private Long srrelid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_subscription_rel.srsubstate
     *
     * @mbg.generated
     */
    private String srsubstate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_subscription_rel.srsublsn
     *
     * @mbg.generated
     */
    private Object srsublsn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pg_subscription_rel
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_subscription_rel.srsubid
     *
     * @return the value of pg_subscription_rel.srsubid
     *
     * @mbg.generated
     */
    public Long getSrsubid() {
        return srsubid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_subscription_rel.srsubid
     *
     * @param srsubid the value for pg_subscription_rel.srsubid
     *
     * @mbg.generated
     */
    public void setSrsubid(Long srsubid) {
        this.srsubid = srsubid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_subscription_rel.srrelid
     *
     * @return the value of pg_subscription_rel.srrelid
     *
     * @mbg.generated
     */
    public Long getSrrelid() {
        return srrelid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_subscription_rel.srrelid
     *
     * @param srrelid the value for pg_subscription_rel.srrelid
     *
     * @mbg.generated
     */
    public void setSrrelid(Long srrelid) {
        this.srrelid = srrelid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_subscription_rel.srsubstate
     *
     * @return the value of pg_subscription_rel.srsubstate
     *
     * @mbg.generated
     */
    public String getSrsubstate() {
        return srsubstate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_subscription_rel.srsubstate
     *
     * @param srsubstate the value for pg_subscription_rel.srsubstate
     *
     * @mbg.generated
     */
    public void setSrsubstate(String srsubstate) {
        this.srsubstate = srsubstate == null ? null : srsubstate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_subscription_rel.srsublsn
     *
     * @return the value of pg_subscription_rel.srsublsn
     *
     * @mbg.generated
     */
    public Object getSrsublsn() {
        return srsublsn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_subscription_rel.srsublsn
     *
     * @param srsublsn the value for pg_subscription_rel.srsublsn
     *
     * @mbg.generated
     */
    public void setSrsublsn(Object srsublsn) {
        this.srsublsn = srsublsn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_subscription_rel
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", srsubid=").append(srsubid);
        sb.append(", srrelid=").append(srrelid);
        sb.append(", srsubstate=").append(srsubstate);
        sb.append(", srsublsn=").append(srsublsn);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}