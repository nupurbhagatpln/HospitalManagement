package com.springboot.jpa.hospitalManagement;

import com.springboot.jpa.hospitalManagement.dto.CountBloodGroup;
import com.springboot.jpa.hospitalManagement.entities.Paitent;
import com.springboot.jpa.hospitalManagement.entities.type.BloodGroupType;
import com.springboot.jpa.hospitalManagement.respository.PaitentRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Repository;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

// why lombook doesnot work here and i cannot create private final beans ??? --- doubt
@SpringBootTest
public class PaitentTest {
//
    @Autowired
    private PaitentRepository paitentRepository;

//    @Test
//    public void testPatientPage()
//    {
//       Page<Paitent> pagePaitent=paitentRepository.fetchAllPatient(PageRequest.of(0,2));
//    }
//
//    @Test
//    public void testPaitentRepository(){
//        List<Paitent> paitentList=paitentRepository.findAll();
//        System.out.println(paitentList);
//    }
//
//    @Test
//    public void testTransactionalMethod()
//    {
////        Paitent paitent=paitentRepository.findByName("Diya Patel");
////        System.out.println(paitent);
////
////        Paitent newPaitent =paitentRepository.findByBirthDate(LocalDate.of(1995, 8, 20));
////
////        System.out.println(newPaitent);
////        List<Paitent> paitentList=paitentRepository.findByBirthDateOrEmail(LocalDate.of(1995, 8, 20), "dishant.verma@example.com");
////
////        for(Paitent patient:paitentList)
////        {
////            System.out.println(patient);
////        }
//
////        List<Paitent> paitentList1=paitentRepository.findByBloodGroup(BloodGroupType.A_POSITIVE);
////
////        paitentList1.forEach(patient-> System.out.println(patient));
////
////        List<Paitent> paitentByBirthDateAfter= paitentRepository.findBirthDateAfter(LocalDate.of(1990,5,10));
////        paitentByBirthDateAfter.forEach(patient-> System.out.println(patient));
//
////        List<Object[]> countBloodGroupPaitent= paitentRepository.findBloodGroupCount();
////
////        countBloodGroupPaitent.forEach(paitent-> System.out.println(paitent[0]+" "+paitent[1]));
//
//
////        int count =paitentRepository.nameUpdateWithId("Arav Jha", 1L);
////        System.out.println("count of update query >> "+ count);
//
//        List<CountBloodGroup> countBloodGroupPaitent= paitentRepository.findBloodGroupCount();
//
//        countBloodGroupPaitent.forEach(countBloodGroup-> System.out.println(countBloodGroup));
//
//
//    }

}
