package com.springboot.jpa.hospitalManagement.services;

import com.springboot.jpa.hospitalManagement.entities.Insurance;
import com.springboot.jpa.hospitalManagement.entities.Paitent;
import com.springboot.jpa.hospitalManagement.respository.InsuranceRepository;
import com.springboot.jpa.hospitalManagement.respository.PaitentRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InsuranceService {


    private final InsuranceRepository insuranceRepository;
    private final PaitentRepository paitentRepository;

    @Transactional
    public Paitent assignInsuranceToPaitent(Insurance insurance, Long paitentId)
    {
        Paitent paitent=paitentRepository.findById(paitentId)
                .orElseThrow(()->new EntityNotFoundException("Patient not found"+ paitentId));

        paitent.setInsurance(insurance);
        insurance.setPaitent(paitent);
        return paitent;
    }

}
