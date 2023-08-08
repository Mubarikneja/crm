package com.hijrabank.crmpro.service;

import java.util.List;


import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import com.hijrabank.crmpro.entity.ApprovedApplication;
import com.hijrabank.crmpro.repository.ApprovedApplicationRepository;


@Service
public class ApprovedService {

    @Autowired
    public ApprovedApplicationRepository approvedApplicationRepository;

    public void saveApproved(ApprovedApplication approvedApplication) {

        approvedApplicationRepository.save(approvedApplication);
    }

    public List<ApprovedApplication> getApproveds() {

        return approvedApplicationRepository.findAll();
    }

    public ApprovedApplication getApproved(Long id) {

        return approvedApplicationRepository.findById(id).get();
    }

    public ApprovedApplication getApprovedByName(String name) {

        return approvedApplicationRepository.findByfullNameIgnoreCase(name);
    }

    public void delApproved(Long id) {

        approvedApplicationRepository.deleteById(id);
    }

    public void delApprovedByName(String name) {

        approvedApplicationRepository.deleteByfullName(name);
    }
    
}
