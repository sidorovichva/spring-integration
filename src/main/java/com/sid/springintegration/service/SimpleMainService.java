package com.sid.springintegration.service;

import com.sid.springintegration.MainEntry;
import com.sid.springintegration.MainEntryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SimpleMainService implements IService {

    private final MainEntryRepository repository;

    public List<MainEntry> getAllEntries() {
        return repository.findAll();
    }

    public void addMainEntry(MainEntry entry) {
        repository.save(entry);
    }
}
