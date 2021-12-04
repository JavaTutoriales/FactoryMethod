package com.javatutoriales.patrones.factorymethod.estrategiaB.dominio.computadoras;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Computadora {
    protected TipoComputadora tipo;
    protected int gigasRam;
    protected float velocidadProcesador;
    protected String sistemaOperativo;
}
