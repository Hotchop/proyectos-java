package net.hotchop.models;

public class Alumno extends Persona {
    private String instituto;
    private Float promedio;

    public Alumno(String nombre, String apellido, Integer dni, String instituto, Float promedio) {
        super(nombre, apellido, dni);
        this.instituto = instituto;
        this.promedio = promedio;
    }
}
