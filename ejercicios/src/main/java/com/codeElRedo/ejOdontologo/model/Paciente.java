package com.codeElRedo.ejOdontologo.model;

import lombok.Getter;

import java.time.LocalDate;
@Getter
public class Paciente
{
    private int id;
    private int dni;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;

    public Paciente(int id,int dni, String nombre, String apellido, LocalDate fechaNacimiento)
    {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }
}
