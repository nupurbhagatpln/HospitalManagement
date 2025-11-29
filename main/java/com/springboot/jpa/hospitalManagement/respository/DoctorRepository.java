package com.springboot.jpa.hospitalManagement.respository;

import com.springboot.jpa.hospitalManagement.entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}