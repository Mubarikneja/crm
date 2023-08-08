package com.hijrabank.crmpro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import com.hijrabank.crmpro.entity.NewApplication;
import com.hijrabank.crmpro.repository.NewApplicationRepository;


@Service
public class NewApplicationService {

    @Autowired
    public NewApplicationRepository newApplicationRepository;


    public void saveNewApplication(NewApplication newApplication) {

        newApplicationRepository.save(newApplication);
    }

    public List<NewApplication> getNewApplications() {

        return newApplicationRepository.findAll();
    }


    public NewApplication getNewApplication(Long id) {

        return newApplicationRepository.findById(id).get();
    }

    public void delNewApplication(Long id) {

        newApplicationRepository.deleteById(id);
    }
    

    public NewApplication getNewApplicationByName(String name){
        
        return newApplicationRepository.findByfullNameIgnoreCase(name);
    }
}
