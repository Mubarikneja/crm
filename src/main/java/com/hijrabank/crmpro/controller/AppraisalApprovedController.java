package com.hijrabank.crmpro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.hijrabank.crmpro.entity.AppraisalApproved;
import com.hijrabank.crmpro.service.AppraisalApprovedService;


@RestController
@RequestMapping("/appraisal-approved")
public class AppraisalApprovedController {

    public final AppraisalApprovedService appraisalApprovedService;

    @Autowired
    public AppraisalApprovedController(AppraisalApprovedService appraisalApprovedService){

        this.appraisalApprovedService = appraisalApprovedService;
    }

    @PostMapping("/")
    public void saveAppraisalApproved(@RequestBody AppraisalApproved appraisalApproved){

        appraisalApprovedService.saveAppraisalApproved(appraisalApproved);
    }

    @GetMapping("/")
    public List<AppraisalApproved> getAppraisalApproveds(){

        return appraisalApprovedService.getAppraisalApproveds();
    }

    @GetMapping("/id/{id}")
    public AppraisalApproved getAppraisalApproved(@PathVariable("id") Long id){

        return appraisalApprovedService.getAppraisalApproved(id);
    }

    @GetMapping("/name/{name}")
    public AppraisalApproved getAppraisalAprovedByName(@PathVariable("name") String name){

        return appraisalApprovedService.getAppraisalApprovedByName(name);
    }

    @DeleteMapping("/id/{id}")
    public void delAppraisalApproved(@PathVariable("id") Long id){
        
        appraisalApprovedService.delAppraisalApproved(id);
    }

    @DeleteMapping("/name/{name}")
    public void delAppraisalApprovedByName(@PathVariable("name") String name){

        appraisalApprovedService.delAppraisalApprovedByName(name);
    }
    
}
