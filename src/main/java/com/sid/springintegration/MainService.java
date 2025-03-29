package com.sid.springintegration;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MainService {

    private final MainEntryRepository repository;

    public List<MainEntry> getAllEntries() {
        return repository.findAll();
    }

    public void addMainEntry(MainEntry entry) {
        repository.save(entry);
    }
}
