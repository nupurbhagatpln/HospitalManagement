package com.springboot.jpa.hospitalManagement.entities;

import com.springboot.jpa.hospitalManagement.entities.type.BloodGroupType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
public class Paitent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 32)
    private String name;

    private LocalDate birthDate;

    @Column(unique = true)
    private String email;
    private String gender;

    @Column(updatable = false)
    @CreationTimestamp
    private LocalDateTime createdAt;

    @Enumerated(EnumType.STRING)
    private BloodGroupType bloodGroup;

    @OneToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
//    @JoinColumn(name="paitent_insuranc_id")
    private Insurance insurance;

    @OneToMany(mappedBy = "paitent", cascade= {CascadeType.REMOVE},orphanRemoval = true)
    @ToString.Exclude
    List<Appointment> appointmentList= new ArrayList<>();

}
