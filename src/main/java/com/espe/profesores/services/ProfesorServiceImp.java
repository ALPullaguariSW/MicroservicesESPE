package com.espe.profesores.services;

import com.espe.profesores.entities.Profesor;
import com.espe.profesores.repositories.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProfesorServiceImp implements ProfesorService {
    @Autowired
    private ProfesorRepository profesorRepository;
    @Override
    public List<Profesor> findAll() {
        return (List<Profesor>) profesorRepository.findAll();
    }


    @Override
    public Profesor save(Profesor profesor) {
        return profesorRepository.save(profesor);
    }
    @Override
    public Optional<Profesor> findById(Long id) {
        return profesorRepository.findById(id);
    }
    @Override
    public void deleteById(Long id) {
        profesorRepository.deleteById(id);
    }

}
