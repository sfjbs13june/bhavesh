package controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studentcontroller {

    @GetMapping("/getstudent")

    public String getStudentDetail(){
        return "student1";
    }
}

@RestController
class studentController {

    @PutMapping("/updatestudent")

    public String updateStudentDetail(){
        return "student1";
    }
}

@RestController
class StudentController {

    @DeleteMapping("/deletestudent")

    public String deleteStudentDetail(){
        return "student1";
    }
}