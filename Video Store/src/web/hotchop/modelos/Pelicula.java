package web.hotchop.modelos;

import java.time.LocalDate;

public class Pelicula {
    private String titulo;
    private LocalDate lanzamiento;
    private Integer duracionMin;
    private String clasificacion;
    private String siglasPais;
    private String descripcion;
    private Integer stock = 0;
    private Integer alquileresTotales = 0;

    public Pelicula(String titulo, LocalDate lanzamiento, Integer duracionMin, String clasificacion, String siglasPais,
                    String descripcion) {
        this.titulo = titulo;
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

    public LocalDate getLanzamiento() {
        return lanzamiento;
    }

    public void setLanzamiento(LocalDate lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    public Integer getDuracionMin() {
        return duracionMin;
    }

    public void setDuracionMin(Integer duracionMin) {
        this.duracionMin = duracionMin;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getSiglasPais() {
        return siglasPais;
    }

    public void setSiglasPais(String siglasPais) {
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
}
