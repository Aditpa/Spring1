package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("")
@Controller
public class routes {

    @GetMapping()
    public ResponseEntity hello(){
        return new ResponseEntity<>(" <a href='http://localhost:8080/doctor/1'>Patrick Troughton</a><br>" +
                "  <a href='http://localhost:8080/doctor/2'>Jon Pertwee</a><br>"+
                "  <a href='http://localhost:8080/doctor/3'>Tom Baker</a><br>"+
                "  <a href='http://localhost:8080/doctor/4'>Peter Davison</a><br>", HttpStatus.OK) ;
    }
    @GetMapping("/doctor/1")
    public ResponseEntity patrick(){
        return new ResponseEntity<>("Patrick Troughton", HttpStatus.OK) ;
    }
    @GetMapping("/doctor/2")
    public ResponseEntity jon(){
        return new ResponseEntity<>("Jon Pertwee", HttpStatus.OK) ;
    }
    @GetMapping("/doctor/3")
    public ResponseEntity tom(){
        return new ResponseEntity<>("Tom Baker", HttpStatus.OK) ;
    }
    @GetMapping("/doctor/4")
    public ResponseEntity perter(){
        return new ResponseEntity<>("Peter Davison", HttpStatus.OK) ;
    }
}
