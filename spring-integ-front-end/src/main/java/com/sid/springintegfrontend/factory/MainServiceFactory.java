package com.sid.springintegfrontend.factory;

import com.sid.springintegfrontend.service.IMainService;
import com.sid.springintegfrontend.service.OpenFeignMainService;
import com.sid.springintegfrontend.service.RabbitMQMainService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MainServiceFactory {

    private final OpenFeignMainService openFeignMainService;
    private final RabbitMQMainService rabbitMQMainService;

    public IMainService getMainServiceImplementation() {
        return rabbitMQMainService;
    }
}
