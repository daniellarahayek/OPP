package com.ejercicio.oop.calculadora;

import com.ejercicio.oop.modelos.Pelicula;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public void incluye(Pelicula pelicula){
        tiempoTotal += pelicula.getDuracionEnMinutos();
    }
}
