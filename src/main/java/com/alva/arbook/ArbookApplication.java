package com.alva.arbook;

import com.alva.arbook.interceptor.LoginInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@MapperScan("com.alva.arbook.dao")
@PropertySource(value = "classpath:file-config.yml")
public class ArbookApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(ArbookApplication.class, args);
    }

    @Configuration
    public class WebMvcConfig extends WebMvcConfigurerAdapter {
        @Override
        public void addInterceptors(InterceptorRegistry registry) {
            registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**")
                    .addPathPatterns("/**.html")
                    .excludePathPatterns("/login**");
        }
    }
}
