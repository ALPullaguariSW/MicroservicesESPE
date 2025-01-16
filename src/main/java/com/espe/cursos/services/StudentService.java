package com.espe.cursos.services;


import com.espe.cursos.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> findAll();
    Student save(Student student);
    Optional<Student> findById(Long id);
    void deleteById(Long id);

}
