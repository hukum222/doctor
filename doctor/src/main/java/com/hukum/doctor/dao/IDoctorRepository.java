package com.hukum.doctor.dao;

import com.hukum.doctor.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDoctorRepository extends JpaRepository<Doctor , Integer> {
}
