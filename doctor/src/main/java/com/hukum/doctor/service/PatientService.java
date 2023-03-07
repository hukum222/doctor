package com.hukum.doctor.service;

import com.hukum.doctor.dao.IPatientRepository;
import com.hukum.doctor.model.Patient;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class PatientService {
    @Autowired
    IPatientRepository repository;
    public  void  savePatient(Patient patient){
        repository.save(patient);
    }

    public JSONArray getpatients() {
        List<Patient> patientList=repository.findAll();

        JSONArray patientArr=new JSONArray();
        for(Patient patient:patientList){
            JSONObject jsonObject=new JSONObject();
            jsonObject.put("patientId",patient.getPatientId());
            jsonObject.put("patient_name",patient.getPatientName());
            jsonObject.put("age",patient.getAge());
            jsonObject.put("phone_number",patient.getPhoneNumber());
            jsonObject.put("disease_type",patient.getDiseaseType());
            jsonObject.put("gender",patient.getGender());
            jsonObject.put("admit_date",patient.getAdmitDate());
            jsonObject.put("doctorId",patient.getDoctor().getDoctorId());
            patientArr.put(jsonObject);
        }
        return patientArr;
    }
}
