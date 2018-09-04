package com.alva.arbook.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

public class SysLogT implements Serializable {
    private Integer szId;

    private String szType;

    private String szTitle;

    private String szRemoteAddr;

    private String szRequestUri;

    private String szMethod;

    private String szParams;

    private Date tsCreated;

    private String szEmail;

    private String szDetail;

    private static final long serialVersionUID = 1L;

    public Integer getSzId() {
        return szId;
    }

    public void setSzId(Integer szId) {
        this.szId = szId == null ? null : szId;
    }

    public String getSzType() {
        return szType;
    }

    public void setSzType(String szType) {
        this.szType = szType == null ? null : szType.trim();
    }

    public String getSzTitle() {
        return szTitle;
    }

    public void setSzTitle(String szTitle) {
        this.szTitle = szTitle == null ? null : szTitle.trim();
    }

    public String getSzRemoteAddr() {
        return szRemoteAddr;
    }

    public void setSzRemoteAddr(String szRemoteAddr) {
        this.szRemoteAddr = szRemoteAddr == null ? null : szRemoteAddr.trim();
    }

    public String getSzRequestUri() {
        return szRequestUri;
    }

    public void setSzRequestUri(String szRequestUri) {
        this.szRequestUri = szRequestUri == null ? null : szRequestUri.trim();
    }

    public String getSzMethod() {
        return szMethod;
    }

    public void setSzMethod(String szMethod) {
        this.szMethod = szMethod == null ? null : szMethod.trim();
    }

    public String getSzParams() {
        return szParams;
    }

    /**
     * 设置请求参数
     *
     * @param paramMap
     */
    public void setMapToParams(Map<String, String[]> paramMap) {
        if (paramMap == null) {
            return;
        }
        StringBuilder params = new StringBuilder();
        for (Map.Entry<String, String[]> param : paramMap.entrySet()) {
            params.append(("".equals(params.toString()) ? "" : "&") + param.getKey() + "=");
            String paramValue = (param.getValue() != null && param.getValue().length > 0 ? param.getValue()[0] : "");
            //params.append(StringUtils.abbr(StringUtils.endsWithIgnoreCase(param.getKey(), "password") ? "" : paramValue, 100));
            params.append(paramValue);
        }
        this.szParams = params.toString();
    }

    public Date getTsCreated() {
        return tsCreated;
    }

    public void setTsCreated(Date tsCreated) {
        this.tsCreated = tsCreated;
    }

    public String getSzEmail() {
        return szEmail;
    }

    public void setSzEmail(String szEmail) {
        this.szEmail = szEmail == null ? null : szEmail.trim();
    }

    public String getSzDetail() {
        return szDetail;
    }

    public void setSzDetail(String szDetail) {
        this.szDetail = szDetail;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", szId=").append(szId);
        sb.append(", szType=").append(szType);
        sb.append(", szTitle=").append(szTitle);
        sb.append(", szRemoteAddr=").append(szRemoteAddr);
        sb.append(", szRequestUri=").append(szRequestUri);
        sb.append(", szMethod=").append(szMethod);
        sb.append(", szParams=").append(szParams);
        sb.append(", tsCreated=").append(tsCreated);
        sb.append(", szEmail=").append(szEmail);
        sb.append(", szDetail=").append(szDetail);
        sb.append("]");
        return sb.toString();
    }
}