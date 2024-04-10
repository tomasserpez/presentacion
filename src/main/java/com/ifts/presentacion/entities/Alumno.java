package com.ifts.presentacion.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "alumno")
public class Alumno {
    @Id
    private Long id;

    private String nombre;
    private String apellido;
    private int edad;
    private String profesion;
    private String carrera;
    private String nacionalidad;
    private String dondeVive;



}
