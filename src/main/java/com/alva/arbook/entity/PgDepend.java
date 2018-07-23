package com.alva.arbook.entity;

import java.io.Serializable;

public class PgDepend implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_depend.classid
     *
     * @mbg.generated
     */
    private Long classid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_depend.objid
     *
     * @mbg.generated
     */
    private Long objid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_depend.objsubid
     *
     * @mbg.generated
     */
    private Integer objsubid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_depend.refclassid
     *
     * @mbg.generated
     */
    private Long refclassid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_depend.refobjid
     *
     * @mbg.generated
     */
    private Long refobjid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_depend.refobjsubid
     *
     * @mbg.generated
     */
    private Integer refobjsubid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_depend.deptype
     *
     * @mbg.generated
     */
    private String deptype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pg_depend
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_depend.classid
     *
     * @return the value of pg_depend.classid
     *
     * @mbg.generated
     */
    public Long getClassid() {
        return classid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_depend.classid
     *
     * @param classid the value for pg_depend.classid
     *
     * @mbg.generated
     */
    public void setClassid(Long classid) {
        this.classid = classid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_depend.objid
     *
     * @return the value of pg_depend.objid
     *
     * @mbg.generated
     */
    public Long getObjid() {
        return objid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_depend.objid
     *
     * @param objid the value for pg_depend.objid
     *
     * @mbg.generated
     */
    public void setObjid(Long objid) {
        this.objid = objid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_depend.objsubid
     *
     * @return the value of pg_depend.objsubid
     *
     * @mbg.generated
     */
    public Integer getObjsubid() {
        return objsubid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_depend.objsubid
     *
     * @param objsubid the value for pg_depend.objsubid
     *
     * @mbg.generated
     */
    public void setObjsubid(Integer objsubid) {
        this.objsubid = objsubid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_depend.refclassid
     *
     * @return the value of pg_depend.refclassid
     *
     * @mbg.generated
     */
    public Long getRefclassid() {
        return refclassid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_depend.refclassid
     *
     * @param refclassid the value for pg_depend.refclassid
     *
     * @mbg.generated
     */
    public void setRefclassid(Long refclassid) {
        this.refclassid = refclassid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_depend.refobjid
     *
     * @return the value of pg_depend.refobjid
     *
     * @mbg.generated
     */
    public Long getRefobjid() {
        return refobjid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_depend.refobjid
     *
     * @param refobjid the value for pg_depend.refobjid
     *
     * @mbg.generated
     */
    public void setRefobjid(Long refobjid) {
        this.refobjid = refobjid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_depend.refobjsubid
     *
     * @return the value of pg_depend.refobjsubid
     *
     * @mbg.generated
     */
    public Integer getRefobjsubid() {
        return refobjsubid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_depend.refobjsubid
     *
     * @param refobjsubid the value for pg_depend.refobjsubid
     *
     * @mbg.generated
     */
    public void setRefobjsubid(Integer refobjsubid) {
        this.refobjsubid = refobjsubid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_depend.deptype
     *
     * @return the value of pg_depend.deptype
     *
     * @mbg.generated
     */
    public String getDeptype() {
        return deptype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_depend.deptype
     *
     * @param deptype the value for pg_depend.deptype
     *
     * @mbg.generated
     */
    public void setDeptype(String deptype) {
        this.deptype = deptype == null ? null : deptype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_depend
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", classid=").append(classid);
        sb.append(", objid=").append(objid);
        sb.append(", objsubid=").append(objsubid);
        sb.append(", refclassid=").append(refclassid);
        sb.append(", refobjid=").append(refobjid);
        sb.append(", refobjsubid=").append(refobjsubid);
        sb.append(", deptype=").append(deptype);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}