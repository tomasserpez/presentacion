package com.ifts.presentacion.repositories;

import com.ifts.presentacion.entities.Informacion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IInformacionRepository extends CrudRepository<Informacion, Long> {
}
