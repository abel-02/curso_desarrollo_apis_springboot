package com.redo.tp_Final.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity @Data
public class Venta {
    @Id
    private Long codigoVenta;
    private LocalDate fechaVenta;
    private Double total;
    @OneToMany
    private List<Producto> listaProductos;
    @OneToOne
    @JoinColumn(name = "id_cliente",
            referencedColumnName = "idCliente")
    private Cliente unCliente;
}
