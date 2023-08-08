package com.hijrabank.crmpro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.hijrabank.crmpro.entity.NewApplication;
import com.hijrabank.crmpro.service.NewApplicationService;

@RestController
@RequestMapping("/new-application")
public class NewApplicationController {

    public final NewApplicationService newApplicationService;

    @Autowired
    public NewApplicationController(NewApplicationService newApplicationService){
        this.newApplicationService = newApplicationService;
    }

    @PostMapping("/")
    public void saveNewApplication(@RequestBody NewApplication newApplication){
        newApplicationService.saveNewApplication(newApplication);
    }

    @GetMapping("/")
    public List<NewApplication> getNewApplications(){
        return newApplicationService.getNewApplications();
    }

    @GetMapping("/id/{id}")
    public NewApplication getNewApplication(@PathVariable("id") Long id){
        return newApplicationService.getNewApplication(id);
    }

    @DeleteMapping("/id/{id}")
    public void delNewApplication(@PathVariable("id") Long id){
        newApplicationService.delNewApplication(id);
    }

    @DeleteMapping("/name/{name}")
    public void delNewApplicationByName(@PathVariable("name") String name){

        newApplicationService.delNewApplicationByName(name);
    }
    
    
}
