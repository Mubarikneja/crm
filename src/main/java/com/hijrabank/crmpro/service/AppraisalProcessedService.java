package com.hijrabank.crmpro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import com.hijrabank.crmpro.entity.AppraisalProcessed;
import com.hijrabank.crmpro.repository.AppraisalProcessedRepository;



@Service
public class AppraisalProcessedService {

    @Autowired
    public AppraisalProcessedRepository appraisalProcessedRepository;

    public void saveAppraisalProcessed(AppraisalProcessed appraisalProcessed) {

        appraisalProcessedRepository.save(appraisalProcessed);       
    }

    public List<AppraisalProcessed> getAppraisalProcesseds() {

        return appraisalProcessedRepository.findAll();
    }

    public AppraisalProcessed getAppraisalProcessed(Long id) {

        return appraisalProcessedRepository.findById(id).get();
    }

    public AppraisalProcessed getAppraisalProcessedByName(String name) {

        return appraisalProcessedRepository.findByfullNameIgnoreCase(name);
    }

    public void delAppraisalProcessed(Long id) {

        appraisalProcessedRepository.deleteById(id);
    }

    public void delAppraisalProcessedByName(String name) {

        appraisalProcessedRepository.deleteByfullName(name);
    }
    
}
