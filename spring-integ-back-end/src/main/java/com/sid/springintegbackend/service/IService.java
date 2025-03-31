package com.sid.springintegbackend.service;


import com.sid.springintegbackend.MainEntry;

import java.util.List;

public interface IService {

    void addMainEntry(MainEntry entry);
    List<MainEntry> getAllEntries();
}
