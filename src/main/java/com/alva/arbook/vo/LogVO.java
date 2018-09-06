package com.alva.arbook.vo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class LogVO {
    private Integer id;
    private String type;
    private String email;
    private String title;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
    private String detail;
    private String status;

    public LogVO() {
    }

    public LogVO(Integer id, String type, String email, String title, Date createTime, String detail, String status) {

        this.id = id;
        this.type = type;
        this.email = email;
        this.title = title;
        this.createTime = createTime;
        this.detail = detail;
        this.status = status;
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "LogVO{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", email='" + email + '\'' +
                ", title='" + title + '\'' +
                ", createTime=" + createTime +
                ", detail='" + detail + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
