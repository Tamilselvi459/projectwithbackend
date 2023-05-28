package com.example.jpabasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired StudentService studentservice;

    @PostMapping("/addstudent")
    public String addstudent(@RequestBody Student student , @RequestParam ("depart") Department department){

        studentservice.addstudent(student,department);
        return "Student added successfully";
    }
    @GetMapping("/getbyId/{id}")
    public Student getstudentbyId(@PathVariable int id){

        return studentservice.getstudentbyId(id);
    }
    @GetMapping("/getAllstudent")
    public List<String> getAllStudent(){
        return studentservice.getAllStudent();
    }

    @GetMapping("/getstudentbyage/{age}")
    public List<String> getstudentByAge(@PathVariable int age){

        return studentservice.getstudentbyAge(age);
    }

    @GetMapping("/getstudentageandmark")
    public List<String> getstudentageandmark(@RequestParam int age , @RequestParam int marks){
        return studentservice.getstudentageandmark(age,marks);
    }
    @DeleteMapping("/deletebyid")
    public String deletebyid(@RequestParam int id){
        studentservice.deletebyid(id);
        return "deleted successfully";
    }
    @DeleteMapping("/deleteAll")
    public String deleteAllstudent(){
        studentservice.deleteAllstudent();
        return "deleted all student";
    }
    @GetMapping("/find-age-greater")
    public List<String> findAgeGreaterAge(@RequestParam int age){

            return  studentservice.findAgeGreaterAge(age);
    }
}
