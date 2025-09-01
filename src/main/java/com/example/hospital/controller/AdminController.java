package com.example.hospital.controller;

import com.example.hospital.model.Doctor;
import com.example.hospital.model.Patient;
import com.example.hospital.service.DoctorService;
import com.example.hospital.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdminController {
    @Autowired
    private DoctorService doctorService;
    @Autowired
    private PatientService patientService;

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        model.addAttribute("doctorCount", doctorService.getAllDoctors().size());
        model.addAttribute("patientCount", patientService.getAllPatients().size());
        return "dashboard";
    }

    @GetMapping("/doctors")
    public String doctors(Model model) {
        model.addAttribute("doctors", doctorService.getAllDoctors());
        model.addAttribute("doctor", new Doctor());
        return "doctors";
    }

    @PostMapping("/doctors")
    public String addDoctor(@ModelAttribute Doctor doctor) {
        doctorService.saveDoctor(doctor);
        return "redirect:/doctors";
    }

    @GetMapping("/doctors/delete/{id}")
    public String deleteDoctor(@PathVariable Long id) {
        doctorService.deleteDoctor(id);
        return "redirect:/doctors";
    }

    @GetMapping("/patients")
    public String patients(Model model) {
        model.addAttribute("patients", patientService.getAllPatients());
        model.addAttribute("patient", new Patient());
        return "patients";
    }

    @PostMapping("/patients")
    public String addPatient(@ModelAttribute Patient patient) {
        patientService.savePatient(patient);
        return "redirect:/patients";
    }

    @GetMapping("/patients/delete/{id}")
    public String deletePatient(@PathVariable Long id) {
        patientService.deletePatient(id);
        return "redirect:/patients";
    }
}