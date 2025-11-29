package com.springboot.jpa.hospitalManagement.services;

import com.springboot.jpa.hospitalManagement.entities.Appointment;
import com.springboot.jpa.hospitalManagement.entities.Doctor;
import com.springboot.jpa.hospitalManagement.entities.Paitent;
import com.springboot.jpa.hospitalManagement.respository.AppointmentRepository;
import com.springboot.jpa.hospitalManagement.respository.DoctorRepository;
import com.springboot.jpa.hospitalManagement.respository.PaitentRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AppointmentService {

    private final AppointmentRepository appointmentRepository;
    private final PaitentRepository paitentRepository;
    private final DoctorRepository doctorRepository;

    @Transactional
    public Appointment createNewAppointment(Appointment appointment, Long doctorId, Long paitentid){

        Doctor doctor= doctorRepository.findById(doctorId)
                .orElseThrow(()-> new EntityNotFoundException("Doctor not found with id "+ doctorId));
        Paitent paitent= paitentRepository.findById(paitentid)
                .orElseThrow(()-> new EntityNotFoundException("patient not found with id "+ paitentid));

        if(appointment.getId()!=null) throw new IllegalArgumentException("Appointment should not have id");
        appointment.setPaitent(paitent);
        appointment.setDoctor(doctor);
        paitent.getAppointmentList().add(appointment);
       return appointmentRepository.save(appointment);

    }

    @Transactional
    public Appointment reassignToNewDoctor(Long appointmentId, Long doctorId)
    {
        Appointment appointment= appointmentRepository.findById(appointmentId)
                .orElseThrow(()->new EntityNotFoundException("Appointment not found"));

        Doctor doctor=doctorRepository.findById(doctorId).orElseThrow(()->
            new EntityNotFoundException("Doctor id not found"));

        appointment.setDoctor(doctor);
        doctor.getAppointmentList().add(appointment);
        return appointment;
    }

}
