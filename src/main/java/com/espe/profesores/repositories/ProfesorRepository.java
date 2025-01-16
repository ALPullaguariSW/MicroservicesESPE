package com.espe.profesores.repositories;

import com.espe.profesores.entities.Profesor;
import org.springframework.data.repository.CrudRepository;

public interface ProfesorRepository  extends CrudRepository<Profesor, Long> {
}
