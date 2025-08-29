package com.example.hospital.service;

import com.example.hospital.model.Doctor;
import com.example.hospital.repository.DoctorRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class DoctorServiceTest {
    @Autowired
    private DoctorService doctorService;
    @Autowired
    private DoctorRepository doctorRepository;

    @Test
    public void testSaveDoctor() {
        Doctor doctor = new Doctor();
        doctor.setName("Dr. Test");
        doctor.setSpecialization("Test");
        doctorService.saveDoctor(doctor);
        assertEquals(1, doctorService.getAllDoctors().size());
    }
}