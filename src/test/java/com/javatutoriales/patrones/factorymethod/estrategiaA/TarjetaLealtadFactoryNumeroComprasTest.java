package com.javatutoriales.patrones.factorymethod.estrategiaA;

import com.javatutoriales.patrones.factorymethod.estrategiaA.dominio.TarjetaLealtadFactoryNumeroCompras;
import com.javatutoriales.patrones.factorymethod.estrategiaA.dominio.clientes.Cliente;
import com.javatutoriales.patrones.factorymethod.estrategiaA.dominio.tarjetas.TarjetaBronce;
import com.javatutoriales.patrones.factorymethod.estrategiaA.dominio.tarjetas.TarjetaLealtad;
import com.javatutoriales.patrones.factorymethod.estrategiaA.dominio.tarjetas.TarjetaOro;
import com.javatutoriales.patrones.factorymethod.estrategiaA.dominio.tarjetas.TarjetaPlata;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TarjetaLealtadFactoryNumeroComprasTest {

    TarjetaLealtadFactory tarjetaLealtadFactory = new TarjetaLealtadFactoryNumeroCompras();

    @Test
    public void testTarjetaBronce_cuandoComprasEsCero() {

        Cliente cliente = Cliente.builder().edad(15).numeroCompras(0).totalCompras(0).build();
        TarjetaLealtad tarjetaLealtad = tarjetaLealtadFactory.getTarjetaLealtad(cliente);

        final float montoCompra = 25f;

        assertThat(tarjetaLealtad).isOfAnyClassIn(TarjetaBronce.class);
        assertThat(tarjetaLealtad.calculaDescuento(montoCompra)).isEqualTo(0);
    }

    @Test
    public void testTarjetaBronce_cuandoComprasEsCuatro() {

        Cliente cliente = Cliente.builder().edad(16).numeroCompras(4).totalCompras(120f).build();
        TarjetaLealtad tarjetaLealtad = tarjetaLealtadFactory.getTarjetaLealtad(cliente);

        final float montoCompra = 35.5f;

        assertThat(tarjetaLealtad).isOfAnyClassIn(TarjetaBronce.class);
        assertThat(tarjetaLealtad.calculaDescuento(montoCompra)).isEqualTo(0);
    }

    @Test
    public void testTarjetaPlata_cuandoComprasEsCinco() {
        Cliente cliente = Cliente.builder().edad(20).numeroCompras(5).totalCompras(155.5f).build();
        TarjetaLealtad tarjetaLealtad = tarjetaLealtadFactory.getTarjetaLealtad(cliente);

        final float montoCompra = 40f;

        assertThat(tarjetaLealtad).isOfAnyClassIn(TarjetaPlata.class);
        assertThat(tarjetaLealtad.calculaDescuento(montoCompra)).isEqualTo(2f);
    }

    @Test
    public void testTarjetaOrocuandoComprasEs10YPrecioEsBajo() {
        Cliente cliente = Cliente.builder().edad(27).numeroCompras(10).totalCompras(255.5f).build();
        TarjetaLealtad tarjetaLealtad = tarjetaLealtadFactory.getTarjetaLealtad(cliente);

        final float montoCompra = 40f;

        assertThat(tarjetaLealtad).isOfAnyClassIn(TarjetaOro.class);
        assertThat(tarjetaLealtad.calculaDescuento(montoCompra)).isEqualTo(4f);
    }

    @Test
    public void testTarjetaOrocuandoComprasEs10YPrecioEsAlto() {
        Cliente cliente = Cliente.builder().edad(27).numeroCompras(10).totalCompras(300f).build();
        TarjetaLealtad tarjetaLealtad = tarjetaLealtadFactory.getTarjetaLealtad(cliente);


        final float montoCompra = 80f;

        assertThat(tarjetaLealtad).isOfAnyClassIn(TarjetaOro.class);
        assertThat(tarjetaLealtad.calculaDescuento(montoCompra)).isEqualTo(4f);
    }


}