package web.hotchop.models;

import java.util.Date;

public class Vuelo {
    private String nombre;
    private String origen;
    private String destino;
    private Date fechaLlegada;
    private Date horaLlegada;
    private int cantidadPasajeros;

    public Vuelo(String nombre, String origen, String destino, Date fechaLlegada, Date horaLlegada, int cantidadPasajeros) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.fechaLlegada = fechaLlegada;
        this.horaLlegada = horaLlegada;
        this.cantidadPasajeros = cantidadPasajeros;
    }

}
