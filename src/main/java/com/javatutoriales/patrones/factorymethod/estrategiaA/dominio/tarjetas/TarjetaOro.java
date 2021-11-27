package com.javatutoriales.patrones.factorymethod.estrategiaA.dominio.tarjetas;

public class TarjetaOro extends TarjetaLealtad {

    private static final float PORCENTAJE_DESCUENTO_PRECIO_BAJO = 10f / 100f; // 10% de descuento
    private static final float PORCENTAJE_DESCUENTO_PRECIO_ALTO = 5f / 100f; // 5% de descuento

    private static final float UMBRAL_PRECIO_ALTO = 50f;


    @Override
    public float calculaDescuento(float totalVenta) {
        return totalVenta > UMBRAL_PRECIO_ALTO ? totalVenta * PORCENTAJE_DESCUENTO_PRECIO_ALTO : totalVenta * PORCENTAJE_DESCUENTO_PRECIO_BAJO;
    }
}
