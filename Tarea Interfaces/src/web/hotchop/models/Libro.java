package web.hotchop.models;

import web.hotchop.models.interfaces.ILibro;
import web.hotchop.models.tda.Producto;

import java.util.Date;

public class Libro extends Producto implements ILibro {
    private Date fechaPublicacion;
    private String autor;
    private String titulo;
    private String editorial;

    public Libro(Integer precio, Date fechaPublicacion, String autor, String titulo, String editorial) {
        super(precio);
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
    }

    @Override
    public double getPrecioVenta() {
        return super.getPrecio();
    }

    @Override
    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    @Override
    public String getAutor() {
        return autor;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String getEditorial() {
        return editorial;
    }

    @Override
    public String toString() {
        StringBuilder build = new StringBuilder();
        build.append("Libro -> ")
                .append("Precio: "+getPrecioVenta())
                .append("/ Fecha: "+getFechaPublicacion())
                .append("/ Autor: "+getAutor())
                .append("/ Titulo: "+getTitulo())
                .append("/ Editorial: "+getEditorial());
        return build.toString();
    }
}
