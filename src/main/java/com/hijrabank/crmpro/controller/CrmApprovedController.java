package com.hijrabank.crmpro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.hijrabank.crmpro.entity.CrmApproved;
import com.hijrabank.crmpro.service.CrmApprovedService;

@RestController
@RequestMapping("/crm-approved")
public class CrmApprovedController {

    public final CrmApprovedService crmApprovedService;

    @Autowired
    public CrmApprovedController(CrmApprovedService crmApprovedService){

        this.crmApprovedService = crmApprovedService;
    }

    @PostMapping("/")
    public void saveCrmApproved(@RequestBody CrmApproved crmApproved){

        crmApprovedService.saveCrmApproved(crmApproved);
    }

    @GetMapping("/")
    public List<CrmApproved> getCrmApproveds(){

        return crmApprovedService.getCrmApproveds();
    }

    @GetMapping("/id/{id}")
    public CrmApproved getCrmApproved(@PathVariable("id") Long id){

        return crmApprovedService.getCrmApproved(id);
    }

    @GetMapping("/name/{name}")
    public CrmApproved getCrmAprovedByName(@PathVariable("name") String name){

        return crmApprovedService.getCrmApprovedByName(name);
    }

    @DeleteMapping("/id/{id}")
    public void delCrmApproved(@PathVariable("id") Long id){
        
        crmApprovedService.delCrmApproved(id);
    }
    
}
