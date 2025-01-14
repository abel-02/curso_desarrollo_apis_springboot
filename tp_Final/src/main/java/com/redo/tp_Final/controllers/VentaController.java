package com.redo.tp_Final.controllers;

import com.redo.tp_Final.models.Cliente;
import com.redo.tp_Final.models.Producto;
import com.redo.tp_Final.models.Venta;
import com.redo.tp_Final.services.ServiceVenta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class VentaController {
    @Autowired
    private ServiceVenta servicio;
    public void registrarVenta(){

    }
    public List<Venta> devolverListaCompleta(){
        return null;
    }
    public Venta devolverVenta(){
        return null;
    }
    public void eliminarVenta(){

    }
    public void editarVenta(){

    }
    public List<Producto> listarProductosDeUnaVenta(Long idVenta){
        return servicio.listarProductosDeUnaVenta(idVenta);
    }
    public List<Producto> obtenerMontoYCantidadDeVentasEnUnDia(LocalDate dia){
        return servicio.obtenerMontoYCantidadDeVentasEnUnDia(dia);
    }
}
