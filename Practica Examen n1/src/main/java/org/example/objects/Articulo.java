package org.example.objects;

import java.time.Year;

public class Articulo extends Materiales{
    private String resumen;

    public Articulo(String titulo, String autor, int añoPublicacion, String resumen) {
        super(titulo, autor, añoPublicacion);
        this.resumen = resumen;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "resumen='" + resumen + '\'' +
                '}';
    }
}
