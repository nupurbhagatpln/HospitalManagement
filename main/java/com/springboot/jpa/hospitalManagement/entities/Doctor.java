package com.springboot.jpa.hospitalManagement.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length=50)
    private String name;

    @Column(length=50)
    private String specialization;

    @Column(nullable = false, unique = true)
    private String email;

    @ManyToMany(mappedBy = "doctors")
    Set<Department> department= new HashSet<>();

    @OneToMany(mappedBy = "doctor")
    private List<Appointment> appointmentList= new ArrayList<>();

}


