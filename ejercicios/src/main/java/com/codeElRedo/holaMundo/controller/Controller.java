package com.codeElRedo.holaMundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller
{
    @GetMapping("/hello/{nombre}")
    public String sayHello(@PathVariable String nombre)
    {
        return "Hi! Nice to meet you " + nombre + "!";
    }
    @GetMapping("/bye/{nombre}")
    public String sayBye(@PathVariable String nombre)
    {
        return "Are you exit? GoodBye " + nombre + " :3";
    }
    @GetMapping("/hello/{nombre}/{edad}/{ocupacion}")
    public String sayHelloCompleted(@PathVariable String nombre, @PathVariable int edad , @PathVariable String ocupacion)
    {
        return "Hi! Nice to meet you " + nombre +
                ", are you " + edad + " years old," +
                "and you ocupation is " + ocupacion;
    }
    @GetMapping("/sumar")
    public String sumarDosNumeros(@RequestParam int num1, @RequestParam int num2)
    {
        return "El resultado es: "+ (num1 + num2);
    }
    @GetMapping("/imc")
    public String calcularIMC(@RequestParam int peso)
    {
        if(peso >= 1 && peso <= 18.5)
            return "Peso insuficiente";
        if(peso > 18.5 && peso < 25)
            return "Peso normal";
        if(peso >= 25 && 30 > peso)
            return "Sobrepeso";
        if(peso >= 30)
            return "Obesidad";
        return "El peso no es válido";
    }
    @GetMapping("/turistaConversion")
    public double convertirGalonALitros(@RequestParam int galones)
    {
        return (galones*3.78541);
    }
}
