package web.hotchop.models;

import web.hotchop.models.enums.Genero;

public class Cancion {
    private String nombre;
    private Integer duracion;
    private Genero genero;
    private Album album;

    public Cancion(String nombre, Integer duracion, Genero genero, Album album) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.genero = genero;
        this.album = album;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    @Override
    public String toString() {
        return nombre + " - Album: "+album.getTitulo()+" - Genero: "+genero+" - por "+album.getArtista().getNombre();
    }
}
