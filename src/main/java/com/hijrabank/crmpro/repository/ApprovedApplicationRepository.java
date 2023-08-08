package com.hijrabank.crmpro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hijrabank.crmpro.entity.ApprovedApplication;

@Repository
public interface ApprovedApplicationRepository extends JpaRepository<ApprovedApplication, Long> {

    ApprovedApplication findByfullNameIgnoreCase(String name);

    void deleteByfullName(String name);
    
}
