package com.redo.tp_Final.services;

import com.redo.tp_Final.models.Venta;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceVenta implements IServiceVenta{

    @Override
    public void registrarVenta(Venta venta) {

    }

    @Override
    public List<Venta> listarTodasLasVentas() {
        return null;
    }

    @Override
    public Venta obtenerVenta(Long idVenta) {
        return null;
    }

    @Override
    public void eliminarVenta(Long idVenta) {

    }

    @Override
    public void modificarVenta(Long idVenta, Venta venta) {

    }
}
