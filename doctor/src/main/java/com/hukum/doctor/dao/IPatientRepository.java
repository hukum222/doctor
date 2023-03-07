package com.hukum.doctor.dao;

import com.hukum.doctor.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPatientRepository extends JpaRepository<Patient , Integer> {
}
