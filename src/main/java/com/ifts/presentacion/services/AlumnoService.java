package com.ifts.presentacion.services;

import com.ifts.presentacion.repositories.IAlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlumnoService {

    @Autowired
    private IAlumnoRepository alumnoRepository;

    public List<String> getInformacionAlumno() {
        List<String> infoAlumno = new ArrayList<>();

        infoAlumno.add("\nNombre y apellido: " + alumnoRepository.findById(1L).get().getNombre() + " " + alumnoRepository.findById(1L).get().getApellido());
        infoAlumno.add("\nEdad: " + String.valueOf(alumnoRepository.findById(1L).get().getEdad()));
        infoAlumno.add("\nProfesión: " + alumnoRepository.findById(1L).get().getProfesion());
        infoAlumno.add("\nCarrera: " + alumnoRepository.findById(1L).get().getCarrera());
        infoAlumno.add("\nNacionalidad: " + alumnoRepository.findById(1L).get().getNacionalidad());
        infoAlumno.add("\nDonde vivo: " + alumnoRepository.findById(1L).get().getDondeVive());

        return infoAlumno;
    }

}
