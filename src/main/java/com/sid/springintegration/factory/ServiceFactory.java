package com.sid.springintegration.factory;

import com.sid.springintegration.service.IService;
import com.sid.springintegration.service.IntegrationMainService;
import com.sid.springintegration.service.SimpleMainService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ServiceFactory {

    private final SimpleMainService simpleMainService;
    private final IntegrationMainService integrationMainService;

    public IService getMainService() {
        IService returnedService = integrationMainService;
        log.info("{} is in use as a main service", returnedService.getClass().getSimpleName());
        return returnedService;
    }

}
