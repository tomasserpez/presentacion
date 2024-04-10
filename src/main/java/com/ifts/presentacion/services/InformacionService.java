package com.ifts.presentacion.services;

import com.ifts.presentacion.repositories.IInformacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InformacionService {
    @Autowired
    private IInformacionRepository InformacionRepository;

    public List<String> obtenerInformacion() {
        List<String> listaInformacion = new ArrayList<>();
        listaInformacion.add("\n\n\tDescripcion: " + InformacionRepository.findById(1L).get().getDescripcion());
        listaInformacion.add("\n\n\tHobbies: " + InformacionRepository.findById(1L).get().getHobbies());
        listaInformacion.add("\n\n\tIdiomas: " + InformacionRepository.findById(1L).get().getIdiomas());
        listaInformacion.add("\n\n\tObjetivos: " + InformacionRepository.findById(1L).get().getObjetivo() + "\n");
        return listaInformacion;
    }
}
