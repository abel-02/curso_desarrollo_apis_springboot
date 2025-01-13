package com.redo.tp_Final.services;

import com.redo.tp_Final.models.Venta;

import java.util.List;

public interface IServiceVenta {
    void registrarVenta(Venta venta);

    List<Venta> listarTodasLasVentas();

    Venta obtenerVenta(Long idVenta);

    void eliminarVenta(Long idVenta);

    void modificarVenta(Long idVenta, Venta venta);
}
