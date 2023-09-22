package com.bhavesh.app.Controller;

import com.hospital.rama.app.model.Patient;
import com.hospital.rama.app.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PatientController {

    private final DataRepository dataRepository;
    @Autowired
    public PatientController( DataRepository dataRepository){
        this.dataRepository=dataRepository;
    }

    @GetMapping("/myappointment")
    public Patient getPatient(@RequestParam String name){

        return dataRepository.getPatient(name);
    }
    @PostMapping("/save")
    public void savePatient(@RequestBody Patient patient){
        String name= patient.getName();
        dataRepository.savePatient(name,patient);
    }


}

