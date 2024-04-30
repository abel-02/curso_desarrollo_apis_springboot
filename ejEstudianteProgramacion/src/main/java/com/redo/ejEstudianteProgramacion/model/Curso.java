package com.redo.ejEstudianteProgramacion.model;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity @Getter
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String modalidad;
    private String fechaFinalizacion;
    @OneToMany(mappedBy = "curso")
    private List<Tema> listaDeTemas;

    public Curso(Long id, String nombre, String modalidad, String fechaFinalizacion){
        this.id = id;
        this.nombre = nombre;
        this.modalidad = modalidad;
        this.fechaFinalizacion = fechaFinalizacion;
        this.listaDeTemas = new ArrayList<>();
    }
}
