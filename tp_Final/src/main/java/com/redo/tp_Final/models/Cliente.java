package com.redo.tp_Final.models;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity @Data
public class Cliente {
    private Long idCliente;
    private String nombre;
    private String apellido;
    private String dni;
}
