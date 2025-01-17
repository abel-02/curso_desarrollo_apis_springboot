package com.redo.tp_Final.services;

import com.redo.tp_Final.models.Cliente;
import com.redo.tp_Final.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceCliente implements IServiceCliente{
    @Autowired
    private ClienteRepository repositorio;
    @Override
    public void registrarCliente(Cliente cliente) {
        repositorio.save(cliente);
    }

    @Override
    public List<Cliente> listarTodosLosClientes() {
        List<Cliente> clientes = repositorio.findAll();
        return clientes;
    }

    @Override
    public Cliente obtenerCliente(Long idCliente) {

        return repositorio.findById(idCliente).orElse(null);
    }

    @Override
    public void eliminarCliente(Long idCliente) {
        repositorio.deleteById(idCliente);
    }

    public void modificarCliente(Long id, Cliente nuevoCliente) {
        repositorio.findById(id).map(cliente -> {
            cliente.setNombre(nuevoCliente.getNombre());
            cliente.setApellido(nuevoCliente.getApellido());
            return repositorio.save(cliente);
        });
    }

}
