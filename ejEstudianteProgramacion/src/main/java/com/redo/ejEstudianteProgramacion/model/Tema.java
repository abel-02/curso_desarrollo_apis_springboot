package com.redo.ejEstudianteProgramacion.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;

@Entity @Getter
public class Tema {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idTema;
    private String nombre;
    private String descripcion;
    @ManyToOne
    @JoinColumn(name = "idCurso")
    @JsonIgnore //Evita errores en la response
    private Curso curso;

    public Tema(){}

    public Tema(Long idTema, String nombre, String descripcion, Curso curso){
        this.idTema = idTema;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.curso = curso;
    }
}
