package com.alva.arbook.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "user")
public class LoginUserConfig {

    private String sessionLoginUser;

    public String getSessionLoginUser() {
        return sessionLoginUser;
    }

    public void setSessionLoginUser(String sessionLoginUser) {
        this.sessionLoginUser = sessionLoginUser;
    }
}
