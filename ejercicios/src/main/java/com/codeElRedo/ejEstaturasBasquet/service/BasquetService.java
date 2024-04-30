package com.codeElRedo.ejEstaturasBasquet.service;

import com.codeElRedo.ejEstaturasBasquet.model.Jugador;
import com.codeElRedo.ejEstaturasBasquet.repository.BasquetRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class BasquetService
{
    @Autowired
    private BasquetRepository repository;

    public boolean registrarJugador(int id, int dni, String nombre, String apellido, int edad, double peso, double estatura){
        return repository.inscribirJugadorEnElEquipo(new Jugador(id,dni,nombre,apellido, edad,peso,estatura));
    }
    public double calcularEstaturaPromedioDelEquipo() {
        return repository.calcularEstaturaPromedio();
    }
}
