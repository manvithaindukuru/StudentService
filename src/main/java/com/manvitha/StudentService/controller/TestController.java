package com.manvitha.StudentService.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/test")
@CrossOrigin("*")
public class TestController {
    @GetMapping("/hello")
    public ResponseEntity<?>hello(){
        return new ResponseEntity( "hello", HttpStatus.OK);
    }
    @GetMapping("/hi")
    public ResponseEntity<?>hi(){
        return new ResponseEntity( "hi", HttpStatus.OK);
    }
    @GetMapping("/students")
    public ResponseEntity<?>getStudents(){
        Map<String, Integer> students =new HashMap<>();
        students.put("Hari", 22);
        students.put("giri", 21);
        students.put("pari", 23);
        students.put("siri", 25);
        students.put("nari", 24);
        return new ResponseEntity<>(students, HttpStatus.OK);

    }
}
