package com.springboot.jpa.hospitalManagement.respository;

import com.springboot.jpa.hospitalManagement.entities.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface InsuranceRepository extends JpaRepository<Insurance, Long> {
}