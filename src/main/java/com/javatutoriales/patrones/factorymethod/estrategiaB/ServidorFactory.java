package com.javatutoriales.patrones.factorymethod.estrategiaB;

import com.javatutoriales.patrones.factorymethod.estrategiaB.dominio.computadoras.Computadora;
import com.javatutoriales.patrones.factorymethod.estrategiaB.dominio.computadoras.Servidor;

public class ServidorFactory implements ComputadoraFactory {
    @Override
    public Computadora getComputadora(int gigasRam, float velocidadProcesador, String sistemaOperativo) {
        return new Servidor(gigasRam, velocidadProcesador, sistemaOperativo);
    }
}
