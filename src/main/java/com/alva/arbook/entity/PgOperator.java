package com.alva.arbook.entity;

import java.io.Serializable;

public class PgOperator implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_operator.oprname
     *
     * @mbg.generated
     */
    private String oprname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_operator.oprnamespace
     *
     * @mbg.generated
     */
    private Long oprnamespace;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_operator.oprowner
     *
     * @mbg.generated
     */
    private Long oprowner;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_operator.oprkind
     *
     * @mbg.generated
     */
    private String oprkind;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_operator.oprcanmerge
     *
     * @mbg.generated
     */
    private Boolean oprcanmerge;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_operator.oprcanhash
     *
     * @mbg.generated
     */
    private Boolean oprcanhash;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_operator.oprleft
     *
     * @mbg.generated
     */
    private Long oprleft;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_operator.oprright
     *
     * @mbg.generated
     */
    private Long oprright;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_operator.oprresult
     *
     * @mbg.generated
     */
    private Long oprresult;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_operator.oprcom
     *
     * @mbg.generated
     */
    private Long oprcom;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_operator.oprnegate
     *
     * @mbg.generated
     */
    private Long oprnegate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_operator.oprcode
     *
     * @mbg.generated
     */
    private Object oprcode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_operator.oprrest
     *
     * @mbg.generated
     */
    private Object oprrest;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pg_operator.oprjoin
     *
     * @mbg.generated
     */
    private Object oprjoin;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pg_operator
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_operator.oprname
     *
     * @return the value of pg_operator.oprname
     *
     * @mbg.generated
     */
    public String getOprname() {
        return oprname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_operator.oprname
     *
     * @param oprname the value for pg_operator.oprname
     *
     * @mbg.generated
     */
    public void setOprname(String oprname) {
        this.oprname = oprname == null ? null : oprname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_operator.oprnamespace
     *
     * @return the value of pg_operator.oprnamespace
     *
     * @mbg.generated
     */
    public Long getOprnamespace() {
        return oprnamespace;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_operator.oprnamespace
     *
     * @param oprnamespace the value for pg_operator.oprnamespace
     *
     * @mbg.generated
     */
    public void setOprnamespace(Long oprnamespace) {
        this.oprnamespace = oprnamespace;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_operator.oprowner
     *
     * @return the value of pg_operator.oprowner
     *
     * @mbg.generated
     */
    public Long getOprowner() {
        return oprowner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_operator.oprowner
     *
     * @param oprowner the value for pg_operator.oprowner
     *
     * @mbg.generated
     */
    public void setOprowner(Long oprowner) {
        this.oprowner = oprowner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_operator.oprkind
     *
     * @return the value of pg_operator.oprkind
     *
     * @mbg.generated
     */
    public String getOprkind() {
        return oprkind;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_operator.oprkind
     *
     * @param oprkind the value for pg_operator.oprkind
     *
     * @mbg.generated
     */
    public void setOprkind(String oprkind) {
        this.oprkind = oprkind == null ? null : oprkind.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_operator.oprcanmerge
     *
     * @return the value of pg_operator.oprcanmerge
     *
     * @mbg.generated
     */
    public Boolean getOprcanmerge() {
        return oprcanmerge;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_operator.oprcanmerge
     *
     * @param oprcanmerge the value for pg_operator.oprcanmerge
     *
     * @mbg.generated
     */
    public void setOprcanmerge(Boolean oprcanmerge) {
        this.oprcanmerge = oprcanmerge;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_operator.oprcanhash
     *
     * @return the value of pg_operator.oprcanhash
     *
     * @mbg.generated
     */
    public Boolean getOprcanhash() {
        return oprcanhash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_operator.oprcanhash
     *
     * @param oprcanhash the value for pg_operator.oprcanhash
     *
     * @mbg.generated
     */
    public void setOprcanhash(Boolean oprcanhash) {
        this.oprcanhash = oprcanhash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_operator.oprleft
     *
     * @return the value of pg_operator.oprleft
     *
     * @mbg.generated
     */
    public Long getOprleft() {
        return oprleft;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_operator.oprleft
     *
     * @param oprleft the value for pg_operator.oprleft
     *
     * @mbg.generated
     */
    public void setOprleft(Long oprleft) {
        this.oprleft = oprleft;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_operator.oprright
     *
     * @return the value of pg_operator.oprright
     *
     * @mbg.generated
     */
    public Long getOprright() {
        return oprright;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_operator.oprright
     *
     * @param oprright the value for pg_operator.oprright
     *
     * @mbg.generated
     */
    public void setOprright(Long oprright) {
        this.oprright = oprright;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_operator.oprresult
     *
     * @return the value of pg_operator.oprresult
     *
     * @mbg.generated
     */
    public Long getOprresult() {
        return oprresult;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_operator.oprresult
     *
     * @param oprresult the value for pg_operator.oprresult
     *
     * @mbg.generated
     */
    public void setOprresult(Long oprresult) {
        this.oprresult = oprresult;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_operator.oprcom
     *
     * @return the value of pg_operator.oprcom
     *
     * @mbg.generated
     */
    public Long getOprcom() {
        return oprcom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_operator.oprcom
     *
     * @param oprcom the value for pg_operator.oprcom
     *
     * @mbg.generated
     */
    public void setOprcom(Long oprcom) {
        this.oprcom = oprcom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_operator.oprnegate
     *
     * @return the value of pg_operator.oprnegate
     *
     * @mbg.generated
     */
    public Long getOprnegate() {
        return oprnegate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_operator.oprnegate
     *
     * @param oprnegate the value for pg_operator.oprnegate
     *
     * @mbg.generated
     */
    public void setOprnegate(Long oprnegate) {
        this.oprnegate = oprnegate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_operator.oprcode
     *
     * @return the value of pg_operator.oprcode
     *
     * @mbg.generated
     */
    public Object getOprcode() {
        return oprcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_operator.oprcode
     *
     * @param oprcode the value for pg_operator.oprcode
     *
     * @mbg.generated
     */
    public void setOprcode(Object oprcode) {
        this.oprcode = oprcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_operator.oprrest
     *
     * @return the value of pg_operator.oprrest
     *
     * @mbg.generated
     */
    public Object getOprrest() {
        return oprrest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_operator.oprrest
     *
     * @param oprrest the value for pg_operator.oprrest
     *
     * @mbg.generated
     */
    public void setOprrest(Object oprrest) {
        this.oprrest = oprrest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pg_operator.oprjoin
     *
     * @return the value of pg_operator.oprjoin
     *
     * @mbg.generated
     */
    public Object getOprjoin() {
        return oprjoin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pg_operator.oprjoin
     *
     * @param oprjoin the value for pg_operator.oprjoin
     *
     * @mbg.generated
     */
    public void setOprjoin(Object oprjoin) {
        this.oprjoin = oprjoin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pg_operator
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oprname=").append(oprname);
        sb.append(", oprnamespace=").append(oprnamespace);
        sb.append(", oprowner=").append(oprowner);
        sb.append(", oprkind=").append(oprkind);
        sb.append(", oprcanmerge=").append(oprcanmerge);
        sb.append(", oprcanhash=").append(oprcanhash);
        sb.append(", oprleft=").append(oprleft);
        sb.append(", oprright=").append(oprright);
        sb.append(", oprresult=").append(oprresult);
        sb.append(", oprcom=").append(oprcom);
        sb.append(", oprnegate=").append(oprnegate);
        sb.append(", oprcode=").append(oprcode);
        sb.append(", oprrest=").append(oprrest);
        sb.append(", oprjoin=").append(oprjoin);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}