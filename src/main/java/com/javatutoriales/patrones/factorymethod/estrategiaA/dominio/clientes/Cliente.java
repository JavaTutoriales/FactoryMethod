package com.javatutoriales.patrones.factorymethod.estrategiaA.dominio.clientes;

import com.javatutoriales.patrones.factorymethod.estrategiaA.dominio.tarjetas.TarjetaLealtad;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Cliente {
    private int edad;
    private int numeroCompras;
    private float totalCompras;

    private TarjetaLealtad tarjetaLealtad;

    public void compra(float montoCompra) {
        totalCompras += montoCompra;
        numeroCompras++;
    }
}
