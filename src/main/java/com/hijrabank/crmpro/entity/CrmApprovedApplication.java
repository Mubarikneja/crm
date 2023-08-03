package com.hijrabank.crmpro.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "crm_approved_applications")
public class CrmApprovedApplication {

    public CrmApprovedApplication() {
    }

    public CrmApprovedApplication(Long id, Long newApplicationId, LocalDateTime approvalDate, String approvedBy,
            BigDecimal recommendedLoanAmount) {
        this.id = id;
        this.newApplicationId = newApplicationId;
        this.approvalDate = approvalDate;
        this.approvedBy = approvedBy;
        this.recommendedLoanAmount = recommendedLoanAmount;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "new_application_id", nullable = false)
    private Long newApplicationId;

    @Column(name = "approval_date", nullable = false)
    private LocalDateTime approvalDate;

    @Column(name = "approved_by", nullable = false)
    private String approvedBy;

    @Column(name = "recommended_loan_amount", nullable = false)
    private BigDecimal recommendedLoanAmount;

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

    public LocalDateTime getApprovalDate() {
        return approvalDate;
    }

    public void setApprovalDate(LocalDateTime approvalDate) {
        this.approvalDate = approvalDate;
    }

    public String getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
    }

    public BigDecimal getRecommendedLoanAmount() {
        return recommendedLoanAmount;
    }

    public void setRecommendedLoanAmount(BigDecimal recommendedLoanAmount) {
        this.recommendedLoanAmount = recommendedLoanAmount;
    }

    
}
