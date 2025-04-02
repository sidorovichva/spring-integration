package com.sid.springintegfrontend;

import com.sid.springintegfrontend.factory.MainServiceFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/main")
public class MainController {

    private final MainServiceFactory mainServiceFactory;

    @PostMapping("/add")
    public ResponseEntity<String> addMainEntry(@RequestParam String name) {
        String response = mainServiceFactory.getMainServiceImplementation().addMainEntry(name);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
