package com.hijrabank.crmpro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hijrabank.crmpro.entity.CrmProcessedApplication;

@Repository
public interface CrmProcessedApplicationRepository extends JpaRepository<CrmProcessedApplication, Long> {
    
}
