package com.pkg.MyApp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/myapp/getAll")
    public String getData(){
        return "From my MyApp Application";
    }
}
