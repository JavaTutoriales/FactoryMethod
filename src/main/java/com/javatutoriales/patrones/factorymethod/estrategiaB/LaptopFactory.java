package com.javatutoriales.patrones.factorymethod.estrategiaB;

import com.javatutoriales.patrones.factorymethod.estrategiaB.dominio.computadoras.Computadora;
import com.javatutoriales.patrones.factorymethod.estrategiaB.dominio.computadoras.Laptop;

public class LaptopFactory implements ComputadoraFactory {
    @Override
    public Computadora getComputadora(int gigasRam, float velocidadProcesador, String sistemaOperativo) {
        return new Laptop(gigasRam, velocidadProcesador, sistemaOperativo);
    }
}
