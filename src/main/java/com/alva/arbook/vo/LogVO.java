package com.alva.arbook.vo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class LogVO {
    private Integer id;
    private String email;
    private String title;
    private String method;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date time;
    private String detail;

    public LogVO() {
    }

    public LogVO(Integer id, String email, String title, Date time, String detail) {
        this.id = id;
        this.email = email;
        this.title = title;
        this.time = time;
        this.detail = detail;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "LogVO{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", title='" + title + '\'' +
                ", time=" + time +
                ", detail='" + detail + '\'' +
                '}';
    }
}
