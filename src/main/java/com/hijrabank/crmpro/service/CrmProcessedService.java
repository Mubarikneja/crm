package com.hijrabank.crmpro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import com.hijrabank.crmpro.entity.CrmProcessed;
import com.hijrabank.crmpro.repository.CrmProcessedRepository;



@Service
public class CrmProcessedService {

    @Autowired
    public CrmProcessedRepository crmProcessedRepository;


    public void saveCrmProcessed(CrmProcessed crmProcessed) {

        crmProcessedRepository.save(crmProcessed);
    }

    public List<CrmProcessed> getCrmProcesseds() {

        return crmProcessedRepository.findAll();
    }

    public CrmProcessed getCrmProcessed(Long id) {

        return crmProcessedRepository.findById(id).get();
    }

    public void delCrmProcessed(Long id) {
        
        crmProcessedRepository.deleteById(id);
    }

    public CrmProcessed getCrmProcessedByName(String name) {

        return crmProcessedRepository.findByfullNameIgnoreCase(name);
    }

    public void delCrmProcessedByName(String name) {
        
        crmProcessedRepository.deleteByfullName(name);
    }
    
}
