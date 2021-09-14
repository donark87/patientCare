package com.patientCare.patientCare.service;

import com.patientCare.patientCare.exception.PatientNotFoundException;
import com.patientCare.patientCare.model.Patient;
import com.patientCare.patientCare.repo.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


@Service
public class PatientService {

    private final PatientRepo patientRepo;

    @Autowired
    public PatientService(PatientRepo patientRepo) {
        this.patientRepo = patientRepo;
    }

    public Patient addPatient(Patient patient){
        patient.setPatientId(UUID.randomUUID());
        return patientRepo.save(patient);
    }
    public List<Patient> findAllPatient(){
        return patientRepo.findAll();
    }
    public Patient findPatientById(Long id){
        return patientRepo.findPatinetById(id);
    }
    public Patient findPatientByUUId(UUID id){
        return patientRepo.findPatinetById(id);
    }
    public Patient updatePatient(Patient patient){
        return patientRepo.save(patient);
    }
}
