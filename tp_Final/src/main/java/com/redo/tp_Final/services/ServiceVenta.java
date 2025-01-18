package com.redo.tp_Final.services;

import com.redo.tp_Final.models.Producto;
import com.redo.tp_Final.models.Venta;
import com.redo.tp_Final.repository.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ServiceVenta implements IServiceVenta{
    @Autowired
    private VentaRepository repositorio;

    @Override
    public void registrarVenta(Venta venta) {
        repositorio.save(venta);
    }
    @Override
    public List<Venta> listarTodasLasVentas() {
        return repositorio.findAll();
    }
    @Override
    public Venta obtenerVenta(Long idVenta) {
        return repositorio.findById(idVenta).orElse(null);
    }
    @Override
    public void eliminarVenta(Long idVenta) {
        repositorio.deleteById(idVenta);
    }
    @Override
    public void modificarVenta(Long idVenta, Venta nuevaVenta) {
        repositorio.findById(idVenta).map(venta -> {
            venta.setListaProductos(nuevaVenta.getListaProductos());
            return repositorio.save(venta);
        });
    }

    @Override
    public List<Producto> listarProductosDeUnaVenta(Long idVenta) {
        return null;
    }

    @Override
    public List<Producto> obtenerMontoYCantidadDeVentasEnUnDia(LocalDate dia) {
        return null;
    }
}
