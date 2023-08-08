package com.hijrabank.crmpro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hijrabank.crmpro.entity.AppraisalApproved;

@Repository
public interface AppraisalApprovedRepository extends JpaRepository<AppraisalApproved, Long> {

    AppraisalApproved findByfullNameIgnoreCase(String name);
    
}
