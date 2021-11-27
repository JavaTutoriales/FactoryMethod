package com.javatutoriales.patrones.factorymethod.estrategiaA;

import com.javatutoriales.patrones.factorymethod.estrategiaA.dominio.clientes.Cliente;
import com.javatutoriales.patrones.factorymethod.estrategiaA.dominio.tarjetas.TarjetaLealtad;

public interface TarjetaLealtadFactory {
    TarjetaLealtad getTarjetaLealtad(Cliente cliente);
}
