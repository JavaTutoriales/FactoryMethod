package com.javatutoriales.patrones.factorymethod.estrategiaC;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public abstract class Documento {

    protected List<Pagina> paginas = new ArrayList<>();


    public static Documento getDocumento(TipoDocumento tipo) {
        if (TipoDocumento.REPORTE.equals(tipo)) {
            return new Reporte();
        }

        return new Resumen();

    }

    abstract class Pagina {
    }

    class Introduccion extends Pagina {
    }

    class Resultados extends Pagina {
    }

    class Conclusion extends Pagina {
    }

    class Bibiografia extends Pagina {
    }
}
