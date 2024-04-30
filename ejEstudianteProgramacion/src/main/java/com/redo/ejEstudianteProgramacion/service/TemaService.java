package com.redo.ejEstudianteProgramacion.service;

import com.redo.ejEstudianteProgramacion.model.Tema;
import com.redo.ejEstudianteProgramacion.repository.ITemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TemaService implements ITemaService{

    @Autowired
    private ITemaRepository repositorio;

    @Override
    public void guardarTema(Tema tema) {
         repositorio.save(tema);
    }

    @Override
    public void editarTema(Tema tema) {
        guardarTema(tema);
    }

    @Override
    public Tema traerTema(Long id) {
        return repositorio.findById(id).orElse(null);
    }

    @Override
    public List<Tema> traerTemas() {
        return repositorio.findAll();
    }

    @Override
    public void eliminarTema(Long idTema) {
        repositorio.deleteById(idTema);
    }
}
