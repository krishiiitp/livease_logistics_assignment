package com.load.load.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.load.load.services.LoadService;
import com.load.load.services.LoadServiceImplementation;
@Configuration
public class LoadConfig {
    @Bean
    LoadService loadService() {
        return new LoadServiceImplementation();
    }
}
