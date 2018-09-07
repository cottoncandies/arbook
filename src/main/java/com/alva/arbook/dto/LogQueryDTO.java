package com.alva.arbook.dto;

public class LogQueryDTO {

    private String email;
    private String type;
    private String title;
    private String startTime;
    private String endTime;
    private Integer page;
    private Integer limit;

    public LogQueryDTO() {
    }

    public LogQueryDTO(String email, String type, String title, String startTime, String endTime, Integer page, Integer limit) {
        this.email = email;
        this.type = type;
        this.title = title;
        this.startTime = startTime;
        this.endTime = endTime;
        this.page = page;
        this.limit = limit;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
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
        return "LogQueryDTO{" +
                "email='" + email + '\'' +
                ", type='" + type + '\'' +
                ", title='" + title + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", page=" + page +
                ", limit=" + limit +
                '}';
    }
}
