package com.springboot.jpa.hospitalManagement.dto;

import com.springboot.jpa.hospitalManagement.entities.type.BloodGroupType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CountBloodGroup {

    private BloodGroupType bloodGroup;
    Long count;
}
