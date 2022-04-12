package com.example.demo.config;

import com.example.demo.Status;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean("base")
    @Scope("prototype")
    @Primary
    public Status baseStatus() {
        return new Status("ON");
    }

    @Bean("second")
    public Status offStatus() {
        return new Status("OFF");
    }
}
