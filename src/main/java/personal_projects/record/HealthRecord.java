package personal_projects.record;

import personal_projects.doctor.DoctorInfo;
import personal_projects.patient.PatientInfo;

import java.time.LocalDate;

public class HealthRecord {
    private PatientInfo patient;
    private DoctorInfo doctor;
    private LocalDate date;
    private String patient_symptoms;
    private String doctor_observation;
    private String doctor_diagnosis;
    private String doctor_treatment_plan;

    public HealthRecord(PatientInfo patient, DoctorInfo doctor, LocalDate date, String patient_symptoms, String doctor_observation, String doctor_diagnosis, String doctor_treatment_plan){
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
        this.patient_symptoms = patient_symptoms;
        this.doctor_observation = doctor_observation;
        this.doctor_diagnosis = doctor_diagnosis;
        this.doctor_treatment_plan = doctor_treatment_plan;
    }

    public boolean saveRecord(){
        return true;
    }

}
