package com.patientCare.patientCare.repo;

import com.patientCare.patientCare.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface PatientRepo extends JpaRepository<Patient,Long> {
    Patient findPatinetById(Long id);

    Patient findPatinetById(UUID id);
}
