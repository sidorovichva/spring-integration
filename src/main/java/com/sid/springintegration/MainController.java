package com.sid.springintegration;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class MainController {

    private final MainService service;

    @PostMapping("/add")
    public void addMainEntry(@RequestParam String name) {
        MainEntry entry = MainEntry.builder()
                .id(UUID.randomUUID().toString())
                .name(name)
                .build();
        service.addMainEntry(entry);
    }
}
