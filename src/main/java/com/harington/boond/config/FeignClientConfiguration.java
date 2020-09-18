package com.harington.boond.config;

import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignClientConfiguration {
    @Value("${boond.api.login}")
    private String boondApiAuthLogin;
    @Value("${boond.api.password}")
    private String boondApiAuthPassword;

    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
        return new BasicAuthRequestInterceptor(boondApiAuthLogin, boondApiAuthPassword);
    }
}
