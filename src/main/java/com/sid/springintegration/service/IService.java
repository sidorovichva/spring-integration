package com.sid.springintegration.service;

import com.sid.springintegration.MainEntry;

import java.util.List;

public interface IService {

    void addMainEntry(MainEntry entry);
    List<MainEntry> getAllEntries();
}
