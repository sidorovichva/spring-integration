package com.sid.springintegration;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/main")
public class MainController {

    private final MainService service;

    @GetMapping("/getAll")
    public List<MainEntry> getAllEntries() {
        return service.getAllEntries();
    }

    @PostMapping("/add")
    public ResponseEntity<String> addMainEntry(@RequestParam String name) {
        MainEntry entry = MainEntry.builder()
                .id(UUID.randomUUID().toString())
                .name(name)
                .build();
        service.addMainEntry(entry);
        return ResponseEntity.status(HttpStatus.CREATED).body("Entry added");
    }
}
