package com.hijrabank.crmpro.entity;


import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "crm_processed")
public class CrmProcessed {

    public CrmProcessed() {
    }

    public CrmProcessed(Long id, String fullName, Long newApplicationId, LocalDateTime processingDate,
            String processedBy, ApplicationProcessingStatus processingStatus, String comments) {
        this.id = id;
        this.fullName = fullName;
        this.newApplicationId = newApplicationId;
        this.processingDate = processingDate;
        this.processedBy = processedBy;
        this.processingStatus = processingStatus;
        this.comments = comments;
    }
    


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "full_name", nullable = false)
    private String fullName;


    @Column(name = "new_application_id", nullable = false)
    private Long newApplicationId;

    @Column(name = "processing_date", nullable = false)
    private LocalDateTime processingDate;

    @Column(name = "processed_by", nullable = false)
    private String processedBy;

    @Enumerated(EnumType.STRING)
    @Column(name = "processing_status", nullable = false)
    private ApplicationProcessingStatus processingStatus;

    @Column(name = "comments", columnDefinition = "TEXT")
    private String comments;



    public enum ApplicationProcessingStatus {
        Checking,
        Received,
        Submitted
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }


    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    public Long getNewApplicationId() {
        return newApplicationId;
    }


    public void setNewApplicationId(Long newApplicationId) {
        this.newApplicationId = newApplicationId;
    }


    public LocalDateTime getProcessingDate() {
        return processingDate;
    }


    public void setProcessingDate(LocalDateTime processingDate) {
        this.processingDate = processingDate;
    }


    public String getProcessedBy() {
        return processedBy;
    }


    public void setProcessedBy(String processedBy) {
        this.processedBy = processedBy;
    }


    public ApplicationProcessingStatus getProcessingStatus() {
        return processingStatus;
    }


    public void setProcessingStatus(ApplicationProcessingStatus processingStatus) {
        this.processingStatus = processingStatus;
    }


    public String getComments() {
        return comments;
    }


    public void setComments(String comments) {
        this.comments = comments;
    }
    

    
}
