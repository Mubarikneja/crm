package com.hijrabank.crmpro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.hijrabank.crmpro.entity.ArchivedApplication;
import com.hijrabank.crmpro.service.ArchivedService;


@RestController
@RequestMapping("/archived")
public class ArchivedController {


    public final ArchivedService archivedService;

    @Autowired 
    public ArchivedController(ArchivedService archivedService){

        this.archivedService = archivedService;
    }

    @PostMapping("/")
    public void saveArchived(@RequestBody ArchivedApplication archivedApplication){

         archivedService.saveArchived(archivedApplication);
    }

    @GetMapping("/")
    public List<ArchivedApplication> getArchiveds(){

        return archivedService.getArchiveds();
    }

    @GetMapping("/id/{id}")
    public ArchivedApplication getArchived(@PathVariable("id") Long id){

        return archivedService.getArchived(id);
    }

    @GetMapping("/name/{name}")
    public ArchivedApplication getArchivedByName(@PathVariable("name") String name){

        return archivedService.getArchivedByName(name);
    }

    @DeleteMapping("/id/{id}")
    public void delArchived(@PathVariable("id") Long id){
        
        archivedService.delArchived(id);
    }

    @DeleteMapping("/name/{name}")
    public void delArchivedByName(@PathVariable("name") String name){

        archivedService.delArchivedByName(name);
    }


    
}
