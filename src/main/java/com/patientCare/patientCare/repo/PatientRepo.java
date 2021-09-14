package com.patientCare.patientCare.repo;

import com.patientCare.patientCare.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface PatientRepo extends JpaRepository<Patient,Long> {


    Optional<Patient> findPatientById(Long id);

    Optional<Patient> findPatientById(UUID id);
}
