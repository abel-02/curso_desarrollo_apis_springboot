package com.redo.tp_Final.services;

import com.redo.tp_Final.models.Cliente;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceCliente implements IServiceCliente{
    @Override
    public void registrarCliente(Cliente cliente) {

    }

    @Override
    public List<Cliente> listarTodosLosClientes() {
        return null;
    }

    @Override
    public Cliente obtenerCliente(Long idCliente) {
        return null;
    }

    @Override
    public void eliminarCliente(Long idCliente) {

    }

    @Override
    public void modificarCliente(Long idCliente, Cliente cliente) {

    }
}
