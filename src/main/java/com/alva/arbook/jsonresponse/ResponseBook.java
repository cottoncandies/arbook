package com.alva.arbook.jsonresponse;

public class ResponseBook {
    private String id;
    private String caption;
    private String cover;
    private String edition;
    private String section;
    private String grade;
    //private Integer term;
    private String publish;
    private String subject;
    private String md5;
    private Long size;

    public ResponseBook() {
    }

    public ResponseBook(String id, String caption, String cover, String edition, String section, String grade, String publish, String subject, String md5, Long size) {
        this.id = id;
        this.caption = caption;
        this.cover = cover;
        this.edition = edition;
        this.section = section;
        this.grade = grade;
        this.publish = publish;
        this.subject = subject;
        this.md5 = md5;
        this.size = size;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
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

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "ResponseBook{" +
                "id='" + id + '\'' +
                ", caption='" + caption + '\'' +
                ", cover='" + cover + '\'' +
                ", edition='" + edition + '\'' +
                ", section='" + section + '\'' +
                ", grade='" + grade + '\'' +
                ", publish='" + publish + '\'' +
                ", subject='" + subject + '\'' +
                ", md5='" + md5 + '\'' +
                ", size=" + size +
                '}';
    }
}
