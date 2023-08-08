package com.hijrabank.crmpro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;


import com.hijrabank.crmpro.entity.CrmProcessed;
import com.hijrabank.crmpro.service.CrmProcessedService;


@RestController
@RequestMapping("/crm-processed")
public class CrmProcessedController {

    public final CrmProcessedService crmProcessedService;

    @Autowired
    public CrmProcessedController(CrmProcessedService crmProcessedService){

        this.crmProcessedService = crmProcessedService;
    }

    @PostMapping("/")
    public void saveCrmProcessed(@RequestBody CrmProcessed crmProcessed){

        crmProcessedService.saveCrmProcessed(crmProcessed);
    }

    @GetMapping("/")
    public List<CrmProcessed> getCrmPocesseds(){

        return crmProcessedService.getCrmProcesseds();
    }

    @GetMapping("/id/{id}")
    public CrmProcessed getCrmProcessed(@PathVariable("id") Long id){

        return crmProcessedService.getCrmProcessed(id);
    }

    @GetMapping("/name/{name}")
    public CrmProcessed getCrmProcessedByName(@PathVariable("name") String name){

        return crmProcessedService.getCrmProcessedByName(name);
    }

    @DeleteMapping("/id/{id}")
    public void delCrmProcessed(@PathVariable("id") Long id){
        
        crmProcessedService.delCrmProcessed(id);
    }
    
}
