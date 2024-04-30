package com.redo.ejEstudianteProgramacion.service;

import com.redo.ejEstudianteProgramacion.dto.CursoTemaDTO;
import com.redo.ejEstudianteProgramacion.model.Curso;


import java.util.List;

public interface ICursoService {
    public void guardarCurso(Curso curso);

    public List<Curso> obtenerTodosLosCursos();
    public CursoTemaDTO obtenerTodosLosTemasDeUnCurso(Long idCurso);
    public List<Curso> obtenerTodosLosCursosDeJava();
    public void editarCurso(Curso curso);

}
