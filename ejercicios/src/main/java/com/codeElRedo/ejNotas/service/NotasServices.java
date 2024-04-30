package com.codeElRedo.ejNotas.service;

import org.springframework.stereotype.Service;

@Service
public class NotasServices
{

    public double promedio(double nota1, double nota2, double nota3)
    {
        return (nota1 + nota2 + nota3) / 3;
    }
}
