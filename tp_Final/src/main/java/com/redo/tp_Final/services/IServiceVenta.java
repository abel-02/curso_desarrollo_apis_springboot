package com.redo.tp_Final.services;

import com.redo.tp_Final.models.Producto;
import com.redo.tp_Final.models.Venta;

import java.time.LocalDate;
import java.util.List;

public interface IServiceVenta {
    void registrarVenta(Venta venta);

    List<Venta> listarTodasLasVentas();

    Venta obtenerVenta(Long idVenta);

    void eliminarVenta(Long idVenta);

    void modificarVenta(Long idVenta, Venta venta);

    List<Producto> listarProductosDeUnaVenta(Long idVenta);

    String obtenerMontoYCantidadDeVentasEnUnDia(LocalDate dia);

    Object ventaConElMayorMonto() throws Exception;
}
