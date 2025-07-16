package utils;

import entities.Vuelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//función de filtrado utilizando únicamente la fecha de inicio. Accedemos a la Lista de vuelos, hecha en main y creamos una lista donde se vayan a guardar los elementos que filtremos.
public class filtroVuelos {
    public static List<Vuelo> filtrarVuelosFecha(List<Vuelo> listaVuelos, LocalDate FECHA_DESDE, LocalDate FECHA_HASTA) {
        List<Vuelo> vuelosFiltrados = new ArrayList<>();
        for (Vuelo vuelo : listaVuelos) {
            LocalDate fechaInicio = vuelo.getFechaInicio();
            boolean filtroDesdeHasta = false;
            if (FECHA_DESDE != null && FECHA_HASTA != null) {
                if (!fechaInicio.isBefore(FECHA_DESDE)) {
                    if (!fechaInicio.isAfter(FECHA_HASTA)) {
                        filtroDesdeHasta = true;
                    }
                }
            } else if (FECHA_DESDE != null) {
                if (!fechaInicio.isBefore(FECHA_DESDE)) {
                    filtroDesdeHasta = true;
                }

            } else if (FECHA_HASTA != null) {
                if (!fechaInicio.isAfter(FECHA_HASTA)) {
                    filtroDesdeHasta = true;
                }

            } else {
                filtroDesdeHasta = true;
            }
            if (filtroDesdeHasta) {
                vuelosFiltrados.add(vuelo);
            }
        }
        vuelosFiltrados.sort(new Comparator<Vuelo>() {
            public int compare(Vuelo v1, Vuelo v2) {
                return v1.getFechaInicio().compareTo(v2.getFechaInicio());
            }
        });
        return vuelosFiltrados;
    }
}
//lo ordené con ctrl+alt+l