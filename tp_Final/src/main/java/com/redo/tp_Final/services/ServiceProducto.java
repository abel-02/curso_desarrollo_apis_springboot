package com.redo.tp_Final.services;

import com.redo.tp_Final.models.Producto;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceProducto implements IServiceProducto{

    @Override
    public void registrarProducto(Producto producto) {

    }

    @Override
    public List<Producto> listarTodosLosProductos() {
        return null;
    }

    @Override
    public Producto obtenerProducto(Long idProducto) {
        return null;
    }

    @Override
    public void eliminarProducto(Long idProducto) {

    }

    @Override
    public void modificarProducto(Long idProducto, Producto producto) {

    }
}
