package org.example.objects;

import java.time.Year;

public abstract class Materiales implements Comparable{
    private String titulo;
    private String autor;
    private Year añoPublicacion;

    public Materiales(String titulo, String autor, Year añoPublicacion) {
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

    public Year getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(Year añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    @Override
    public int compareTo(Materiales o) {
        if(this.getTitulo() == null){
            return 0;
        }
        return this.getTitulo().compareTo(o.getTitulo());
    }
}
