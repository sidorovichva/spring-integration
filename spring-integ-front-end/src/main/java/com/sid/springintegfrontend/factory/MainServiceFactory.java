package com.sid.springintegfrontend.factory;

import com.sid.springintegfrontend.service.IMainService;
import com.sid.springintegfrontend.service.OpenFeignMainService;
import com.sid.springintegfrontend.service.RabbitMQMainService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MainServiceFactory {

    private final OpenFeignMainService openFeignMainService;
    private final RabbitMQMainService rabbitMQMainService;

    public IMainService getMainServiceImplementation() {
        return openFeignMainService;
    }
}
