package com.hijrabank.crmpro.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.*;



@Entity
@Table(name = "new_applications")
public class NewApplication {

    public NewApplication() {
    }

    public NewApplication(Long id, String fullName, String idNumber, String loanCategory,
            BigDecimal requestedLoanAmount, String collateralType, PriorityLevel priorityLevel,
            LocalDateTime dateOfSubmission, byte[] documents, ApplicationStatus status, String assignedOfficer) {
        this.id = id;
        this.fullName = fullName;
        this.idNumber = idNumber;
        this.loanCategory = loanCategory;
        this.requestedLoanAmount = requestedLoanAmount;
        this.collateralType = collateralType;
        this.priorityLevel = priorityLevel;
        this.dateOfSubmission = dateOfSubmission;
        this.documents = documents;
        this.status = status;
        this.assignedOfficer = assignedOfficer;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "full_name", nullable = false)
    private String fullName;

    @Column(name = "id_number", nullable = false)
    private String idNumber;

    @Column(name = "loan_category", nullable = false)
    private String loanCategory;

    @Column(name = "requested_loan_amount", nullable = false)
    private BigDecimal requestedLoanAmount;

    @Column(name = "collateral_type", nullable = false)
    private String collateralType;

    @Enumerated(EnumType.STRING)
    @Column(name = "priority_level", nullable = false)
    private PriorityLevel priorityLevel;

    @Column(name = "date_of_submission", nullable = false)
    private LocalDateTime dateOfSubmission;

    @Lob
    @Column(name = "documents")
    private byte[] documents;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private ApplicationStatus status;

    @Column(name = "assigned_officer")
    private String assignedOfficer;

    public enum PriorityLevel {
        NOR,
        URG,
        IMM
    }
    
    public enum ApplicationStatus {
        New,
        Progress,
        Approved,
        Returned
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

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getLoanCategory() {
        return loanCategory;
    }

    public void setLoanCategory(String loanCategory) {
        this.loanCategory = loanCategory;
    }

    public BigDecimal getRequestedLoanAmount() {
        return requestedLoanAmount;
    }

    public void setRequestedLoanAmount(BigDecimal requestedLoanAmount) {
        this.requestedLoanAmount = requestedLoanAmount;
    }

    public String getCollateralType() {
        return collateralType;
    }

    public void setCollateralType(String collateralType) {
        this.collateralType = collateralType;
    }

    public PriorityLevel getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(PriorityLevel priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public LocalDateTime getDateOfSubmission() {
        return dateOfSubmission;
    }

    public void setDateOfSubmission(LocalDateTime dateOfSubmission) {
        this.dateOfSubmission = dateOfSubmission;
    }

    public byte[] getDocuments() {
        return documents;
    }

    public void setDocuments(byte[] documents) {
        this.documents = documents;
    }

    public ApplicationStatus getStatus() {
        return status;
    }

    public void setStatus(ApplicationStatus status) {
        this.status = status;
    }

    public String getAssignedOfficer() {
        return assignedOfficer;
    }

    public void setAssignedOfficer(String assignedOfficer) {
        this.assignedOfficer = assignedOfficer;
    }
    

    

    

}
