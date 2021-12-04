package com.javatutoriales.patrones.factorymethod.estrategiaC;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DocumentoFactoryTest {

    @Test
    void testDocumentFactory_cuandoReporte() {
        Documento documento = Documento.getDocumento(TipoDocumento.REPORTE);

        assertThat(documento).isNotNull();
        assertThat(documento instanceof Reporte).isTrue();

        assertThat(documento.paginas)
                .isNotNull()
                .isNotEmpty();

        for (Documento.Pagina pagina : documento.getPaginas()) {
            assertThat(pagina).isOfAnyClassIn(
                    Documento.Introduccion.class,
                    Documento.Resultados.class,
                    Documento.Conclusion.class,
                    Documento.Bibiografia.class);
        }
    }

    @Test
    void testDocumentFactory_cuandoResumen() {
        Documento documento = Documento.getDocumento(TipoDocumento.RESUMEN);

        assertThat(documento).isNotNull();
        assertThat(documento instanceof Resumen).isTrue();

        assertThat(documento.paginas)
                .isNotNull()
                .isNotEmpty();

        for (Documento.Pagina pagina : documento.getPaginas()) {
            assertThat(pagina).isOfAnyClassIn(
                    Documento.Resultados.class,
                    Documento.Conclusion.class);
        }
    }
}
