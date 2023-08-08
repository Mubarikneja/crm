package com.hijrabank.crmpro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import com.hijrabank.crmpro.entity.CrmApproved;
import com.hijrabank.crmpro.repository.CrmApprovedRepository;


@Service
public class CrmApprovedService {

    @Autowired
    public CrmApprovedRepository crmApprovedRepository;

    public void saveCrmApproved(CrmApproved crmApproved) {

        crmApprovedRepository.save(crmApproved);
    }

    public List<CrmApproved> getCrmApproveds() {

        return crmApprovedRepository.findAll();
    }

    public CrmApproved getCrmApproved(Long id) {

        return crmApprovedRepository.findById(id).get();
    }

    public void delCrmApproved(Long id) {

        crmApprovedRepository.deleteById(id);
    }

    public CrmApproved getCrmApprovedByName(String name) {

        return crmApprovedRepository.findByfullNameIgnoreCase(name);
    }





    
    
}
