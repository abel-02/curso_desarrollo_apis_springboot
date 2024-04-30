package com.codeElRedo.demoJPA.service;

import com.codeElRedo.demoJPA.model.Persona;

import java.util.List;

public interface IPersonaService
{
    public List<Persona> getPersonas();

    public void savePersona(Persona persona);

    public void deletePersona(Long id);

    public Persona findPersona(Long id);

    public void editPersona(Long id, String nuevoNombre, String nuevoApellido, Integer nuevaEdad);
}
