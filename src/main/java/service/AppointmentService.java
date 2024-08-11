package service;

import model.Appointment;
import model.Doctor;
import model.Patient;
import model.STATUS;
import java.util.List;

public interface AppointmentService {

    Appointment saveAppointment(Appointment appointment);
    Appointment changeStatusOfAppointmentById(Long id, STATUS status);
    Appointment getAppointmentById(Long id);
    List<Appointment>getAllAppointmentList();
    List<Appointment>getAllAppointmentListByPatient(Patient patient);
    List<Appointment>getAllAppointmentListByDoctor(Doctor doctor);


}
