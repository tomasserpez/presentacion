package com.ifts.presentacion.repositories;

import com.ifts.presentacion.entities.Alumno;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAlumnoRepository extends CrudRepository<Alumno, Long> {

}
