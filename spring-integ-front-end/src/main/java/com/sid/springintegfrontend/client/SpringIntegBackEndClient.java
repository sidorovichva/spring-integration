package com.sid.springintegfrontend.client;

import com.sid.springintegfrontend.config.FeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "${backend.service.address}", url = "${backend.service.address}", configuration = FeignConfiguration.class)
public interface SpringIntegBackEndClient {

    @PostMapping("/main/add")
    String addMainEntry(@RequestParam String name);
}
