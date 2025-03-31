package com.sid.springintegfrontend;

import com.sid.springintegfrontend.clients.SpringIntegBackEndClient;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/main")
public class MainController {

    private final SpringIntegBackEndClient client;

    @PostMapping("/add")
    public ResponseEntity<String> addMainEntry(@RequestParam String name) {
        String response = client.addMainEntry(name);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
