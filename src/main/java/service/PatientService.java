package service;

import model.GENDER;
import model.Patient;

import java.util.List;

public interface PatientService {

    Patient savePatient(Patient patient);
    void deletePatientById(Long id);
    Patient getPatientById(Long id);
    List<Patient> getAllPatients();
    List<Patient>getAllPatientsByGender(GENDER gender);
    Patient updatePatient(Patient patient);



}
