package com.redo.tp_Final.controllers;

import com.redo.tp_Final.models.Producto;
import com.redo.tp_Final.services.ServiceProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {
    @Autowired
    private ServiceProducto servicio;
    @PostMapping("/crear")
    public void crearProducto(@RequestBody Producto producto){
        servicio.registrarProducto(producto);
    }
    @RequestMapping("")
    public List<Producto> devolverListaCompleta(){

        return servicio.listarTodosLosProductos();
    }
    @RequestMapping("/{idProducto}")
    public Producto devolverUnProducto(@PathVariable Long idProducto){

        return servicio.obtenerProducto(idProducto);
    }
    @DeleteMapping("/{idProducto}")
    public void eliminarUnProducto(@PathVariable Long idProducto){
        servicio.eliminarProducto(idProducto);
    }
    @PutMapping("/{idProducto}")
    public void editarUnProducto(@PathVariable Long idProducto, Producto nuevoProducto){
        servicio.modificarProducto(idProducto, nuevoProducto);
    }
    @RequestMapping("/falta_stock")
    public List<Producto> productosConCantidadMenorA(int cantidad){
        return servicio.devolverProductosConCantidadMenorA(cantidad);
    }
}
