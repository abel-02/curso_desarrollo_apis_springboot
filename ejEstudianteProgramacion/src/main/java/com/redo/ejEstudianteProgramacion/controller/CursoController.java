package com.redo.ejEstudianteProgramacion.controller;

import com.redo.ejEstudianteProgramacion.dto.CursoTemaDTO;
import com.redo.ejEstudianteProgramacion.model.Curso;
import com.redo.ejEstudianteProgramacion.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CursoController {

    @Autowired
    private CursoService servicio;

    @PostMapping("/cursos/crear")
    public String crearCurso(@RequestBody Curso curso){
        servicio.guardarCurso(curso);
        return "Se guardó el curso";
    }
    @GetMapping("/cursos/traer")
    public List<Curso> traerTodosLosCursos(){
        return servicio.obtenerTodosLosCursos();
    }
    @GetMapping("/cursos/java")
    public List<Curso> traerTodosLosCurosDeJava(){
        return servicio.obtenerTodosLosCursosDeJava();
    }
    @PutMapping("/curso/edit")
    public String editarCurso(@RequestBody Curso curso){
        servicio.editarCurso(curso);
        return "Se editó el curso";
    }
    @GetMapping("/temas/traer")
    public CursoTemaDTO traerTodosLosTemasDeUnCurso(@RequestBody Curso curso){
        return servicio.obtenerTodosLosTemasDeUnCurso(curso.getId());
    }
}
