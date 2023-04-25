package web.hotchop.models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Vuelo implements Comparable<Vuelo>{
    private String nombre;
    private String origen;
    private String destino;
    private LocalDateTime fechaLlegada;
    private int cantidadPasajeros;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    public Vuelo(String nombre, String origen, String destino, LocalDateTime fechaLlegada, int cantidadPasajeros) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.fechaLlegada = fechaLlegada;
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDateTime getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(LocalDateTime fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    @Override
    public int compareTo(Vuelo o) {
        return this.fechaLlegada.compareTo(o.fechaLlegada);
    }


    @Override
    public String toString() {
        return "Vuelo{" +
                "nombre='" + nombre + '\'' +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", fechaLlegada=" + fechaLlegada.format(formatter) +
                ", cantidadPasajeros=" + cantidadPasajeros +
                '}';
    }
}
