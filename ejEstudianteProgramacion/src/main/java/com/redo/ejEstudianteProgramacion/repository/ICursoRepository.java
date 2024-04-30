package com.redo.ejEstudianteProgramacion.repository;

import com.redo.ejEstudianteProgramacion.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository                                        //Entidad y tipo de id
public interface ICursoRepository extends JpaRepository<Curso, Long> {
}
