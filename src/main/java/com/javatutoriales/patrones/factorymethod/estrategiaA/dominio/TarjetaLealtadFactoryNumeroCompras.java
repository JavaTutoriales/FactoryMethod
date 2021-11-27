package com.javatutoriales.patrones.factorymethod.estrategiaA.dominio;

import com.javatutoriales.patrones.factorymethod.estrategiaA.TarjetaLealtadFactory;
import com.javatutoriales.patrones.factorymethod.estrategiaA.dominio.clientes.Cliente;
import com.javatutoriales.patrones.factorymethod.estrategiaA.dominio.tarjetas.TarjetaBronce;
import com.javatutoriales.patrones.factorymethod.estrategiaA.dominio.tarjetas.TarjetaLealtad;
import com.javatutoriales.patrones.factorymethod.estrategiaA.dominio.tarjetas.TarjetaOro;
import com.javatutoriales.patrones.factorymethod.estrategiaA.dominio.tarjetas.TarjetaPlata;

public class TarjetaLealtadFactoryNumeroCompras implements TarjetaLealtadFactory {

    private static final int MINIMO_COMPRAS_PLATA = 5;
    private static final int MINIMO_COMPRAS_ORO = 10;


    @Override
    public TarjetaLealtad getTarjetaLealtad(Cliente cliente) {

        if (cliente.getNumeroCompras() >= MINIMO_COMPRAS_ORO) {
            return new TarjetaOro();
        }

        if (cliente.getNumeroCompras() >= MINIMO_COMPRAS_PLATA) {
            return new TarjetaPlata();
        }

        return new TarjetaBronce();
    }
}
