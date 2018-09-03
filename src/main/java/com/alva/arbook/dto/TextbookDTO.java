package com.alva.arbook.dto;

public class TextbookDTO {

    private String id;
    private String cover;
    private String caption;
    private String edition;
    private String section;
    private String grade;
    private String subject;
    private String term;
    private String publish;
    private String catalog;

    private Long fileSize;
    private String md5;
    private String store; // 上传教材的存储路径

    public TextbookDTO() {
    }

    public TextbookDTO(String id, String cover, String caption, String edition, String section, String grade, String subject, String term, String publish, String catalog, Long fileSize, String md5, String store) {
        this.id = id;
        this.cover = cover;
        this.caption = caption;
        this.edition = edition;
        this.section = section;
        this.grade = grade;
        this.subject = subject;
        this.term = term;
        this.publish = publish;
        this.catalog = catalog;
        this.fileSize = fileSize;
        this.md5 = md5;
        this.store = store;
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    @Override
    public String toString() {
        return "TextbookDTO{" +
                "id='" + id + '\'' +
                ", cover='" + cover + '\'' +
                ", caption='" + caption + '\'' +
                ", edition='" + edition + '\'' +
                ", section='" + section + '\'' +
                ", grade='" + grade + '\'' +
                ", subject='" + subject + '\'' +
                ", term='" + term + '\'' +
                ", publish='" + publish + '\'' +
                ", catalog='" + catalog + '\'' +
                ", fileSize='" + fileSize + '\'' +
                ", md5='" + md5 + '\'' +
                ", store='" + store + '\'' +
                '}';
    }
}
