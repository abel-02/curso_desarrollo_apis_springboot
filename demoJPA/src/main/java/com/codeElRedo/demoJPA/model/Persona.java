package com.codeElRedo.demoJPA.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Id;

@Entity
@Getter @Setter
public class Persona
{
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Long id;

    private String nombre;
    private String apellido;
    private int edad;

    public Persona(){

    }

    public Persona(Long id, String nombre, String apellido, int edad)
    {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public void setEdad(Integer edad) {
        if(!(edad == null))
            this.edad = edad;
    }
}
