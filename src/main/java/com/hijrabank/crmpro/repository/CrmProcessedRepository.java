package com.hijrabank.crmpro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hijrabank.crmpro.entity.CrmProcessed;

@Repository
public interface CrmProcessedRepository extends JpaRepository<CrmProcessed, Long> {

    CrmProcessed findByfullNameIgnoreCase(String name);
    
}
