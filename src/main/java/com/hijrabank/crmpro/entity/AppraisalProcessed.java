package com.hijrabank.crmpro.entity;



import jakarta.persistence.*;

@Entity
@Table(name = "appraisal_processed")
public class AppraisalProcessed {

    public AppraisalProcessed(Long id, Long newApplicationId, String fullName, String processedBy,
            ApplicationProgress progressOfApplication) {
        this.id = id;
        this.newApplicationId = newApplicationId;
        this.fullName = fullName;
        this.processedBy = processedBy;
        this.progressOfApplication = progressOfApplication;
    }


    public AppraisalProcessed() {
    }




    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "new_application_id", nullable = false)
    private Long newApplicationId;

    @Column(name = "full_name", nullable = false)
    private String fullName;

    @Column(name = "processed_by", nullable = false)
    private String processedBy;

    @Enumerated(EnumType.STRING)
    @Column(name = "progress_of_application", nullable = false)
    private ApplicationProgress progressOfApplication;


    public enum ApplicationProgress {
        Approved,
        Checking,
        Received
        
    }


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


    public String getprocessedBy() {
        return processedBy;
    }


    public void setprocessedBy(String processedBy) {
        this.processedBy = processedBy;
    }


    public ApplicationProgress getProgressOfApplication() {
        return progressOfApplication;
    }


    public void setProgressOfApplication(ApplicationProgress progressOfApplication) {
        this.progressOfApplication = progressOfApplication;
    }

    public String getFullName() {
        return fullName;
    }


    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    
}
