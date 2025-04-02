package com.sid.springintegfrontend.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class RabbitMQListener {

    @RabbitListener(queues = RabbitConfig.MAIN_SERVICE_NEW_ENTRY)
    public void receive(String message) {
        log.info("Received: {}", message);
    }
}
