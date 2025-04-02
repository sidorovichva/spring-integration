package com.sid.springintegbackend;

import com.sid.springintegbackend.service.SimpleMainService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/main")
public class MainController {

    private final SimpleMainService service;

    @PostMapping("/add")
    public void addMainEntry(@RequestParam String name) {
        MainEntry entry = MainEntry.builder()
                .id(UUID.randomUUID().toString())
                .name(name)
                .build();
        service.addMainEntry(entry);
    }
}
