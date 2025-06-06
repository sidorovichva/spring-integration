package com.sid.springintegration.service;

import com.sid.springintegration.MainEntry;
import com.sid.springintegration.MainEntryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IntegrationMainService implements IService {

    private final MainEntryRepository repository;

    public List<MainEntry> getAllEntries() {
        return repository.findAll();
    }

    @ServiceActivator(inputChannel = "registrationRequest")
    public void addMainEntry(MainEntry entry) {
        repository.save(entry);
    }
}
