package com.hijrabank.crmpro.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.hijrabank.crmpro.entity.Applicant;
import com.hijrabank.crmpro.service.ApplicantService;

@RestController
@RequestMapping("/crm")
public class ApplicantController {

    
    public final ApplicantService applicantService;

    @Autowired
    public ApplicantController(ApplicantService applicantService){
        this.applicantService = applicantService;
    }

    @PostMapping("/applicants")
    public void saveApplicant(@RequestBody Applicant applicant){
         applicantService.saveApplicant(applicant);
    }

    @GetMapping("/applicants")
    public List<Applicant> getApplicants(){
        return applicantService.getApplicants();
    }

    @GetMapping("/applicants/{id}")
    public Applicant getApplicant(@PathVariable("id") Long id){
        return applicantService.getApplicant(id);
    }

    @DeleteMapping("/applicants/{id}")
    public void delApplicant(@PathVariable("id") Long id){
        applicantService.delApplicant(id);
    }

    @PutMapping("/applicant/{id}")
    public void updApplicant(@PathVariable("id") Long id, @RequestBody Applicant applicant){
        applicantService.updApplicant(id, applicant);
    }
    
}
