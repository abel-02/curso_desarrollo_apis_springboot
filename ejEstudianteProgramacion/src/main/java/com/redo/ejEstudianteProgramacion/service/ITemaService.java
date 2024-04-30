package com.redo.ejEstudianteProgramacion.service;

import com.redo.ejEstudianteProgramacion.model.Curso;
import com.redo.ejEstudianteProgramacion.model.Tema;

import java.util.List;

public interface ITemaService {

    public void guardarTema(Tema tema);

    public void editarTema(Tema tema);

    public Tema traerTema(Long id);

    public List<Tema> traerTemas();

    public void eliminarTema(Long idTema);
}
