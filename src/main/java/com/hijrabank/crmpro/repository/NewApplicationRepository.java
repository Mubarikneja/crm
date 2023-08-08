package com.hijrabank.crmpro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hijrabank.crmpro.entity.NewApplication;

@Repository
public interface NewApplicationRepository extends JpaRepository<NewApplication, Long> {

    NewApplication findByfullNameIgnoreCase(String name);

    void deleteByfullName(String name);
    
}

