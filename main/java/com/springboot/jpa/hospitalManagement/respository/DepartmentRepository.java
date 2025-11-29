package com.springboot.jpa.hospitalManagement.respository;

import com.springboot.jpa.hospitalManagement.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}