package com.example.starwars.configuration;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@Getter
public class AppConfig {

    @Value("${api.item.url}")
    private String itemUrl;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
