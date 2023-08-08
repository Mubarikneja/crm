package com.hijrabank.crmpro.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;


import com.hijrabank.crmpro.entity.Applicant;
import com.hijrabank.crmpro.service.ApplicantService;


@RestController
@RequestMapping("/applicants")
public class ApplicantController {

    
    public final ApplicantService applicantService;

    @Autowired
    public ApplicantController(ApplicantService applicantService){

        this.applicantService = applicantService;
    }

    @PostMapping("/")
    public void saveApplicant(@RequestBody Applicant applicant){

         applicantService.saveApplicant(applicant);
    }

    @GetMapping("/")
    public List<Applicant> getApplicants(){

        return applicantService.getApplicants();
    }

    @GetMapping("/id/{id}")
    public Applicant getApplicant(@PathVariable("id") Long id){

        return applicantService.getApplicant(id);
    }

    @GetMapping("/name/{name}")
    public Applicant getApplicantByName(@PathVariable("name") String name){

        return applicantService.getApplicantByName(name);
    }

    @DeleteMapping("/id/{id}")
    public void delApplicant(@PathVariable("id") Long id){
        
        applicantService.delApplicant(id);
    }

   
    
}
