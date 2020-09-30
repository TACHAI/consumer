package com.laishishui.consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Create by tachai on 2020-09-29 20:43
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
@Configuration
public class DepartCodeConfig {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
