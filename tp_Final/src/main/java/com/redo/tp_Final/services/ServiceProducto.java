package com.redo.tp_Final.services;

import com.redo.tp_Final.models.Producto;
import com.redo.tp_Final.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ServiceProducto implements IServiceProducto{
    @Autowired
    private ProductoRepository repositorio;
    @Override
    public void registrarProducto(Producto producto) {
        repositorio.save(producto);
    }
    @Override
    public List<Producto> listarTodosLosProductos() {
        List<Producto> productos = repositorio.findAll();
        return productos;
    }
    @Override
    public Producto obtenerProducto(Long idProducto) {
        return repositorio.findById(idProducto).orElse(null);
    }
    @Override
    public void eliminarProducto(Long idProducto) {
        repositorio.deleteById(idProducto);
    }
    @Override
    public void modificarProducto(Long idProducto, Producto nuevoProducto) {
        repositorio.findById(idProducto).map(producto -> {
            producto.setNombre(nuevoProducto.getNombre());
            producto.setCosto(nuevoProducto.getCosto());
            producto.setCantidadDisponible(nuevoProducto.getCantidadDisponible());
            return repositorio.save(producto);
        });
    }
    @Override
    public List<Producto> devolverProductosConCantidadMenorA(int cantidad) {
        List<Producto> productos = repositorio.findAll();
        List<Producto> productosConPocoStock = new ArrayList<>();
        for(Producto p: productos){
            if(p.getCantidadDisponible() < 5)
                productosConPocoStock.add(p);
        }
        return productosConPocoStock;
    }
}
