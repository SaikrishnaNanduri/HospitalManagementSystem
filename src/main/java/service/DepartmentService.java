package service;

import model.Department;
import model.Doctor;

import java.util.List;

public interface DepartmentService {


    Department saveDepartment(Department department);
    void deleteDepartmentById(Long id);
    Department getDepartmentById(Long id);
    List<Department> getAllDepartments();
    Department updateDepartmentById(Long id);
}
