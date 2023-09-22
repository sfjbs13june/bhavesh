package com.hospital.bhavesh.app.model;

import org.springframework.stereotype.Component;

@Component
public class Appointment {
    String appointmentid;
    String patientname;
    String doctorname;
    String date;

    public Appointment() {
    }
    public Appointment(String appointmentid, String patientname, String doctorname, String date) {
        this.appointmnetid = appointmnetid;
        this.patientname = patientname;
        this.doctorname = doctorname;
        this.date = date;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }





}
