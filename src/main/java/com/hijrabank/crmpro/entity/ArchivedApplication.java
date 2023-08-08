package com.hijrabank.crmpro.entity;


import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "archived_applications")
public class ArchivedApplication {

    public ArchivedApplication(Long id, Long newApplicationId, String fullName, LocalDateTime archivedDate,
            String archivedReason) {
        this.id = id;
        this.newApplicationId = newApplicationId;
        this.fullName = fullName;
        this.archivedDate = archivedDate;
        this.archivedReason = archivedReason;
    }

    public ArchivedApplication() {
    }



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "new_application_id", nullable = false)
    private Long newApplicationId;

    @Column(name = "full_name", nullable = false)
    private String fullName;

    @Column(name = "archived_date", nullable = false)
    private LocalDateTime archivedDate;

    @Column(name = "archived_reason")
    private String archivedReason;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNewApplicationId() {
        return newApplicationId;
    }

    public void setNewApplicationId(Long newApplicationId) {
        this.newApplicationId = newApplicationId;
    }

    public LocalDateTime getArchivedDate() {
        return archivedDate;
    }

    public void setArchivedDate(LocalDateTime archivedDate) {
        this.archivedDate = archivedDate;
    }

    public String getArchivedReason() {
        return archivedReason;
    }

    public void setArchivedReason(String archivedReason) {
        this.archivedReason = archivedReason;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    
}
