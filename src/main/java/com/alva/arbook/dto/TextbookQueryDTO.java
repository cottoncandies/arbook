package com.alva.arbook.dto;

public class TextbookQueryDTO {

    private String section;
    private String grade;
    private String subjectId;
    private String publishId;
    private Integer page;
    private Integer limit;

    public TextbookQueryDTO() {
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getPublishId() {
        return publishId;
    }

    public void setPublishId(String publishId) {
        this.publishId = publishId;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "TextbookQueryDTO{" +
                "section='" + section + '\'' +
                ", grade='" + grade + '\'' +
                ", subjectId='" + subjectId + '\'' +
                ", publishId='" + publishId + '\'' +
                ", page=" + page +
                ", limit=" + limit +
                '}';
    }
}
