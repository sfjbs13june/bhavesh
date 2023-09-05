package com.bhavesh.app;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class appcontoller {

    @GetMapping("/get")
    public String getData(){
        return "get data";
    }
}
