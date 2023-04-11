package web.hotchop.models;

import java.util.Date;

public class Comics extends Libro{
    private String personaje;

    public Comics(Integer precio, Date fechaPublicacion, String autor, String titulo, String editorial, String personaje) {
        super(precio, fechaPublicacion, autor, titulo, editorial);
        this.personaje = personaje;
    }
    public String getPersonaje() {
        return personaje;
    }

    @Override
    public String toString() {
        StringBuilder build = new StringBuilder();
        build.append("Comics -> ")
                .append("Precio: "+getPrecioVenta())
                .append("/ Fecha: "+getFechaPublicacion())
                .append("/ Autor: "+getAutor())
                .append("/ Titulo: "+getTitulo())
                .append("/ Editorial: "+getEditorial())
                .append("/ Personaje: "+personaje);
        return build.toString();
    }
}
