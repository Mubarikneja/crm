package com.hijrabank.crmpro.entity;



import jakarta.persistence.*;

@Entity
@Table(name = "appraisal_processed_applications")
public class AppraisalProcessedApplication {

    public AppraisalProcessedApplication() {
    }


    public AppraisalProcessedApplication(Long id, Long newApplicationId, String roleOfAssignment,
            ApplicationProgress progressOfApplication) {
        this.id = id;
        this.newApplicationId = newApplicationId;
        this.roleOfAssignment = roleOfAssignment;
        this.progressOfApplication = progressOfApplication;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "new_application_id", nullable = false)
    private Long newApplicationId;

    @Column(name = "role_of_assignment", nullable = false)
    private String roleOfAssignment;

    @Enumerated(EnumType.STRING)
    @Column(name = "progress_of_application", nullable = false)
    private ApplicationProgress progressOfApplication;


    public enum ApplicationProgress {
        Received,
        Checking,
        Approved
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


    public String getRoleOfAssignment() {
        return roleOfAssignment;
    }


    public void setRoleOfAssignment(String roleOfAssignment) {
        this.roleOfAssignment = roleOfAssignment;
    }


    public ApplicationProgress getProgressOfApplication() {
        return progressOfApplication;
    }


    public void setProgressOfApplication(ApplicationProgress progressOfApplication) {
        this.progressOfApplication = progressOfApplication;
    }

    
}
