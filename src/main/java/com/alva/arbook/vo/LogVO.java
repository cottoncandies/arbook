package com.alva.arbook.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

public class LogVO {
    private String id;
    private String email;
    private String title;
    @JsonFormat(pattern = "yyyy年MM月dd日 HH时mm分ss秒")
    @DateTimeFormat(pattern = "yyyy年MM月dd日 HH时mm分ss秒")
    private String time;
    private String type;
    private String address;
    private String uri;
    private String method;
    private String params;

    public LogVO() {
    }

    public LogVO(String id, String email, String title, String time, String type, String address, String uri, String method, String params) {
        this.id = id;
        this.email = email;
        this.title = title;
        this.time = time;
        this.type = type;
        this.address = address;
        this.uri = uri;
        this.method = method;
        this.params = params;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    @Override
    public String toString() {
        return "LogVO{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", title='" + title + '\'' +
                ", time='" + time + '\'' +
                ", type='" + type + '\'' +
                ", address='" + address + '\'' +
                ", uri='" + uri + '\'' +
                ", method='" + method + '\'' +
                ", params='" + params + '\'' +
                '}';
    }
}
