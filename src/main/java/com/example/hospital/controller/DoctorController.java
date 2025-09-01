package com.example.hospital.controller;

import com.example.hospital.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DoctorController {
    @Autowired
    private PatientService patientService;

    @GetMapping("/doctor/dashboard")
    public String dashboard(Model model){
        model.addAttribute("patientCount", patientService.getAllPatients().size());
        return "doctor-dashboard";
    }

    @GetMapping("/doctor/patients")
    public String patients(Model model){
        model.addAttribute("patients", patientService.getAllPatients());
        return "doctor-patients";
    }
}