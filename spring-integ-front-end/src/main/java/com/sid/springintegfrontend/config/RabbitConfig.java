package com.sid.springintegfrontend.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

    public static final String MAIN_SERVICE_NEW_ENTRY = "main-service-new-entry";

    @Bean
    public Queue queue() {
        return new Queue(MAIN_SERVICE_NEW_ENTRY, true);
    }
}
