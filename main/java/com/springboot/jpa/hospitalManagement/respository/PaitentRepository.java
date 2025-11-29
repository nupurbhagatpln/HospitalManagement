package com.springboot.jpa.hospitalManagement.respository;

import com.springboot.jpa.hospitalManagement.dto.CountBloodGroup;
import com.springboot.jpa.hospitalManagement.entities.Paitent;
import com.springboot.jpa.hospitalManagement.entities.type.BloodGroupType;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Repository
public interface PaitentRepository extends JpaRepository<Paitent, Long> {
    Paitent findByName(String name);

    Paitent findByBirthDate(LocalDate birthDate);

    List<Paitent> findByBirthDateOrEmail(LocalDate birthDate, String email);

    Optional<Paitent> findByNameContainingOrderById(String nameStr);

    @Query("select p from Paitent p where p.bloodGroup= ?1")
    List<Paitent> findByBloodGroup(BloodGroupType bloodGroupType);

    @Query("select p from Paitent p where p.birthDate> :birthDate")
    List<Paitent> findBirthDateAfter(@Param("birthDate") LocalDate birthDate);

    @Query("select new com.springboot.jpa.hospitalManagement.dto.CountBloodGroup(p.bloodGroup,Count(p))" +"from Paitent p group by p.bloodGroup")
//    List<Object[]> findBloodGroupCount();
    List<CountBloodGroup> findBloodGroupCount();

    @Transactional
    @Modifying
    @Query("update Paitent p set p.name= :name where p.id= :id")
    int nameUpdateWithId(@Param("name") String name, @Param("id") Long id);

//    @Query("SELECT p FROM Patient p LEFT JOIN FETCH p.appointments")
//    List<Paitent> findAllPaitentWithAppointment();
}
