package com.codeElRedo.demoJPA.service;

import com.codeElRedo.demoJPA.model.Persona;
import com.codeElRedo.demoJPA.repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersonaService
{
    @Autowired
    private IPersonaRepository repository;

    @Override
    public List<Persona> getPersonas()
    {
        List<Persona> personas = repository.findAll();
        return personas;
    }

    @Override
    public void savePersona(Persona persona)
    {
        repository.save(persona);
    }

    @Override
    public void deletePersona(Long id)
    {
        repository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id)
    {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void editPersona(Long id, String nuevoNombre, String nuevoApellido, Integer nuevaEdad)
    {
        Persona persona = repository.getById(id);
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setEdad(nuevaEdad);
    // Asi se edita con Hibernate, ya que no tiene explicitamente un metodo 'Edit'
        this.savePersona(persona);
    }
}
