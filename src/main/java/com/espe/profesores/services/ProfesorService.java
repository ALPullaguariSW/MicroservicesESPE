package com.espe.profesores.services;

import com.espe.profesores.entities.Profesor;

import java.util.List;
import java.util.Optional;

public interface ProfesorService {
    List<Profesor> findAll();
    Profesor save(Profesor profesor);
    Optional<Profesor> findById(Long id);
    void deleteById(Long id);
}
