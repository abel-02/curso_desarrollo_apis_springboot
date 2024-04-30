package com.codeElRedo.ejRestaurante.controller;

import com.codeElRedo.ejRestaurante.model.Plato;
import com.codeElRedo.ejRestaurante.model.Restaurante;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class controlerRestaurante
{
    private Restaurante restobar;

    public controlerRestaurante(){
        this.restobar = new Restaurante();
    }

    @GetMapping("/platos/{numPlato}")
    @ResponseBody
    public Plato pedirOrden(@PathVariable int numPlato)
    {
        return this.restobar.getPlatos().get(numPlato);
    }
    @GetMapping ("/platos/{num_plato}")
    @ResponseBody
    public Plato traerPlatos (@PathVariable int num_plato) {
        List<Plato> listaPlatos = new ArrayList<Plato>();
        //simulamos la bd lógica agregando elementos a la lista
        listaPlatos.add(new Plato (1, "Milanesas con Puré",500.00,"Milanesa simple, sin napolitana con puré de papas"));
        listaPlatos.add(new Plato (2, "Ravioles con Salsa Bolognesa",850.00,"Ravioles de verdura o ricota con salsa bolognesa y queso rallado"));
        listaPlatos.add(new Plato (3, "Lomo a la mostaza con papas fritas",1200.00,"Bides de lomo con salsa de mostaza y papas fritas"));
        listaPlatos.add(new Plato (4, "Ensalada mixta",350.00,"Ensalada de lechuga, tomate y cebolla"));
        listaPlatos.add(new Plato (5, "Milanesas con arroz primavera",500.00,"Milanesa simple, sin napolitana con arroz y verduras"));

        for (Plato plat : listaPlatos) {
            if (plat.getNumeroPlato() == num_plato) {
                //Si encontró devuelve el plato completo
                return plat;
            }
        }

        //si no encontró nada, devuelve null
        return null;
    }
}
