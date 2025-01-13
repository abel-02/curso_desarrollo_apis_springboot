package com.redo.tp_Final.services;

import com.redo.tp_Final.models.Producto;

import java.util.List;

public interface IServiceProducto {
    void registrarProducto(Producto producto);

    List<Producto> listarTodosLosProductos();

    Producto obtenerProducto(Long idProducto);

    void eliminarProducto(Long idProducto);

    void modificarProducto(Long idProducto, Producto producto);

    List<Producto> devolverProductosConCantidadMenorA(int cantidad);
}
