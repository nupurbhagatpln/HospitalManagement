package com.springboot.jpa.hospitalManagement.respository;

import com.springboot.jpa.hospitalManagement.entities.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}