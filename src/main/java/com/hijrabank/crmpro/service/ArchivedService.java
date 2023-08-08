package com.hijrabank.crmpro.service;

import java.util.List;


import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import com.hijrabank.crmpro.entity.ArchivedApplication;
import com.hijrabank.crmpro.repository.ArchivedApplicationRepository;


@Service
public class ArchivedService {

    @Autowired
    public ArchivedApplicationRepository archivedApplicationRepository;

    public void saveArchived(ArchivedApplication archivedApplication) {

        archivedApplicationRepository.save(archivedApplication);
    }

    public List<ArchivedApplication> getArchiveds() {

        return archivedApplicationRepository.findAll();
    }

    public ArchivedApplication getArchived(Long id) {

        return archivedApplicationRepository.findById(id).get();
    }

    public ArchivedApplication getArchivedByName(String name) {

        return archivedApplicationRepository.findByfullNameIgnoreCase(name);
    }

    public void delArchived(Long id) {

        archivedApplicationRepository.deleteById(id);
    }

    public void delArchivedByName(String name) {

        archivedApplicationRepository.deleteByfullName(name);
    }

    
    
}
