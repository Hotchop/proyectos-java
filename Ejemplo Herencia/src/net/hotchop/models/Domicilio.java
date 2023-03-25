package net.hotchop.models;

public class Domicilio {
    private String calle;
    private Integer numero;
    private String localidad;

    public Domicilio(String calle, Integer numero, String localidad) {
        this.calle = calle;
        this.numero = numero;
        this.localidad = localidad;
    }
}
