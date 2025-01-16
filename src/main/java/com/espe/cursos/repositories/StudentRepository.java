package com.espe.cursos.repositories;
import com.espe.cursos.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
