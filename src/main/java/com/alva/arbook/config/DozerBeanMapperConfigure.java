package com.alva.arbook.config;

import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class DozerBeanMapperConfigure {
    @Bean
    public DozerBeanMapper mapper() {
        DozerBeanMapper mapper = new DozerBeanMapper();
        mapper.setMappingFiles(Arrays.asList(
                "dozer/Textbook_DO_VO.xml",
                "dozer/User_DTO_DO.xml",
                "dozer/Log_DO_VO.xml",
                "dozer/User_DO_VO.xml",
                "dozer/Textbook_DTO_DO.xml")
        );
        return mapper;
    }
}
