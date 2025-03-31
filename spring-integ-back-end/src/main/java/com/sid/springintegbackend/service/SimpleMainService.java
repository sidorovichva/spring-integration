package com.sid.springintegbackend.service;

import com.sid.springintegbackend.MainEntry;
import com.sid.springintegbackend.MainEntryRepository;
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
