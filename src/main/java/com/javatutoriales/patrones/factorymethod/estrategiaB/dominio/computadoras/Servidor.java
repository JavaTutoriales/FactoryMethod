package com.javatutoriales.patrones.factorymethod.estrategiaB.dominio.computadoras;

import lombok.ToString;


@ToString(callSuper = true)
public class Servidor extends Computadora {
    public Servidor(int gigasRam, float velocidadProcesador, String sistemaOperativo) {
        super(TipoComputadora.SERVIDOR, gigasRam, velocidadProcesador, sistemaOperativo);
    }
}
