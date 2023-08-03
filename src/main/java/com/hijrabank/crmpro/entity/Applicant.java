package com.hijrabank.crmpro.entity;



import jakarta.persistence.*;

@Entity
@Table(name = "applicants")
public class Applicant {

    public Applicant() {
    }

    public Applicant(Long id, String fullName, String telephoneNumber, String email, String address, String idNumber,
            String maritalStatus) {
        this.id = id;
        this.fullName = fullName;
        this.telephoneNumber = telephoneNumber;
        this.email = email;
        this.address = address;
        this.idNumber = idNumber;
        this.maritalStatus = maritalStatus;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "full_name", nullable = false)
    private String fullName;

    @Column(name = "telephone_number", nullable = false)
    private String telephoneNumber;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "id_number", nullable = false)
    private String idNumber;

    @Column(name = "marital_status", nullable = false)
    private String maritalStatus;

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

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    
}
