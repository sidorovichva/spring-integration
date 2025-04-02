package com.sid.springintegfrontend.service;

import com.sid.springintegfrontend.client.SpringIntegBackEndClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OpenFeignMainService implements IMainService {

    private final SpringIntegBackEndClient client;

    public String addMainEntry(String name) {
        return client.addMainEntry(name);
    }
}
