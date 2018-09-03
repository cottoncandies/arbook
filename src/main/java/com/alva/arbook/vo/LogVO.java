package com.alva.arbook.vo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class LogVO {
    private String email;
    private String title;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date time;

    public LogVO() {
    }

    public LogVO(String email, String title, Date time) {
        this.email = email;
        this.title = title;
        this.time = time;
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

    @Override
    public String toString() {
        return "LogVO{" +
                "email='" + email + '\'' +
                ", title='" + title + '\'' +
                ", time=" + time +
                '}';
    }
}
