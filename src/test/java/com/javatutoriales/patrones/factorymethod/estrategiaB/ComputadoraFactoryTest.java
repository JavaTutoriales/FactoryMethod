package com.javatutoriales.patrones.factorymethod.estrategiaB;

import com.javatutoriales.patrones.factorymethod.estrategiaB.dominio.computadoras.Computadora;
import com.javatutoriales.patrones.factorymethod.estrategiaB.dominio.computadoras.Laptop;
import com.javatutoriales.patrones.factorymethod.estrategiaB.dominio.computadoras.Servidor;
import com.javatutoriales.patrones.factorymethod.estrategiaB.dominio.computadoras.TipoComputadora;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ComputadoraFactoryTest {

    ComputadoraFactory computadoraFactory;

    @Test
    void testLaptopFactory() {
        computadoraFactory = new LaptopFactory();

        Computadora computadora1 = computadoraFactory.getComputadora(16, 2.4f, "Windows");
        Computadora computadora2 = computadoraFactory.getComputadora(8, 3.2f, "Ubuntu");


        assertThat(computadora1.getTipo()).isEqualTo(TipoComputadora.LAPTOP);
        assertThat(computadora2.getTipo()).isEqualTo(TipoComputadora.LAPTOP);

        assertThat(computadora1.getClass()).isEqualTo(Laptop.class);
        assertThat(computadora2.getClass()).isEqualTo(Laptop.class);
    }

    @Test
    void testServidorFactory() {
        computadoraFactory = new ServidorFactory();

        Computadora computadora1 = computadoraFactory.getComputadora(16, 2.4f, "Windows Server");
        Computadora computadora2 = computadoraFactory.getComputadora(8, 3.2f, "Ubuntu Server");


        assertThat(computadora1.getTipo()).isEqualTo(TipoComputadora.SERVIDOR);
        assertThat(computadora2.getTipo()).isEqualTo(TipoComputadora.SERVIDOR);

        assertThat(computadora1.getClass()).isEqualTo(Servidor.class);
        assertThat(computadora2.getClass()).isEqualTo(Servidor.class);
    }
}
