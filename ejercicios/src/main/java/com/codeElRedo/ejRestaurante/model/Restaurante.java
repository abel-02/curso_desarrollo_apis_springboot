package com.codeElRedo.ejRestaurante.model;

import com.codeElRedo.ejRestaurante.RestauranteApp;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
@Getter
public class Restaurante
{
    private List<Plato> platos;

    public Restaurante(){
        this.platos = new ArrayList<>();
        platos.add(new Plato(0,"Pizza Napoli", 5700, "Pizza mozzarella,tomate..."));
        platos.add(new Plato(0,"Hamburguesa California", 4400, "Hamburguesa barbacoa..."));
        platos.add(new Plato(0,"Hamburguesa Argentina", 4400, "Mayonesa de ajo, muzarella..."));
        platos.add(new Plato(0,"Hamburguesa Traicional", 4300, "Hamburguesa lechuga,tomate..."));
        platos.add(new Plato(0,"Sandwich vegetariano", 4000, "Morron, berenjena..."));
    }

}
