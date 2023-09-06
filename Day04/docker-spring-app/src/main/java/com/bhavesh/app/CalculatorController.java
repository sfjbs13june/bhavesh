package com.bhavesh.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/Name")
    public String Name(){
        return "Bhavesh";
    }
    @GetMapping("/Age")
    public double Age(){
        return 22;
    }
    @GetMapping("/Address")
    public String Address(){
        return "Pune";
    }


}
