package com.codeElRedo.demoJPA.controller;

import com.codeElRedo.demoJPA.model.Persona;
import com.codeElRedo.demoJPA.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonaController
{

    @Autowired
    private IPersonaService service;

    @GetMapping("/personas/traer")
    public List<Persona> getPersonas()
    {
        return service.getPersonas();
    }

    @PostMapping("/personas/crear")
    public String createStudent(@RequestBody Persona persona)
    {
        service.savePersona(persona);
        return "Se creo correctamente la persona";
    }

    @DeleteMapping("/personas/borar{id}")
    public String deletePersona(Long id)
    {
        service.deletePersona(id);
        return "Se elimino correctamente la persona";
    }

    @PutMapping("/personas/editar/{idEditar}")
    public Persona editPersona(Long id,
                              @RequestParam(required = false, name = "nuevoNombre") String nuevoNombre,
                              @RequestParam(required = false, name = "nuevoApellido") String nuevoApellido,
                              @RequestParam(required = false, name = "nuevaEdad") Integer nuevaEdad)
    {
        service.editPersona(id, nuevoNombre, nuevoApellido, nuevaEdad);
        Persona persona = service.findPersona(id);
        return persona;
    }
}
