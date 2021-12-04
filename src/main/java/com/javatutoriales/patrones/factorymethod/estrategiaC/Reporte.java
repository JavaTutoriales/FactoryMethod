package com.javatutoriales.patrones.factorymethod.estrategiaC;

import lombok.ToString;

@ToString
public class Reporte extends Documento {
    public Reporte() {
        paginas.add(new Introduccion());
        paginas.add(new Resultados());
        paginas.add(new Conclusion());
        paginas.add(new Bibiografia());
    }
}
