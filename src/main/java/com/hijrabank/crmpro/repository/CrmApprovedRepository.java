package com.hijrabank.crmpro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hijrabank.crmpro.entity.CrmApproved;

@Repository
public interface CrmApprovedRepository extends JpaRepository<CrmApproved, Long> {

    CrmApproved findByfullNameIgnoreCase(String name);
    
}
