package com.ejercicio.oop.calculos;

public class FiltroRecomendacion {
    public void filtra(Clasificacion clasificacion){
        if(clasificacion.getClasificacion()>= 4){
            System.out.println("Muy bien evaluado");
        }else if(clasificacion.getClasificacion() >=2){
            System.out.println("popular");
        }else {
            System.out.println("Checalo despues");
        }
    }
}
