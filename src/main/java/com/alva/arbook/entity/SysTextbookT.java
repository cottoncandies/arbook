package com.alva.arbook.entity;

import com.alva.arbook.annotation.DataName;

import java.io.Serializable;
import java.util.Date;

public class SysTextbookT implements Serializable {
    private String szId;
    @DataName(name = "教材名称")
    private String szCaption;
    @DataName(name = "教材封面")
    private String szCover;
    @DataName(name = "教材版本")
    private String szEdition;
    @DataName(name = "学段")
    private String szSection;
    @DataName(name = "年级")
    private String szGrade;
    @DataName(name = "学期")
    private Integer ntTerm;
    private String szSubjectId;
    @DataName(name = "学科")
    private SysSubjectT sysSubjectT;
    private String szPubId;
    @DataName(name = "出版社")
    private SysPublishingT sysPublishingT;
    private String szInsti;
    private String szStore;
    private String szMd5;
    private Long ngSize;
    private String szTag;
    private Date tsCreated;
    @DataName(name = "修改时间")
    private Date tsUpdated;
    private Integer ntRowState;
    private Integer ntRowVersion;
    private String catalog;

    public SysTextbookT() {
    }

    public SysTextbookT(String szStore, String szMd5, Long ngSize) {
        this.szStore = szStore;
        this.szMd5 = szMd5;
        this.ngSize = ngSize;
    }

    private static final long serialVersionUID = 1L;

    public String getSzId() {
        return szId;
    }

    public SysSubjectT getSysSubjectT() {
        return sysSubjectT;
    }

    public String getSzSubjectId() {
        return szSubjectId;
    }

    public void setSzSubjectId(String szSubjectId) {
        this.szSubjectId = szSubjectId;
    }

    public String getSzPubId() {
        return szPubId;
    }

    public void setSzPubId(String szPubId) {
        this.szPubId = szPubId;
    }

    public void setSysSubjectT(SysSubjectT sysSubjectT) {
        this.sysSubjectT = sysSubjectT;
    }

    public SysPublishingT getSysPublishingT() {
        return sysPublishingT;
    }

    public void setSysPublishingT(SysPublishingT sysPublishingT) {
        this.sysPublishingT = sysPublishingT;
    }

    public void setSzId(String szId) {
        this.szId = szId == null ? null : szId.trim();
    }

    public String getSzCaption() {
        return szCaption;
    }

    public void setSzCaption(String szCaption) {
        this.szCaption = szCaption == null ? null : szCaption.trim();
    }

    public String getSzCover() {
        return szCover;
    }

    public void setSzCover(String szCover) {
        this.szCover = szCover == null ? null : szCover.trim();
    }

    public String getSzEdition() {
        return szEdition;
    }

    public void setSzEdition(String szEdition) {
        this.szEdition = szEdition == null ? null : szEdition.trim();
    }

    public String getSzSection() {
        return szSection;
    }

    public void setSzSection(String szSection) {
        this.szSection = szSection == null ? null : szSection.trim();
    }

    public String getSzGrade() {
        return szGrade;
    }

    public void setSzGrade(String szGrade) {
        this.szGrade = szGrade == null ? null : szGrade.trim();
    }

    public Integer getNtTerm() {
        return ntTerm;
    }

    public void setNtTerm(Integer ntTerm) {
        this.ntTerm = ntTerm;
    }

    public String getSzInsti() {
        return szInsti;
    }

    public void setSzInsti(String szInsti) {
        this.szInsti = szInsti == null ? null : szInsti.trim();
    }

    public String getSzStore() {
        return szStore;
    }

    public void setSzStore(String szStore) {
        this.szStore = szStore == null ? null : szStore.trim();
    }

    public String getSzMd5() {
        return szMd5;
    }

    public void setSzMd5(String szMd5) {
        this.szMd5 = szMd5 == null ? null : szMd5.trim();
    }

    public Long getNgSize() {
        return ngSize;
    }

    public void setNgSize(Long ngSize) {
        this.ngSize = ngSize;
    }

    public String getSzTag() {
        return szTag;
    }

    public void setSzTag(String szTag) {
        this.szTag = szTag == null ? null : szTag.trim();
    }

    public Date getTsCreated() {
        return tsCreated;
    }

    public void setTsCreated(Date tsCreated) {
        this.tsCreated = tsCreated;
    }

    public Date getTsUpdated() {
        return tsUpdated;
    }


    public void setTsUpdated(Date tsUpdated) {
        this.tsUpdated = tsUpdated;
    }

    public Integer getNtRowState() {
        return ntRowState;
    }

    public void setNtRowState(Integer ntRowState) {
        this.ntRowState = ntRowState;
    }

    public Integer getNtRowVersion() {
        return ntRowVersion;
    }

    public void setNtRowVersion(Integer ntRowVersion) {
        this.ntRowVersion = ntRowVersion;
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    @Override
    public String toString() {
        return "SysTextbookT{" +
                "szId='" + szId + '\'' +
                ", szCaption='" + szCaption + '\'' +
                ", szCover='" + szCover + '\'' +
                ", szEdition='" + szEdition + '\'' +
                ", szSection='" + szSection + '\'' +
                ", szGrade='" + szGrade + '\'' +
                ", ntTerm=" + ntTerm +
                ", szSubjectId='" + szSubjectId + '\'' +
                ", sysSubjectT=" + sysSubjectT +
                ", szPubId='" + szPubId + '\'' +
                ", sysPublishingT=" + sysPublishingT +
                ", szInsti='" + szInsti + '\'' +
                ", szStore='" + szStore + '\'' +
                ", szMd5='" + szMd5 + '\'' +
                ", ngSize=" + ngSize +
                ", szTag='" + szTag + '\'' +
                ", tsCreated=" + tsCreated +
                ", tsUpdated=" + tsUpdated +
                ", ntRowState=" + ntRowState +
                ", ntRowVersion=" + ntRowVersion +
                ", catalog='" + catalog + '\'' +
                '}';
    }
}