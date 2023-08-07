package com.hijrabank.crmpro.entity;


import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "archived_applications")
public class ArchivedApplication {

    public ArchivedApplication() {
    }

    public ArchivedApplication(Long id, Long newApplicationId, LocalDateTime archivedDate, String archivedReason) {
        this.id = id;
        this.newApplicationId = newApplicationId;
        this.archivedDate = archivedDate;
        this.archivedReason = archivedReason;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "new_application_id", nullable = false)
    private Long newApplicationId;

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

    
}
