package com.redo.tp_Final.services;

import com.redo.tp_Final.models.Producto;
import com.redo.tp_Final.models.Venta;
import com.redo.tp_Final.repository.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

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
        Venta venta = repositorio.findById(idVenta).orElse(null);
        if(venta == null)
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No se encontro ventas ");
        return venta.getListaProductos();
    }

    @Override
    public String obtenerMontoYCantidadDeVentasEnUnDia(LocalDate dia) {
        List<Venta> ventas = repositorio.findAll();
        double monto = 0;
        int cantidadVentas = 0;

        for (Venta v : ventas) {
            if (v.getFechaVenta().equals(dia)) {
                monto += v.getTotal();
                cantidadVentas++;
            }
        }

        if (cantidadVentas == 0)
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No se registraron ventas ese día.");

        return monto + ", " + cantidadVentas;
    }
    @Override
    public Venta ventaConElMayorMonto() {
        List<Venta> ventas = repositorio.findAll();
        if (ventas.isEmpty())
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No se encontraron ventas registradas.");


        Venta ventaConMayorMonto = ventas.get(0);
        for (Venta v : ventas) {
            if (v.getTotal() > ventaConMayorMonto.getTotal()) {
                ventaConMayorMonto = v;
            }
        }
        return ventaConMayorMonto;
    }



}
