package com.redo.ejEstudianteProgramacion.service;

import com.redo.ejEstudianteProgramacion.dto.CursoTemaDTO;
import com.redo.ejEstudianteProgramacion.model.Curso;
import com.redo.ejEstudianteProgramacion.repository.ICursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CursoService implements ICursoService{

    @Autowired
    private ICursoRepository repositorio;

    @Override
    public void guardarCurso(Curso curso) {
        repositorio.save(curso);
    }

    @Override
    public List<Curso> obtenerTodosLosCursos() {
        return repositorio.findAll();
    }

    @Override   // Implementación con DTO
    public CursoTemaDTO obtenerTodosLosTemasDeUnCurso(Long idCurso) {
        Curso curso = repositorio.findById(idCurso).orElse(null);
        CursoTemaDTO cursoTemas = new CursoTemaDTO(curso.getNombre(), curso.getListaDeTemas());
        return cursoTemas;
    }

    @Override
    public List<Curso> obtenerTodosLosCursosDeJava() {
        List<Curso> cursos = obtenerTodosLosCursos();
        List<Curso> cursosDeJava = new ArrayList<>();
        for(Curso c: cursos){
            if(c.getNombre().toLowerCase().contains("java"))
                cursosDeJava.add(c);
        }
        return cursosDeJava;
    }

    @Override
    public void editarCurso(Curso curso) {
        guardarCurso(curso);
    }

}
