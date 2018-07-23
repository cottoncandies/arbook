package com.alva.arbook.entity;

import java.io.Serializable;

public class PgAuthMembers implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_auth_members.roleid
     *
     * @mbg.generated
     */
    private Long roleid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_auth_members.member
     *
     * @mbg.generated
     */
    private Long member;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_auth_members.grantor
     *
     * @mbg.generated
     */
    private Long grantor;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_auth_members.admin_option
     *
     * @mbg.generated
     */
    private Boolean adminOption;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pg_auth_members
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_auth_members.roleid
     *
     * @return the value of pg_auth_members.roleid
     *
     * @mbg.generated
     */
    public Long getRoleid() {
        return roleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_auth_members.roleid
     *
     * @param roleid the value for pg_auth_members.roleid
     *
     * @mbg.generated
     */
    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_auth_members.member
     *
     * @return the value of pg_auth_members.member
     *
     * @mbg.generated
     */
    public Long getMember() {
        return member;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_auth_members.member
     *
     * @param member the value for pg_auth_members.member
     *
     * @mbg.generated
     */
    public void setMember(Long member) {
        this.member = member;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_auth_members.grantor
     *
     * @return the value of pg_auth_members.grantor
     *
     * @mbg.generated
     */
    public Long getGrantor() {
        return grantor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_auth_members.grantor
     *
     * @param grantor the value for pg_auth_members.grantor
     *
     * @mbg.generated
     */
    public void setGrantor(Long grantor) {
        this.grantor = grantor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_auth_members.admin_option
     *
     * @return the value of pg_auth_members.admin_option
     *
     * @mbg.generated
     */
    public Boolean getAdminOption() {
        return adminOption;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_auth_members.admin_option
     *
     * @param adminOption the value for pg_auth_members.admin_option
     *
     * @mbg.generated
     */
    public void setAdminOption(Boolean adminOption) {
        this.adminOption = adminOption;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_auth_members
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roleid=").append(roleid);
        sb.append(", member=").append(member);
        sb.append(", grantor=").append(grantor);
        sb.append(", adminOption=").append(adminOption);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}