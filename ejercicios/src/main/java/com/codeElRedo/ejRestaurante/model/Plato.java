package com.codeElRedo.ejRestaurante.model;

import lombok.Getter;

@Getter
public class Plato {
    private int numeroPlato;
    private String nombre;
    private double precio;
    private String descripcion;

    public Plato(int numeroPlato, String nombre, double precio, String descripcion){
        this.numeroPlato = numeroPlato;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }
}
