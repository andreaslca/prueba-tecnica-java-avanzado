package entities;

import java.time.LocalDate;

public class Vuelo {
    private int Id;
    private String nombreVuelo;
    private String empresa;
    private String lugarSalida;
    private String lugarLlegada;
    private LocalDate fechaInicio;
    private LocalDate fechaFinal;

    //constructor con sus tipos, para que no salgan todos los valores como null
    public Vuelo(int id, String nombreVuelo, String empresa, String lugarSalida, String lugarLlegada, LocalDate fechaInicio, LocalDate fechaFinal) {
        Id = id;
        this.nombreVuelo = nombreVuelo;
        this.empresa = empresa;
        this.lugarSalida = lugarSalida;
        this.lugarLlegada = lugarLlegada;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
    }

    //getters fechas
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    //como se hace a partir de la de inicio, no tiene usos, pero la dejé para hacer pruebas
    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    //generate: toString para que todos los atributos se muestren por su nombre pese a ser distintos tipos de variables, porque si no sale una asignación autogenerada ej: vuelo@jdfosdiv
    @Override
    public String toString() {
        return "Vuelo{" +
                "Id=" + Id +
                ", Vuelo='" + nombreVuelo + '\'' +
                ", Aerolínea='" + empresa + '\'' +
                ", Aeropuerto de salida='" + lugarSalida + '\'' +
                ", Aeropuerto de llegada'" + lugarLlegada + '\'' +
                ", Fecha de salida=" + fechaInicio +
                ", Fecha de llegada=" + fechaFinal +
                '}';
    }
}
