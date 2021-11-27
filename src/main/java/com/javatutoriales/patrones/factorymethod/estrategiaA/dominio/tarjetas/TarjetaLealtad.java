package com.javatutoriales.patrones.factorymethod.estrategiaA.dominio.tarjetas;

import lombok.Data;

@Data
public abstract class TarjetaLealtad {

    private float saldo;

    public abstract float calculaDescuento(float totalVenta);
}
