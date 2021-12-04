package com.javatutoriales.patrones.factorymethod.estrategiaB;

import com.javatutoriales.patrones.factorymethod.estrategiaB.dominio.computadoras.Computadora;

public interface ComputadoraFactory {
    Computadora getComputadora(int gigasRam, float velocidadProcesador, String sistemaOperativo);
}
