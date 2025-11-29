package com.springboot.jpa.hospitalManagement;

import com.springboot.jpa.hospitalManagement.entities.Insurance;
import com.springboot.jpa.hospitalManagement.entities.Paitent;
import com.springboot.jpa.hospitalManagement.services.InsuranceService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
public class InsuranceTest {

    @Autowired
    private InsuranceService insuranceService;

    @Test
    public void testInsurance()
    {
        Insurance insurance=Insurance.builder().policyNumber("Axis_1283")
                .provider("Axis")
                .validUntil(LocalDate.of(2030,12,16))
                .build();

        Paitent paitent=insuranceService.assignInsuranceToPaitent(insurance,2L);
        System.out.println(paitent);
    }
}
