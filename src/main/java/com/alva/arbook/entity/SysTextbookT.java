package com.alva.arbook.entity;

import java.io.Serializable;
import java.util.Date;

public class SysTextbookT implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_textbook_t.sz_id
     *
     * @mbg.generated
     */
    private String szId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_textbook_t.sz_caption
     *
     * @mbg.generated
     */
    private String szCaption;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_textbook_t.sz_cover
     *
     * @mbg.generated
     */
    private String szCover;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_textbook_t.sz_edition
     *
     * @mbg.generated
     */
    private String szEdition;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_textbook_t.sz_section
     *
     * @mbg.generated
     */
    private String szSection;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_textbook_t.sz_grade
     *
     * @mbg.generated
     */
    private String szGrade;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_textbook_t.sz_subject_id
     *
     * @mbg.generated
     */
    private String szSubjectId;

    private SysSubjectT subject;

    public SysSubjectT getSubject() {
        return subject;
    }

    public void setSubject(SysSubjectT subject) {
        this.subject = subject;
    }

    public SysPublishingT getPublish() {
        return publish;
    }

    public void setPublish(SysPublishingT publish) {
        this.publish = publish;
    }

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_textbook_t.sz_pub_id
     *
     * @mbg.generated
     */
    private String szPubId;

    private SysPublishingT publish;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_textbook_t.sz_insti
     *
     * @mbg.generated
     */
    private String szInsti;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_textbook_t.sz_store
     *
     * @mbg.generated
     */
    private String szStore;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_textbook_t.sz_md5
     *
     * @mbg.generated
     */
    private String szMd5;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_textbook_t.ng_size
     *
     * @mbg.generated
     */
    private Long ngSize;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_textbook_t.sz_tag
     *
     * @mbg.generated
     */
    private String szTag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_textbook_t.ts_created
     *
     * @mbg.generated
     */
    private Date tsCreated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_textbook_t.ts_updated
     *
     * @mbg.generated
     */
    private Date tsUpdated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_textbook_t.nt_row_state
     *
     * @mbg.generated
     */
    private Integer ntRowState;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_textbook_t.nt_row_version
     *
     * @mbg.generated
     */
    private Integer ntRowVersion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_textbook_t
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_textbook_t.sz_id
     *
     * @return the value of sys_textbook_t.sz_id
     * @mbg.generated
     */
    public String getSzId() {
        return szId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_textbook_t.sz_id
     *
     * @param szId the value for sys_textbook_t.sz_id
     * @mbg.generated
     */
    public void setSzId(String szId) {
        this.szId = szId == null ? null : szId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_textbook_t.sz_caption
     *
     * @return the value of sys_textbook_t.sz_caption
     * @mbg.generated
     */
    public String getSzCaption() {
        return szCaption;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_textbook_t.sz_caption
     *
     * @param szCaption the value for sys_textbook_t.sz_caption
     * @mbg.generated
     */
    public void setSzCaption(String szCaption) {
        this.szCaption = szCaption == null ? null : szCaption.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_textbook_t.sz_cover
     *
     * @return the value of sys_textbook_t.sz_cover
     * @mbg.generated
     */
    public String getSzCover() {
        return szCover;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_textbook_t.sz_cover
     *
     * @param szCover the value for sys_textbook_t.sz_cover
     * @mbg.generated
     */
    public void setSzCover(String szCover) {
        this.szCover = szCover == null ? null : szCover.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_textbook_t.sz_edition
     *
     * @return the value of sys_textbook_t.sz_edition
     * @mbg.generated
     */
    public String getSzEdition() {
        return szEdition;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_textbook_t.sz_edition
     *
     * @param szEdition the value for sys_textbook_t.sz_edition
     * @mbg.generated
     */
    public void setSzEdition(String szEdition) {
        this.szEdition = szEdition == null ? null : szEdition.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_textbook_t.sz_section
     *
     * @return the value of sys_textbook_t.sz_section
     * @mbg.generated
     */
    public String getSzSection() {
        return szSection;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_textbook_t.sz_section
     *
     * @param szSection the value for sys_textbook_t.sz_section
     * @mbg.generated
     */
    public void setSzSection(String szSection) {
        this.szSection = szSection == null ? null : szSection.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_textbook_t.sz_grade
     *
     * @return the value of sys_textbook_t.sz_grade
     * @mbg.generated
     */
    public String getSzGrade() {
        return szGrade;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_textbook_t.sz_grade
     *
     * @param szGrade the value for sys_textbook_t.sz_grade
     * @mbg.generated
     */
    public void setSzGrade(String szGrade) {
        this.szGrade = szGrade == null ? null : szGrade.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_textbook_t.sz_subject_id
     *
     * @return the value of sys_textbook_t.sz_subject_id
     * @mbg.generated
     */
    public String getSzSubjectId() {
        return szSubjectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_textbook_t.sz_subject_id
     *
     * @param szSubjectId the value for sys_textbook_t.sz_subject_id
     * @mbg.generated
     */
    public void setSzSubjectId(String szSubjectId) {
        this.szSubjectId = szSubjectId == null ? null : szSubjectId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_textbook_t.sz_pub_id
     *
     * @return the value of sys_textbook_t.sz_pub_id
     * @mbg.generated
     */
    public String getSzPubId() {
        return szPubId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_textbook_t.sz_pub_id
     *
     * @param szPubId the value for sys_textbook_t.sz_pub_id
     * @mbg.generated
     */
    public void setSzPubId(String szPubId) {
        this.szPubId = szPubId == null ? null : szPubId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_textbook_t.sz_insti
     *
     * @return the value of sys_textbook_t.sz_insti
     * @mbg.generated
     */
    public String getSzInsti() {
        return szInsti;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_textbook_t.sz_insti
     *
     * @param szInsti the value for sys_textbook_t.sz_insti
     * @mbg.generated
     */
    public void setSzInsti(String szInsti) {
        this.szInsti = szInsti == null ? null : szInsti.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_textbook_t.sz_store
     *
     * @return the value of sys_textbook_t.sz_store
     * @mbg.generated
     */
    public String getSzStore() {
        return szStore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_textbook_t.sz_store
     *
     * @param szStore the value for sys_textbook_t.sz_store
     * @mbg.generated
     */
    public void setSzStore(String szStore) {
        this.szStore = szStore == null ? null : szStore.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_textbook_t.sz_md5
     *
     * @return the value of sys_textbook_t.sz_md5
     * @mbg.generated
     */
    public String getSzMd5() {
        return szMd5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_textbook_t.sz_md5
     *
     * @param szMd5 the value for sys_textbook_t.sz_md5
     * @mbg.generated
     */
    public void setSzMd5(String szMd5) {
        this.szMd5 = szMd5 == null ? null : szMd5.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_textbook_t.ng_size
     *
     * @return the value of sys_textbook_t.ng_size
     * @mbg.generated
     */
    public Long getNgSize() {
        return ngSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_textbook_t.ng_size
     *
     * @param ngSize the value for sys_textbook_t.ng_size
     * @mbg.generated
     */
    public void setNgSize(Long ngSize) {
        this.ngSize = ngSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_textbook_t.sz_tag
     *
     * @return the value of sys_textbook_t.sz_tag
     * @mbg.generated
     */
    public String getSzTag() {
        return szTag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_textbook_t.sz_tag
     *
     * @param szTag the value for sys_textbook_t.sz_tag
     * @mbg.generated
     */
    public void setSzTag(String szTag) {
        this.szTag = szTag == null ? null : szTag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_textbook_t.ts_created
     *
     * @return the value of sys_textbook_t.ts_created
     * @mbg.generated
     */
    public Date getTsCreated() {
        return tsCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_textbook_t.ts_created
     *
     * @param tsCreated the value for sys_textbook_t.ts_created
     * @mbg.generated
     */
    public void setTsCreated(Date tsCreated) {
        this.tsCreated = tsCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_textbook_t.ts_updated
     *
     * @return the value of sys_textbook_t.ts_updated
     * @mbg.generated
     */
    public Date getTsUpdated() {
        return tsUpdated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_textbook_t.ts_updated
     *
     * @param tsUpdated the value for sys_textbook_t.ts_updated
     * @mbg.generated
     */
    public void setTsUpdated(Date tsUpdated) {
        this.tsUpdated = tsUpdated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_textbook_t.nt_row_state
     *
     * @return the value of sys_textbook_t.nt_row_state
     * @mbg.generated
     */
    public Integer getNtRowState() {
        return ntRowState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_textbook_t.nt_row_state
     *
     * @param ntRowState the value for sys_textbook_t.nt_row_state
     * @mbg.generated
     */
    public void setNtRowState(Integer ntRowState) {
        this.ntRowState = ntRowState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_textbook_t.nt_row_version
     *
     * @return the value of sys_textbook_t.nt_row_version
     * @mbg.generated
     */
    public Integer getNtRowVersion() {
        return ntRowVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_textbook_t.nt_row_version
     *
     * @param ntRowVersion the value for sys_textbook_t.nt_row_version
     * @mbg.generated
     */
    public void setNtRowVersion(Integer ntRowVersion) {
        this.ntRowVersion = ntRowVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_textbook_t
     *
     * @mbg.generated
     */
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append(getClass().getSimpleName());
//        sb.append(" [");
//        sb.append("Hash = ").append(hashCode());
//        sb.append(", szId=").append(szId);
//        sb.append(", szCaption=").append(szCaption);
//        sb.append(", szCover=").append(szCover);
//        sb.append(", szEdition=").append(szEdition);
//        sb.append(", szSection=").append(szSection);
//        sb.append(", szGrade=").append(szGrade);
//        sb.append(", szSubjectId=").append(szSubjectId);
//        sb.append(", szPubId=").append(szPubId);
//        sb.append(", szInsti=").append(szInsti);
//        sb.append(", szStore=").append(szStore);
//        sb.append(", szMd5=").append(szMd5);
//        sb.append(", ngSize=").append(ngSize);
//        sb.append(", szTag=").append(szTag);
//        sb.append(", tsCreated=").append(tsCreated);
//        sb.append(", tsUpdated=").append(tsUpdated);
//        sb.append(", ntRowState=").append(ntRowState);
//        sb.append(", ntRowVersion=").append(ntRowVersion);
//        sb.append(", serialVersionUID=").append(serialVersionUID);
//        sb.append("]");
//        return sb.toString();
//    }


    @Override
    public String toString() {
        return "SysTextbookT{" +
                "szId='" + szId + '\'' +
                ", szCaption='" + szCaption + '\'' +
                ", szCover='" + szCover + '\'' +
                ", szEdition='" + szEdition + '\'' +
                ", szSection='" + szSection + '\'' +
                ", szGrade='" + szGrade + '\'' +
                ", szSubjectId='" + szSubjectId + '\'' +
                ", subject=" + subject +
                ", szPubId='" + szPubId + '\'' +
                ", publish=" + publish +
                ", szInsti='" + szInsti + '\'' +
                ", szStore='" + szStore + '\'' +
                ", szMd5='" + szMd5 + '\'' +
                ", ngSize=" + ngSize +
                ", szTag='" + szTag + '\'' +
                ", tsCreated=" + tsCreated +
                ", tsUpdated=" + tsUpdated +
                ", ntRowState=" + ntRowState +
                ", ntRowVersion=" + ntRowVersion +
                '}';
    }
}