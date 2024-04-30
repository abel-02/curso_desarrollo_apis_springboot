package com.codeElRedo.ejEstaturasBasquet.repository;

import com.codeElRedo.ejEstaturasBasquet.model.Jugador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BasquetRepository
{
    private ArrayList<Jugador> equipo;

    public BasquetRepository()
    {
        this.equipo = new ArrayList<>();
    }

    public boolean inscribirJugadorEnElEquipo(Jugador jugador)
    {
        return equipo.add(jugador);
    }
    public double calcularEstaturaPromedio() {
        double promedio = 0;
        for(Jugador jugador: this.equipo)
            promedio += jugador.getEstatura();
        return promedio / this.equipo.size();
    }
}
