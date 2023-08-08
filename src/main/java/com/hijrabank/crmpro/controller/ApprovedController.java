package com.hijrabank.crmpro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.hijrabank.crmpro.entity.ApprovedApplication;
import com.hijrabank.crmpro.service.ApprovedService;


@RestController
@RequestMapping("/approved")
public class ApprovedController {

    public final ApprovedService approvedService;

    @Autowired
    public ApprovedController(ApprovedService approvedService){

        this.approvedService = approvedService;
    }

    @PostMapping("/")
    public void saveApproved(@RequestBody ApprovedApplication approvedApplication){

        approvedService.saveApproved(approvedApplication);
    }

    @GetMapping("/")
    public List<ApprovedApplication> getApproveds(){

        return approvedService.getApproveds();
    }

    @GetMapping("/id/{id}")
    public ApprovedApplication getApproved(@PathVariable("id") Long id){

        return approvedService.getApproved(id);
    }

    @GetMapping("/name/{name}")
    public ApprovedApplication getApprovedByName(@PathVariable("name") String name){

        return approvedService.getApprovedByName(name);
    }

    @DeleteMapping("/id/{id}")
    public void delApproved(@PathVariable("id") Long id){
        
        approvedService.delApproved(id);
    }

    @DeleteMapping("/name/{name}")
    public void delApprovedByName(@PathVariable("name") String name){

        approvedService.delApprovedByName(name);
    }    
    
}
