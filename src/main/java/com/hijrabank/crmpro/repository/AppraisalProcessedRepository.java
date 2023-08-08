package com.hijrabank.crmpro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hijrabank.crmpro.entity.AppraisalProcessed;

@Repository
public interface AppraisalProcessedRepository extends JpaRepository<AppraisalProcessed, Long> {

    AppraisalProcessed findByfullNameIgnoreCase(String name);

    void deleteByfullName(String name);
    
}
