package com.hijrabank.crmpro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hijrabank.crmpro.entity.ArchivedApplication;

@Repository
public interface ArchivedApplicationRepository extends JpaRepository<ArchivedApplication, Long> {
    
}
