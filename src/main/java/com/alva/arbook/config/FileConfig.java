package com.alva.arbook.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "file")
public class FileConfig {

    private String baseExportPath;

    private String baseUploadPath;

    public String getExportPath() {
        return baseExportPath;
    }

    public void setExportPath(String baseExportPath) {
        this.baseExportPath = baseExportPath;
    }

    public String getBaseUploadtPath() {
        return baseUploadPath;
    }

    public void setBaseUploadtPath(String baseUploadtPath) {
        this.baseUploadPath = baseUploadtPath;
    }
}
