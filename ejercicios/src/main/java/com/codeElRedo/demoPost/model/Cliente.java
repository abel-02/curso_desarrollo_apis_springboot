package com.codeElRedo.demoPost.model;

import lombok.Getter;

@Getter
public class Cliente {
    private int dni;
    private String nombre;
    private String apellido;

    public Cliente(int dni, String nombre, String apellido){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
