package com.springboot.jpa.hospitalManagement.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreationTimestamp
    @Column(nullable = false)
    private LocalDateTime appointmentTime;

    @Column(nullable = false, length=500)
    private String reason;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Paitent paitent;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Doctor doctor;
}
