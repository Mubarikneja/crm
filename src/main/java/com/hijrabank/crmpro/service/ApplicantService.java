package com.hijrabank.crmpro.service;

import java.util.List;


import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;


import com.hijrabank.crmpro.entity.Applicant;
import com.hijrabank.crmpro.repository.ApplicantRepository;


@Service
public class ApplicantService {

    @Autowired
    public ApplicantRepository applicantRepository; 

    public void saveApplicant(Applicant applicant) {

        applicantRepository.save(applicant);
    }

    public List<Applicant> getApplicants() {

        return applicantRepository.findAll();
    }

    public Applicant getApplicant(Long id) {

        return applicantRepository.findById(id).get();
    }

    public void delApplicant(Long id) {

        applicantRepository.deleteById(id);
    }


    public Applicant getApplicantByName(String name) {

        return applicantRepository.findByfullNameIgnoreCase(name);
    }

    public void delApplicantByName(String name) {
        
        applicantRepository.deleteByfullName(name);
    }
  
}
