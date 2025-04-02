package com.sid.springintegfrontend;

import com.sid.springintegfrontend.factory.MainServiceFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/main")
public class MainController {

    private final MainServiceFactory mainServiceFactory;

    @PostMapping("/add")
    public void addMainEntry(@RequestParam String name) {
        mainServiceFactory.getMainServiceImplementation().addMainEntry(name);
    }
}
