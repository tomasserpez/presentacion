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
@Table(name = "informacion")
public class Informacion {
    @Id
    private Long id;
    private String descripcion;
    private String hobbies;
    private String idiomas;
    private String objetivo;
}
