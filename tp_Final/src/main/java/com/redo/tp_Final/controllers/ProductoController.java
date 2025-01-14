package com.redo.tp_Final.controllers;

import com.redo.tp_Final.models.Producto;
import com.redo.tp_Final.services.ServiceProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductoController {
    @Autowired
    private ServiceProducto servicio;
    public void crearProducto(){

    }
    public List<Producto> devolverListaCompleta(){
        return null;
    }
    public Producto devolverUnProducto(){
       return null;
    }
    public void eliminarUnProducto(){

    }
    public void editarUnProducto(){

    }
    public List<Producto> productosConCantidadMenorA(int cantidad){
        return servicio.devolverProductosConCantidadMenorA(cantidad);
    }
}
