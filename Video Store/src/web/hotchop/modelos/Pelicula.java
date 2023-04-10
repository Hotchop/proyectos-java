package web.hotchop.modelos;

import web.hotchop.modelos.enums.Genero;
import web.hotchop.modelos.enums.Pais;
import web.hotchop.modelos.enums.Raiting;

import java.time.Year;

public class Pelicula implements Comparable<Pelicula>{
    private String titulo;
    private Genero genero;
    private Year lanzamiento;
    private Integer duracionMin;
    private Raiting clasificacion;
    private Pais siglasPais;
    private String descripcion;
    private Integer stock = 0;
    private Integer alquileresTotales = 0;

    public Pelicula(String titulo,Genero genero, Year lanzamiento, Integer duracionMin, Raiting clasificacion, Pais siglasPais,
                    String descripcion) {
        this.titulo = titulo;
        this.genero = genero;
        this.lanzamiento = lanzamiento;
        this.duracionMin = duracionMin;
        this.clasificacion = clasificacion;
        this.siglasPais = siglasPais;
        this.descripcion = descripcion;
        ++this.stock;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Year getLanzamiento() {
        return lanzamiento;
    }

    public void setLanzamiento(Year lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    public Integer getDuracionMin() {
        return duracionMin;
    }

    public void setDuracionMin(Integer duracionMin) {
        this.duracionMin = duracionMin;
    }

    public Raiting getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(Raiting clasificacion) {
        this.clasificacion = clasificacion;
    }

    public Pais getSiglasPais() {
        return siglasPais;
    }

    public void setSiglasPais(Pais siglasPais) {
        this.siglasPais = siglasPais;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getAlquileresTotales() {
        return alquileresTotales;
    }

    public void setAlquileresTotales(Integer alquileresTotales) {
        this.alquileresTotales = alquileresTotales;
    }
    public int compareTo(Pelicula otraPelicula) {
        return this.getAlquileresTotales() - otraPelicula.getAlquileresTotales();
    }

    @Override
    public String toString() {
        StringBuilder build = new StringBuilder();
        build.append("Pelicula: "+ titulo)
                .append("\n")
                .append("Genero: "+genero)
                .append("\n")
                .append("Estreno: "+lanzamiento)
                .append("\n")
                .append("Alquileres: "+alquileresTotales);
        return build.toString();
    }
}
