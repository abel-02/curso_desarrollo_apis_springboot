package com.redo.tp_Final.controllers;

import com.redo.tp_Final.models.Cliente;
import com.redo.tp_Final.models.Producto;
import com.redo.tp_Final.models.Venta;
import com.redo.tp_Final.services.ServiceVenta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/ventas")
public class VentaController {
    @Autowired
    private ServiceVenta servicio;
    @PostMapping("/crear")
    public void registrarVenta(@RequestBody Venta venta){
        servicio.registrarVenta(venta);
    }
    @RequestMapping("")
    public List<Venta> devolverListaCompleta(){
        return servicio.listarTodasLasVentas();
    }
    @RequestMapping("/{codigoVenta}")
    public Venta devolverVenta(@PathVariable Long codigoVenta){
        return servicio.obtenerVenta(codigoVenta);
    }
    @DeleteMapping("/eliminar/{codigoVenta}")
    public void eliminarVenta(@PathVariable Long codigoVenta){
        servicio.eliminarVenta(codigoVenta);
    }
    @PutMapping("/editar/{codigoVenta}")
    public void editarVenta(@PathVariable Long codigoVenta, @RequestBody Venta nuevaVenta){
        servicio.modificarVenta(codigoVenta, nuevaVenta);
    }
    @RequestMapping("/productos/{codigoVenta}")
    public List<Producto> listarProductosDeUnaVenta(@PathVariable Long codigoVenta){
        return servicio.listarProductosDeUnaVenta(codigoVenta);
    }
    @RequestMapping("/{fechaVenta}")
    public List<Producto> obtenerMontoYCantidadDeVentasEnUnDia(@PathVariable LocalDate fechaVenta){
        return servicio.obtenerMontoYCantidadDeVentasEnUnDia(fechaVenta);
    }
}
