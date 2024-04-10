package com.ifts.presentacion.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlumnoController {

    @GetMapping("/")
    public String  info(){
        return "La app está funcando, lince";
    }
}
