package com.alva.arbook.entity;

import java.io.Serializable;
import java.util.Date;

public class PgAuthid implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_authid.rolname
     *
     * @mbg.generated
     */
    private String rolname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_authid.rolsuper
     *
     * @mbg.generated
     */
    private Boolean rolsuper;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_authid.rolinherit
     *
     * @mbg.generated
     */
    private Boolean rolinherit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_authid.rolcreaterole
     *
     * @mbg.generated
     */
    private Boolean rolcreaterole;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_authid.rolcreatedb
     *
     * @mbg.generated
     */
    private Boolean rolcreatedb;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_authid.rolcanlogin
     *
     * @mbg.generated
     */
    private Boolean rolcanlogin;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_authid.rolreplication
     *
     * @mbg.generated
     */
    private Boolean rolreplication;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_authid.rolbypassrls
     *
     * @mbg.generated
     */
    private Boolean rolbypassrls;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_authid.rolconnlimit
     *
     * @mbg.generated
     */
    private Integer rolconnlimit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_authid.rolpassword
     *
     * @mbg.generated
     */
    private String rolpassword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_authid.rolvaliduntil
     *
     * @mbg.generated
     */
    private Date rolvaliduntil;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pg_authid
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_authid.rolname
     *
     * @return the value of pg_authid.rolname
     *
     * @mbg.generated
     */
    public String getRolname() {
        return rolname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_authid.rolname
     *
     * @param rolname the value for pg_authid.rolname
     *
     * @mbg.generated
     */
    public void setRolname(String rolname) {
        this.rolname = rolname == null ? null : rolname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_authid.rolsuper
     *
     * @return the value of pg_authid.rolsuper
     *
     * @mbg.generated
     */
    public Boolean getRolsuper() {
        return rolsuper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_authid.rolsuper
     *
     * @param rolsuper the value for pg_authid.rolsuper
     *
     * @mbg.generated
     */
    public void setRolsuper(Boolean rolsuper) {
        this.rolsuper = rolsuper;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_authid.rolinherit
     *
     * @return the value of pg_authid.rolinherit
     *
     * @mbg.generated
     */
    public Boolean getRolinherit() {
        return rolinherit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_authid.rolinherit
     *
     * @param rolinherit the value for pg_authid.rolinherit
     *
     * @mbg.generated
     */
    public void setRolinherit(Boolean rolinherit) {
        this.rolinherit = rolinherit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_authid.rolcreaterole
     *
     * @return the value of pg_authid.rolcreaterole
     *
     * @mbg.generated
     */
    public Boolean getRolcreaterole() {
        return rolcreaterole;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_authid.rolcreaterole
     *
     * @param rolcreaterole the value for pg_authid.rolcreaterole
     *
     * @mbg.generated
     */
    public void setRolcreaterole(Boolean rolcreaterole) {
        this.rolcreaterole = rolcreaterole;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_authid.rolcreatedb
     *
     * @return the value of pg_authid.rolcreatedb
     *
     * @mbg.generated
     */
    public Boolean getRolcreatedb() {
        return rolcreatedb;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_authid.rolcreatedb
     *
     * @param rolcreatedb the value for pg_authid.rolcreatedb
     *
     * @mbg.generated
     */
    public void setRolcreatedb(Boolean rolcreatedb) {
        this.rolcreatedb = rolcreatedb;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_authid.rolcanlogin
     *
     * @return the value of pg_authid.rolcanlogin
     *
     * @mbg.generated
     */
    public Boolean getRolcanlogin() {
        return rolcanlogin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_authid.rolcanlogin
     *
     * @param rolcanlogin the value for pg_authid.rolcanlogin
     *
     * @mbg.generated
     */
    public void setRolcanlogin(Boolean rolcanlogin) {
        this.rolcanlogin = rolcanlogin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_authid.rolreplication
     *
     * @return the value of pg_authid.rolreplication
     *
     * @mbg.generated
     */
    public Boolean getRolreplication() {
        return rolreplication;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_authid.rolreplication
     *
     * @param rolreplication the value for pg_authid.rolreplication
     *
     * @mbg.generated
     */
    public void setRolreplication(Boolean rolreplication) {
        this.rolreplication = rolreplication;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_authid.rolbypassrls
     *
     * @return the value of pg_authid.rolbypassrls
     *
     * @mbg.generated
     */
    public Boolean getRolbypassrls() {
        return rolbypassrls;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_authid.rolbypassrls
     *
     * @param rolbypassrls the value for pg_authid.rolbypassrls
     *
     * @mbg.generated
     */
    public void setRolbypassrls(Boolean rolbypassrls) {
        this.rolbypassrls = rolbypassrls;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_authid.rolconnlimit
     *
     * @return the value of pg_authid.rolconnlimit
     *
     * @mbg.generated
     */
    public Integer getRolconnlimit() {
        return rolconnlimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_authid.rolconnlimit
     *
     * @param rolconnlimit the value for pg_authid.rolconnlimit
     *
     * @mbg.generated
     */
    public void setRolconnlimit(Integer rolconnlimit) {
        this.rolconnlimit = rolconnlimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_authid.rolpassword
     *
     * @return the value of pg_authid.rolpassword
     *
     * @mbg.generated
     */
    public String getRolpassword() {
        return rolpassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_authid.rolpassword
     *
     * @param rolpassword the value for pg_authid.rolpassword
     *
     * @mbg.generated
     */
    public void setRolpassword(String rolpassword) {
        this.rolpassword = rolpassword == null ? null : rolpassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_authid.rolvaliduntil
     *
     * @return the value of pg_authid.rolvaliduntil
     *
     * @mbg.generated
     */
    public Date getRolvaliduntil() {
        return rolvaliduntil;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_authid.rolvaliduntil
     *
     * @param rolvaliduntil the value for pg_authid.rolvaliduntil
     *
     * @mbg.generated
     */
    public void setRolvaliduntil(Date rolvaliduntil) {
        this.rolvaliduntil = rolvaliduntil;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_authid
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rolname=").append(rolname);
        sb.append(", rolsuper=").append(rolsuper);
        sb.append(", rolinherit=").append(rolinherit);
        sb.append(", rolcreaterole=").append(rolcreaterole);
        sb.append(", rolcreatedb=").append(rolcreatedb);
        sb.append(", rolcanlogin=").append(rolcanlogin);
        sb.append(", rolreplication=").append(rolreplication);
        sb.append(", rolbypassrls=").append(rolbypassrls);
        sb.append(", rolconnlimit=").append(rolconnlimit);
        sb.append(", rolpassword=").append(rolpassword);
        sb.append(", rolvaliduntil=").append(rolvaliduntil);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}