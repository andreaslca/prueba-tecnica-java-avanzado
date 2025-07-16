import entities.Vuelo;
import utils.filtroVuelos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    /*Para facilitar el uso: la fecha del primer vuelo es: LocalDate.of(2025, 7, 15);
    Y la fecha del último vuelo: LocalDate.of(2026, 4, 14);
    Aquí van las Constantes, si pones null en ambas te sale la lista completa.
    Si cambias las fechas en cualquiera de las dos constantes, te sale la lista entre las fechas que hayas escogido.
    Si pones null en la fecha hasta te salen todas las fechas desde la de desde.
    Y si pones null en desde te salen las fechas hasta la fecha hasta, que hayas seleccionado*/
    private static final LocalDate FECHA_DESDE = LocalDate.of(2025, 7, 15);
    private static final LocalDate FECHA_HASTA = LocalDate.of(2026, 4, 14);

    public static void main(String[] args) {

        List<Vuelo> listaVuelos = new ArrayList<>();
        listaVuelos.add(new Vuelo(1, "DS202", "Iberia", "Santiago", "Madrid", LocalDate.of(2025, 7, 16), LocalDate.of(2025, 7, 16)));
        listaVuelos.add(new Vuelo(2, "ND103", "Ryanair", "Barcelona", "Berlín", LocalDate.of(2025, 8, 3), LocalDate.of(2025, 8, 3)));
        listaVuelos.add(new Vuelo(3, "CT304", "Vueling", "Lisboa", "París", LocalDate.of(2025, 9, 5), LocalDate.of(2025, 9, 5)));
        listaVuelos.add(new Vuelo(4, "LK890", "Transavia", "Bupapest", "Ámsterdam", LocalDate.of(2025, 10, 16), LocalDate.of(2025, 10, 16)));
        listaVuelos.add(new Vuelo(5, "BY908", "AirEuropa", "Frankfurt", "Oporto", LocalDate.of(2025, 11, 23), LocalDate.of(2025, 11, 23)));
        listaVuelos.add(new Vuelo(6, "DS207", "Iberia", "Londres", "Madrid", LocalDate.of(2025, 12, 25), LocalDate.of(2025, 12, 25)));
        listaVuelos.add(new Vuelo(7, "ND106", "Ryanair", "Vigo", "Roma", LocalDate.of(2026, 1, 13), LocalDate.of(2026, 1, 13)));
        listaVuelos.add(new Vuelo(8, "CT302", "Vueling", "Mallorca", "Atenas", LocalDate.of(2026, 2, 28), LocalDate.of(2026, 2, 28)));
        listaVuelos.add(new Vuelo(9, "FI709", "Emirates", "Sevilla", "Bucarest", LocalDate.of(2026, 3, 31), LocalDate.of(2026, 3, 31)));
        listaVuelos.add(new Vuelo(10, "DS213", "Iberia", "Dublín", "Santiago", LocalDate.of(2026, 4, 14), LocalDate.of(2026, 4, 14)));

        List<Vuelo> filtrarVuelosFecha = filtroVuelos.filtrarVuelosFecha(listaVuelos, FECHA_DESDE, FECHA_HASTA);
        System.out.println("Vuelos disponibles en las fechas solicitadas:");
        filtrarVuelosFecha.forEach(System.out::println);
    }
}