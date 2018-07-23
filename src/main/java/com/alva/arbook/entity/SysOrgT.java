package com.alva.arbook.entity;

import java.io.Serializable;
import java.util.Date;

public class SysOrgT implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_org_t.sz_id
     *
     * @mbg.generated
     */
    private String szId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_org_t.sz_caption
     *
     * @mbg.generated
     */
    private String szCaption;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_org_t.sz_contacts
     *
     * @mbg.generated
     */
    private String szContacts;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_org_t.sz_tel
     *
     * @mbg.generated
     */
    private String szTel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_org_t.sz_mobile
     *
     * @mbg.generated
     */
    private String szMobile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_org_t.sz_addr
     *
     * @mbg.generated
     */
    private String szAddr;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_org_t.ts_created
     *
     * @mbg.generated
     */
    private Date tsCreated;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_org_t.ts_updated
     *
     * @mbg.generated
     */
    private Date tsUpdated;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_org_t.nt_row_state
     *
     * @mbg.generated
     */
    private Integer ntRowState;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_org_t.nt_row_version
     *
     * @mbg.generated
     */
    private Integer ntRowVersion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_org_t
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_org_t.sz_id
     *
     * @return the value of sys_org_t.sz_id
     *
     * @mbg.generated
     */
    public String getSzId() {
        return szId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_org_t.sz_id
     *
     * @param szId the value for sys_org_t.sz_id
     *
     * @mbg.generated
     */
    public void setSzId(String szId) {
        this.szId = szId == null ? null : szId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_org_t.sz_caption
     *
     * @return the value of sys_org_t.sz_caption
     *
     * @mbg.generated
     */
    public String getSzCaption() {
        return szCaption;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_org_t.sz_caption
     *
     * @param szCaption the value for sys_org_t.sz_caption
     *
     * @mbg.generated
     */
    public void setSzCaption(String szCaption) {
        this.szCaption = szCaption == null ? null : szCaption.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_org_t.sz_contacts
     *
     * @return the value of sys_org_t.sz_contacts
     *
     * @mbg.generated
     */
    public String getSzContacts() {
        return szContacts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_org_t.sz_contacts
     *
     * @param szContacts the value for sys_org_t.sz_contacts
     *
     * @mbg.generated
     */
    public void setSzContacts(String szContacts) {
        this.szContacts = szContacts == null ? null : szContacts.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_org_t.sz_tel
     *
     * @return the value of sys_org_t.sz_tel
     *
     * @mbg.generated
     */
    public String getSzTel() {
        return szTel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_org_t.sz_tel
     *
     * @param szTel the value for sys_org_t.sz_tel
     *
     * @mbg.generated
     */
    public void setSzTel(String szTel) {
        this.szTel = szTel == null ? null : szTel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_org_t.sz_mobile
     *
     * @return the value of sys_org_t.sz_mobile
     *
     * @mbg.generated
     */
    public String getSzMobile() {
        return szMobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_org_t.sz_mobile
     *
     * @param szMobile the value for sys_org_t.sz_mobile
     *
     * @mbg.generated
     */
    public void setSzMobile(String szMobile) {
        this.szMobile = szMobile == null ? null : szMobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_org_t.sz_addr
     *
     * @return the value of sys_org_t.sz_addr
     *
     * @mbg.generated
     */
    public String getSzAddr() {
        return szAddr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_org_t.sz_addr
     *
     * @param szAddr the value for sys_org_t.sz_addr
     *
     * @mbg.generated
     */
    public void setSzAddr(String szAddr) {
        this.szAddr = szAddr == null ? null : szAddr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_org_t.ts_created
     *
     * @return the value of sys_org_t.ts_created
     *
     * @mbg.generated
     */
    public Date getTsCreated() {
        return tsCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_org_t.ts_created
     *
     * @param tsCreated the value for sys_org_t.ts_created
     *
     * @mbg.generated
     */
    public void setTsCreated(Date tsCreated) {
        this.tsCreated = tsCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_org_t.ts_updated
     *
     * @return the value of sys_org_t.ts_updated
     *
     * @mbg.generated
     */
    public Date getTsUpdated() {
        return tsUpdated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_org_t.ts_updated
     *
     * @param tsUpdated the value for sys_org_t.ts_updated
     *
     * @mbg.generated
     */
    public void setTsUpdated(Date tsUpdated) {
        this.tsUpdated = tsUpdated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_org_t.nt_row_state
     *
     * @return the value of sys_org_t.nt_row_state
     *
     * @mbg.generated
     */
    public Integer getNtRowState() {
        return ntRowState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_org_t.nt_row_state
     *
     * @param ntRowState the value for sys_org_t.nt_row_state
     *
     * @mbg.generated
     */
    public void setNtRowState(Integer ntRowState) {
        this.ntRowState = ntRowState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_org_t.nt_row_version
     *
     * @return the value of sys_org_t.nt_row_version
     *
     * @mbg.generated
     */
    public Integer getNtRowVersion() {
        return ntRowVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_org_t.nt_row_version
     *
     * @param ntRowVersion the value for sys_org_t.nt_row_version
     *
     * @mbg.generated
     */
    public void setNtRowVersion(Integer ntRowVersion) {
        this.ntRowVersion = ntRowVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_org_t
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", szId=").append(szId);
        sb.append(", szCaption=").append(szCaption);
        sb.append(", szContacts=").append(szContacts);
        sb.append(", szTel=").append(szTel);
        sb.append(", szMobile=").append(szMobile);
        sb.append(", szAddr=").append(szAddr);
        sb.append(", tsCreated=").append(tsCreated);
        sb.append(", tsUpdated=").append(tsUpdated);
        sb.append(", ntRowState=").append(ntRowState);
        sb.append(", ntRowVersion=").append(ntRowVersion);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}