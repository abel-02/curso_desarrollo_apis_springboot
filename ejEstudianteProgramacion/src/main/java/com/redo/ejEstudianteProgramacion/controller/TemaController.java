package com.redo.ejEstudianteProgramacion.controller;

import com.redo.ejEstudianteProgramacion.model.Curso;
import com.redo.ejEstudianteProgramacion.model.Tema;
import com.redo.ejEstudianteProgramacion.service.TemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TemaController {

    @Autowired
    private TemaService servicio;

    @PostMapping("/temas/crear")
    public String crearTema(@RequestBody Tema tema){
        servicio.guardarTema(tema);
        return "Se guardó el tema";
    }
    @PutMapping("/tema/edit")
    public String editarTema(@RequestBody Tema tema){
        servicio.guardarTema(tema);
        return "Se editó el tema";
    }
}
