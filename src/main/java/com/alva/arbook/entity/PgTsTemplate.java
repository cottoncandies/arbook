package com.alva.arbook.entity;

import java.io.Serializable;

public class PgTsTemplate implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_ts_template.tmplname
     *
     * @mbg.generated
     */
    private String tmplname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_ts_template.tmplnamespace
     *
     * @mbg.generated
     */
    private Long tmplnamespace;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_ts_template.tmplinit
     *
     * @mbg.generated
     */
    private Object tmplinit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_ts_template.tmpllexize
     *
     * @mbg.generated
     */
    private Object tmpllexize;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pg_ts_template
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_ts_template.tmplname
     *
     * @return the value of pg_ts_template.tmplname
     *
     * @mbg.generated
     */
    public String getTmplname() {
        return tmplname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_ts_template.tmplname
     *
     * @param tmplname the value for pg_ts_template.tmplname
     *
     * @mbg.generated
     */
    public void setTmplname(String tmplname) {
        this.tmplname = tmplname == null ? null : tmplname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_ts_template.tmplnamespace
     *
     * @return the value of pg_ts_template.tmplnamespace
     *
     * @mbg.generated
     */
    public Long getTmplnamespace() {
        return tmplnamespace;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_ts_template.tmplnamespace
     *
     * @param tmplnamespace the value for pg_ts_template.tmplnamespace
     *
     * @mbg.generated
     */
    public void setTmplnamespace(Long tmplnamespace) {
        this.tmplnamespace = tmplnamespace;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_ts_template.tmplinit
     *
     * @return the value of pg_ts_template.tmplinit
     *
     * @mbg.generated
     */
    public Object getTmplinit() {
        return tmplinit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_ts_template.tmplinit
     *
     * @param tmplinit the value for pg_ts_template.tmplinit
     *
     * @mbg.generated
     */
    public void setTmplinit(Object tmplinit) {
        this.tmplinit = tmplinit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_ts_template.tmpllexize
     *
     * @return the value of pg_ts_template.tmpllexize
     *
     * @mbg.generated
     */
    public Object getTmpllexize() {
        return tmpllexize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_ts_template.tmpllexize
     *
     * @param tmpllexize the value for pg_ts_template.tmpllexize
     *
     * @mbg.generated
     */
    public void setTmpllexize(Object tmpllexize) {
        this.tmpllexize = tmpllexize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_ts_template
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tmplname=").append(tmplname);
        sb.append(", tmplnamespace=").append(tmplnamespace);
        sb.append(", tmplinit=").append(tmplinit);
        sb.append(", tmpllexize=").append(tmpllexize);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}