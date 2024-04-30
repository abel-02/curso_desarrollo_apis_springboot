package com.codeElRedo.ejEstaturasBasquet.controller;

import com.codeElRedo.ejEstaturasBasquet.service.BasquetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasquetController
{
    @Autowired
    private BasquetService service;

    @PostMapping("/jugadores")
    public void inscribirJugador(@RequestParam int id, @RequestParam int dni, @RequestParam String nombre, @RequestParam String apellido,
                                        @RequestParam int edad, @RequestParam double peso, double estatura)
    {
        if(service.registrarJugador(id,dni, nombre, apellido, edad, peso, estatura))
            System.out.println("El jugador se registro correctamente");
        else
            System.out.println("Hubo un error en el registro del jugador");
        promedioDelEquipo();
    }
    @ResponseBody
    private double promedioDelEquipo() {
        return service.calcularEstaturaPromedioDelEquipo();
    }
}
