package com.redo.tp_Final.controllers;

import com.redo.tp_Final.models.Cliente;
import com.redo.tp_Final.services.ServiceCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ServiceCliente servicio;
    @PostMapping("/crear")
    public void registrarCliente(@RequestBody Cliente cliente){
        servicio.registrarCliente(cliente);
    }
    @RequestMapping("")
    public List<Cliente> devolverListaCompleta(){
        return servicio.listarTodosLosClientes();
    }
    @RequestMapping("/{idCliente}")
    public Cliente devolverCliente(@PathVariable Long idCliente){
        return servicio.obtenerCliente(idCliente);
    }
    @DeleteMapping("/eliminar/{idCliente}")
    public void eliminarCliente(@PathVariable Long idCliente){
        servicio.eliminarCliente(idCliente);
    }
    @PutMapping("/editar/{idCliente}")
    public void editarCliente(@PathVariable Long idCliente, @RequestBody Cliente nuevoCliente){
        servicio.modificarCliente(idCliente, nuevoCliente);
    }
}
