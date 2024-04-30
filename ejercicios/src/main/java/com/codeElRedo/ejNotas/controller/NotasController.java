package com.codeElRedo.ejNotas.controller;

import com.codeElRedo.ejNotas.service.NotasServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotasController
{
    @Autowired
    private NotasServices notasServices;

    @GetMapping("/promedio")
    public double calcularPromedio(@RequestParam double nota1, @RequestParam double nota2, @RequestParam double nota3)
    {
        return notasServices.promedio(nota1,nota2,nota3);
    }
}
