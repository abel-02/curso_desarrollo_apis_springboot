package com.codeElRedo.ejOdontologo.controller;

import com.codeElRedo.ejOdontologo.model.Paciente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

@RestController
public class OdontologoController
{
    private List<Paciente> listaPacientes;

    public OdontologoController()
    {
        this.listaPacientes = new ArrayList<>();
        listaPacientes.add(new Paciente(2455, 44548921, "Patricio", "Estrella", LocalDate.of(2002,3,13)));
        listaPacientes.add(new Paciente(2456, 44648527, "Bob", "Esponja", LocalDate.of(2002,4,13)));
    }

    @GetMapping("/pacientes")
    @ResponseBody
    public List<Paciente> traerPacientes()
    {
        return this.listaPacientes;
    }
    @GetMapping("/pacientes/menores")
    @ResponseBody
    public List<Paciente> traerPacientesMenores()
    {
        List<Paciente> auxList = new ArrayList<>();
        for(Paciente p: this.listaPacientes){
            if(esMenorDeEdad(p))
                auxList.add(p);
        }
        return this.listaPacientes;
    }

    private boolean esMenorDeEdad(Paciente p) {
        LocalDate hoy = LocalDate.now();
        int edadPaciente = Period.between(hoy,p.getFechaNacimiento()).getYears();
        return  edadPaciente < 18;
    }
}
