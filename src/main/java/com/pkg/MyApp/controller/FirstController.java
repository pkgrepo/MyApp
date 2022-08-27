package com.pkg.MyApp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/myapp/v1")
    public String getData(){
        return "From my MyApp Application";
    }

    @GetMapping("/myapp/v2")
    public String getData2(){
        return "From my MyApp Application 2";
    }
}
