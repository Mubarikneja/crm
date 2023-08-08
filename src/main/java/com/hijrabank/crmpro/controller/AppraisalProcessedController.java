package com.hijrabank.crmpro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.hijrabank.crmpro.entity.AppraisalProcessed;
import com.hijrabank.crmpro.service.AppraisalProcessedService;


@RestController
@RequestMapping("/appraisal-processed")
public class AppraisalProcessedController {
    
    public final AppraisalProcessedService appraisalProcessedService;

    @Autowired
    public AppraisalProcessedController(AppraisalProcessedService appraisalProcessedService){
        this.appraisalProcessedService = appraisalProcessedService;
    }

    @PostMapping("/")
    public void saveAppraisalProcessed(@RequestBody AppraisalProcessed appraisalProcessed){

        appraisalProcessedService.saveAppraisalProcessed(appraisalProcessed);
    }

    @GetMapping("/")
    public List<AppraisalProcessed> getAppraisalProcesseds(){

        return appraisalProcessedService.getAppraisalProcesseds();
    }

    @GetMapping("/id/{id}")
    public AppraisalProcessed getAppraisalProcessed(@PathVariable("id") Long id){

        return appraisalProcessedService.getAppraisalProcessed(id);
    }

    @GetMapping("/name/{name}")
    public AppraisalProcessed getAppraisalProcessedByName(@PathVariable("name") String name){

        return appraisalProcessedService.getAppraisalProcessedByName(name);
    }

    @DeleteMapping("/id/{id}")
    public void delAppraisalProcessed(@PathVariable("id") Long id){
        
        appraisalProcessedService.delAppraisalProcessed(id);
    }

    @DeleteMapping("/name/{name}")
    public void delAppraisalProcessedByName(@PathVariable("name") String name){

        appraisalProcessedService.delAppraisalProcessedByName(name);
    }
    
}
