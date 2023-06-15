package org.example.objects;

import java.time.Year;

public abstract class Materiales{
    private String titulo;
    private String autor;
    private int añoPublicacion;

    public Materiales(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    @Override
    public String toString() {
        return "Materiales{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", añoPublicacion=" + añoPublicacion +
                '}';
    }
}
