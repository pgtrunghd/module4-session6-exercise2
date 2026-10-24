package com.example.patientservice.service;

import com.example.patientservice.dto.PatientRequest;
import com.example.patientservice.entity.Patient;
import com.example.patientservice.repository.PatientRepository;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public Patient create(PatientRequest request) {
        Patient patient = new Patient();
        patient.setFullName(request.fullName());
        patient.setAddress(request.address());
        patient.setMedicalHistory(request.medicalHistory());
        return patientRepository.save(patient);
    }
}
