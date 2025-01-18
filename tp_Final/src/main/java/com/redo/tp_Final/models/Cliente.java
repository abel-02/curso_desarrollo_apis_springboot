package com.redo.tp_Final.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
@Entity @Data
public class Cliente {
    @Id
    private Long idCliente;
    private String nombre;
    private String apellido;
    private String dni;
}