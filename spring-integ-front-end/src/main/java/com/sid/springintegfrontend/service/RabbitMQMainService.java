package com.sid.springintegfrontend.service;

import com.sid.springintegfrontend.config.RabbitConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RabbitMQMainService implements IMainService {

    private final RabbitTemplate rabbitTemplate;

    public void addMainEntry(String name) {
        rabbitTemplate.convertAndSend(RabbitConfig.MAIN_SERVICE_NEW_ENTRY, name);
    }
}
