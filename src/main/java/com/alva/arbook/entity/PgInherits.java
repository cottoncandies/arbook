package com.alva.arbook.entity;

import java.io.Serializable;

public class PgInherits implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_inherits.inhrelid
     *
     * @mbg.generated
     */
    private Long inhrelid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_inherits.inhparent
     *
     * @mbg.generated
     */
    private Long inhparent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_inherits.inhseqno
     *
     * @mbg.generated
     */
    private Integer inhseqno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pg_inherits
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_inherits.inhrelid
     *
     * @return the value of pg_inherits.inhrelid
     *
     * @mbg.generated
     */
    public Long getInhrelid() {
        return inhrelid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_inherits.inhrelid
     *
     * @param inhrelid the value for pg_inherits.inhrelid
     *
     * @mbg.generated
     */
    public void setInhrelid(Long inhrelid) {
        this.inhrelid = inhrelid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_inherits.inhparent
     *
     * @return the value of pg_inherits.inhparent
     *
     * @mbg.generated
     */
    public Long getInhparent() {
        return inhparent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_inherits.inhparent
     *
     * @param inhparent the value for pg_inherits.inhparent
     *
     * @mbg.generated
     */
    public void setInhparent(Long inhparent) {
        this.inhparent = inhparent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_inherits.inhseqno
     *
     * @return the value of pg_inherits.inhseqno
     *
     * @mbg.generated
     */
    public Integer getInhseqno() {
        return inhseqno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_inherits.inhseqno
     *
     * @param inhseqno the value for pg_inherits.inhseqno
     *
     * @mbg.generated
     */
    public void setInhseqno(Integer inhseqno) {
        this.inhseqno = inhseqno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_inherits
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", inhrelid=").append(inhrelid);
        sb.append(", inhparent=").append(inhparent);
        sb.append(", inhseqno=").append(inhseqno);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}