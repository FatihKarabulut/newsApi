package com.ahbap.News.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.client.RestTemplate;

@Configuration
public class TampletBean {

    @Bean
    @Scope("prototype")
    public RestTemplate restTamplets()
    {
        return new RestTemplate();
    }
}
