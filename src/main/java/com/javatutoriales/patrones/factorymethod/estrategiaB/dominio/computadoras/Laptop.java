package com.javatutoriales.patrones.factorymethod.estrategiaB.dominio.computadoras;

import lombok.ToString;


@ToString(callSuper = true)
public class Laptop extends Computadora {

    public Laptop(int gigasRam, float velocidadProcesador, String sistemaOperativo) {
        super(TipoComputadora.LAPTOP, gigasRam, velocidadProcesador, sistemaOperativo);
    }
}
