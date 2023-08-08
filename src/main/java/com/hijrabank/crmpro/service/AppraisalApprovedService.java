package com.hijrabank.crmpro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import com.hijrabank.crmpro.entity.AppraisalApproved;
import com.hijrabank.crmpro.repository.AppraisalApprovedRepository;

@Service
public class AppraisalApprovedService {

    @Autowired
    public AppraisalApprovedRepository appraisalApprovedRepository;

    public void saveAppraisalApproved(AppraisalApproved appraisalApproved) {

        appraisalApprovedRepository.save(appraisalApproved);
    }

    public List<AppraisalApproved> getAppraisalApproveds() {

        return appraisalApprovedRepository.findAll();
    }

    public AppraisalApproved getAppraisalApproved(Long id) {

        return appraisalApprovedRepository.findById(id).get();
    }

    public void delAppraisalApproved(Long id) {

        appraisalApprovedRepository.deleteById(id);
    }

    public AppraisalApproved getAppraisalApprovedByName(String name) {

        return appraisalApprovedRepository.findByfullNameIgnoreCase(name);
    }
    
}
