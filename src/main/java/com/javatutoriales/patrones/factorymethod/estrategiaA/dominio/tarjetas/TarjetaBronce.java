package com.javatutoriales.patrones.factorymethod.estrategiaA.dominio.tarjetas;

public class TarjetaBronce implements TarjetaLealtad {

    @Override
    public float calculaDescuento(float totalVenta) {
        return 0;
    }
}
