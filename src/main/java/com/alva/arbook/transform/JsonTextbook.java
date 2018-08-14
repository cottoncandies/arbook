package com.alva.arbook.transform;

public class JsonTextbook {

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

    public JsonTextbook() {
    }

    public JsonTextbook(String id, String cover, String caption, String edition, String section, String grade, String subject, String term, String publish, String catalog) {
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

    @Override
    public String toString() {
        return "JsonTextbook{" +
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
                '}';
    }
}
