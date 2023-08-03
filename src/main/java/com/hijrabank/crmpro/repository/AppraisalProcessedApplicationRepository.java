package com.hijrabank.crmpro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hijrabank.crmpro.entity.AppraisalProcessedApplication;

@Repository
public interface AppraisalProcessedApplicationRepository extends JpaRepository<AppraisalProcessedApplication, Long> {
    
}
