package com.hijrabank.crmpro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hijrabank.crmpro.entity.Applicant;

@Repository
public interface ApplicantRepository extends JpaRepository<Applicant, Long> {

    public Applicant findByfullNameIgnoreCase(String fullName);
    
}
