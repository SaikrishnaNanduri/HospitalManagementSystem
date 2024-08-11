package service;

import model.Department;
import model.Doctor;
import model.GENDER;
import model.Patient;
import org.springframework.stereotype.Service;

import java.util.List;


public interface DoctorService {


    Doctor saveDoctor(Doctor doctor);
    void deleteDoctorById(Long id);
    Doctor getDoctorById(Long id);
    List<Doctor> getAllDoctors();
    List<Doctor>getAllDoctorsByGender(GENDER gender);
    Doctor updateDoctor(Doctor doctor);
    List<Doctor> getAllDoctorByDepartment(Department department);
    Doctor getDoctorByDepartmentAndId(Department department,Long id);



}

