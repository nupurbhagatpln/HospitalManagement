package com.springboot.jpa.hospitalManagement;

import com.springboot.jpa.hospitalManagement.entities.Appointment;
import com.springboot.jpa.hospitalManagement.services.AppointmentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
public class AppointmentTest {

    @Autowired
    private AppointmentService appointmentService;

//    @Test
//    public void appointmentTest()
//    {
//        Appointment appointment=Appointment.builder()
//                .appointmentTime(LocalDateTime.of(2025,11,1,14,0))
//                .reason("Dengu")
//                .build();
//        var newAppointment= appointmentService.createNewAppointment(appointment);
//        System.out.println(newAppointment);
//    }
//    @Test
//    public void changeAppointmentDoctor(){
//    Appointment appointment=appointmentService.reassignToNewDoctor();
//    System.out.println(appointment.toString());
//
//    }
}
