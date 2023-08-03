package com.hijrabank.crmpro.service;

import java.util.List;
import java.util.Objects;

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


    
    public void updApplicant(Long id, Applicant applicant) {

        Applicant appDB = applicantRepository.findById(id).get();

        if(Objects.nonNull(applicant.getFullName()) && !"".equalsIgnoreCase(applicant.getFullName())){
            appDB.setFullName(applicant.getFullName());
        }

        if(Objects.nonNull(applicant.getAddress()) && !"".equalsIgnoreCase(applicant.getAddress())){
            appDB.setAddress(applicant.getAddress());
        }

        if(Objects.nonNull(applicant.getEmail()) && !"".equalsIgnoreCase(applicant.getEmail())){
            appDB.setEmail(applicant.getEmail());
        }

        if(Objects.nonNull(applicant.getTelephoneNumber()) && !"".equalsIgnoreCase(applicant.getTelephoneNumber())){
            appDB.setTelephoneNumber(applicant.getTelephoneNumber());
        }

        if(Objects.nonNull(applicant.getMaritalStatus()) && !"".equalsIgnoreCase(applicant.getMaritalStatus())){
            appDB.setMaritalStatus(applicant.getMaritalStatus());
        }

        if(Objects.nonNull(applicant.getIdNumber()) && !"".equalsIgnoreCase(applicant.getIdNumber())){
            appDB.setIdNumber(applicant.getIdNumber());
        }
    }
    
}
