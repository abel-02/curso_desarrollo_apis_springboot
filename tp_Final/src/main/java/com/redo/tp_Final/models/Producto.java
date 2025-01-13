package com.redo.tp_Final.models;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity @Data
public class Producto {
    private Long codigoProducto;
    private String nombre;
    private String marca;
    private Double costo;
    private Double cantidadDisponible;
}
