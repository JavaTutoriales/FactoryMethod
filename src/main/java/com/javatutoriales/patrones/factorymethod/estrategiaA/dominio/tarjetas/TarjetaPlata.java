package com.javatutoriales.patrones.factorymethod.estrategiaA.dominio.tarjetas;

public class TarjetaPlata implements TarjetaLealtad {

    private static final float PORCENTAJE_DESCUENTO = 5f / 100f; // 5% de descuento

    @Override
    public float calculaDescuento(float totalVenta) {
        return totalVenta * PORCENTAJE_DESCUENTO;
    }
}
