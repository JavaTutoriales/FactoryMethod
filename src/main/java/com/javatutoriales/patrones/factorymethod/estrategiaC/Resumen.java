package com.javatutoriales.patrones.factorymethod.estrategiaC;

public class Resumen extends Documento{
    public Resumen() {
        paginas.add(new Resultados());
        paginas.add(new Conclusion());
    }
}
