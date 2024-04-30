package com.codeElRedo.demoPost.controller;

import com.codeElRedo.demoPost.model.Cliente;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {
    @PostMapping("/Cliente")
    public void nuevoCliente(@RequestBody Cliente cliente)
    {
        System.out.println(cliente.getDni());
        System.out.println(cliente.getNombre());
        System.out.println(cliente.getApellido());
    }
    @GetMapping("/cliente/obtener")
    @ResponseBody
    public List<Cliente> obtenerClientes()
    {
        List<Cliente> lista = new ArrayList<>();
        lista.add(new Cliente(1,"enzo","perez"));
        lista.add(new Cliente(5,"enzo","fernandez"));
        lista.add(new Cliente(2,"enzo","diaz"));
        return lista;
    }
    @GetMapping("/pruebaresponse")
    ResponseEntity<String> traerRespuesta()
    {
        return new ResponseEntity<>("Prueba de response", HttpStatus.OK);
    }
}
