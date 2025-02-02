package com.redo.tp_Final.dto;

import lombok.Data;

@Data
public class VentaDTO {
    private Long codigoVenta;
    private Double total;
    private int cantidadProductos;
    private String nombreCliente;
    private String apellidoCliente;
}
