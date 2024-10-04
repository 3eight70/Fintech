package ru.fintech.tinkoff.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class AppConfiguration {
    @Bean
    public RestClient restTemplate() {
        return RestClient.create();
    }
}
