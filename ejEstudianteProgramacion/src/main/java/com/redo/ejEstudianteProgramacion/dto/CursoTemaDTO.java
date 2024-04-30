package com.redo.ejEstudianteProgramacion.dto;

import com.redo.ejEstudianteProgramacion.model.Tema;
import lombok.Getter;

import java.util.List;
@Getter
public class CursoTemaDTO {
    private String nombreCurso;
    private List<Tema> temas;

    public CursoTemaDTO(String nombreCurso, List<Tema> temas){
        this.nombreCurso = nombreCurso;
        this.temas = temas;
    }
}
