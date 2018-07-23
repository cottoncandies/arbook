package com.alva.arbook.entity;

import java.io.Serializable;

public class PgSeclabels implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_seclabels.objoid
     *
     * @mbg.generated
     */
    private Long objoid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_seclabels.classoid
     *
     * @mbg.generated
     */
    private Long classoid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_seclabels.objsubid
     *
     * @mbg.generated
     */
    private Integer objsubid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_seclabels.objtype
     *
     * @mbg.generated
     */
    private String objtype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_seclabels.objnamespace
     *
     * @mbg.generated
     */
    private Long objnamespace;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_seclabels.objname
     *
     * @mbg.generated
     */
    private String objname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_seclabels.provider
     *
     * @mbg.generated
     */
    private String provider;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_seclabels.label
     *
     * @mbg.generated
     */
    private String label;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pg_seclabels
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_seclabels.objoid
     *
     * @return the value of pg_seclabels.objoid
     *
     * @mbg.generated
     */
    public Long getObjoid() {
        return objoid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_seclabels.objoid
     *
     * @param objoid the value for pg_seclabels.objoid
     *
     * @mbg.generated
     */
    public void setObjoid(Long objoid) {
        this.objoid = objoid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_seclabels.classoid
     *
     * @return the value of pg_seclabels.classoid
     *
     * @mbg.generated
     */
    public Long getClassoid() {
        return classoid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_seclabels.classoid
     *
     * @param classoid the value for pg_seclabels.classoid
     *
     * @mbg.generated
     */
    public void setClassoid(Long classoid) {
        this.classoid = classoid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_seclabels.objsubid
     *
     * @return the value of pg_seclabels.objsubid
     *
     * @mbg.generated
     */
    public Integer getObjsubid() {
        return objsubid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_seclabels.objsubid
     *
     * @param objsubid the value for pg_seclabels.objsubid
     *
     * @mbg.generated
     */
    public void setObjsubid(Integer objsubid) {
        this.objsubid = objsubid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_seclabels.objtype
     *
     * @return the value of pg_seclabels.objtype
     *
     * @mbg.generated
     */
    public String getObjtype() {
        return objtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_seclabels.objtype
     *
     * @param objtype the value for pg_seclabels.objtype
     *
     * @mbg.generated
     */
    public void setObjtype(String objtype) {
        this.objtype = objtype == null ? null : objtype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_seclabels.objnamespace
     *
     * @return the value of pg_seclabels.objnamespace
     *
     * @mbg.generated
     */
    public Long getObjnamespace() {
        return objnamespace;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_seclabels.objnamespace
     *
     * @param objnamespace the value for pg_seclabels.objnamespace
     *
     * @mbg.generated
     */
    public void setObjnamespace(Long objnamespace) {
        this.objnamespace = objnamespace;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_seclabels.objname
     *
     * @return the value of pg_seclabels.objname
     *
     * @mbg.generated
     */
    public String getObjname() {
        return objname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_seclabels.objname
     *
     * @param objname the value for pg_seclabels.objname
     *
     * @mbg.generated
     */
    public void setObjname(String objname) {
        this.objname = objname == null ? null : objname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_seclabels.provider
     *
     * @return the value of pg_seclabels.provider
     *
     * @mbg.generated
     */
    public String getProvider() {
        return provider;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_seclabels.provider
     *
     * @param provider the value for pg_seclabels.provider
     *
     * @mbg.generated
     */
    public void setProvider(String provider) {
        this.provider = provider == null ? null : provider.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_seclabels.label
     *
     * @return the value of pg_seclabels.label
     *
     * @mbg.generated
     */
    public String getLabel() {
        return label;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_seclabels.label
     *
     * @param label the value for pg_seclabels.label
     *
     * @mbg.generated
     */
    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_seclabels
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", objoid=").append(objoid);
        sb.append(", classoid=").append(classoid);
        sb.append(", objsubid=").append(objsubid);
        sb.append(", objtype=").append(objtype);
        sb.append(", objnamespace=").append(objnamespace);
        sb.append(", objname=").append(objname);
        sb.append(", provider=").append(provider);
        sb.append(", label=").append(label);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}