package com.redo.tp_Final.models;

import jakarta.persistence.Entity;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity @Data
public class Venta {
    private Long codigoVenta;
    private LocalDate fechaVenta;
    private Double total;
    private List<Producto> listaProductos;
    private Cliente unCliente;
}
