package com.sid.springintegration;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MainService {

    private final MainEntryRepository repository;

    public void addMainEntry(MainEntry entry) {
        repository.save(entry);
    }
}
