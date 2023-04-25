package web.hotchop.models;

import java.time.Year;

public class Album {
    private Year publicacion;
    private String titulo;
    private Artista artista;

    public Album(Year publicacion, String titulo, Artista artista) {
        this.publicacion = publicacion;
        this.titulo = titulo;
        this.artista = artista;
    }

    public Year getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Year publicacion) {
        this.publicacion = publicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "Album{" +
                "publicacion=" + publicacion +
                ", titulo='" + titulo + '\'' +
                ", artista=" + artista +
                '}';
    }
}
