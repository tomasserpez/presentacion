package com.ifts.presentacion.controllers;

import com.ifts.presentacion.services.AlumnoService;
import com.ifts.presentacion.services.InformacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlumnoController {

    @Autowired
    private AlumnoService alumnoService;
    @Autowired
    private InformacionService informacionService;


    @GetMapping("/")
    public String getAlumno(){
        System.out.println(alumnoService.getInformacionAlumno());
        System.out.println(informacionService.obtenerInformacion());
            return alumnoService.getInformacionAlumno().toString() + "\n{" + informacionService.obtenerInformacion().toString() + "\n}\n";
    }

}
