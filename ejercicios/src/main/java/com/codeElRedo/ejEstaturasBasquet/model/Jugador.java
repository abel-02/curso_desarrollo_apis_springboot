package com.codeElRedo.ejEstaturasBasquet.model;

import lombok.Getter;

@Getter
public class Jugador
{
    private int id;
    private int dni;
    private String nombre;
    private String apellido;
    private int edad;
    private double peso;
    private double estatura;

    public Jugador(int id,int dni, String nombre, String apellido, int edad, double peso, double estatura){
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
    }
}
