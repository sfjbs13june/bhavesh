package com.bhavesh.dockerspringapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/Name")
    public double Name(){
        return Bhavesh;
    }

    @GetMapping("/age")
    public double age(){
        return 22;
    }

    @GetMapping("/address")
    public double address(){
        return pune;
    }



}
