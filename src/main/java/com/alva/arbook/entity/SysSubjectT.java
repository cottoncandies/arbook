package com.alva.arbook.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class SysSubjectT implements Serializable {
    @JsonProperty("id")
    private String szId;
    @JsonProperty("subject")
    private String szCaption;

    private static final long serialVersionUID = 1L;

    public String getSzId() {
        return szId;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", szId=").append(szId);
        sb.append(", szCaption=").append(szCaption);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}