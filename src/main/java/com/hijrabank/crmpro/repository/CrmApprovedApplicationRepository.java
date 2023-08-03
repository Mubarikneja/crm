package com.hijrabank.crmpro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hijrabank.crmpro.entity.CrmApprovedApplication;

@Repository
public interface CrmApprovedApplicationRepository extends JpaRepository<CrmApprovedApplication, Long> {
    
}
