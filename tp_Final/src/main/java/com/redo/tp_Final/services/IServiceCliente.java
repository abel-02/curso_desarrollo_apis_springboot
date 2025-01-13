package com.redo.tp_Final.services;

import com.redo.tp_Final.models.Cliente;

import java.util.List;

public interface IServiceCliente {
    void registrarCliente(Cliente cliente);

    List<Cliente> listarTodosLosClientes();

    Cliente obtenerCliente(Long idCliente);

    void eliminarCliente(Long idCliente);

    void modificarCliente(Long idCliente, Cliente cliente);
}
