package web.hotchop.modelos;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private Long telefono;
    private String direccion;
    private ArrayList<Ticket> listaAlquileres;

    public Cliente(String nombre, Long telefono, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.listaAlquileres = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Ticket> getListaAlquileres() {
        return listaAlquileres;
    }

    public void setListaAlquileres(ArrayList<Ticket> listaAlquileres) {
        this.listaAlquileres = listaAlquileres;
    }

    public void ultimosAlquileres(Ticket tk){
        if(listaAlquileres.size() == 10) {
            listaAlquileres.remove(0);
        }
        listaAlquileres.add(tk);
    }

    @Override
    public String toString() {
        String texto = new String("Lista de alquieres en orden de antiguedad:\n");
        for (int i = listaAlquileres.size()-1; i > -1 ; i--) {
            texto = String.join("\n",texto,"Pelicula: "+listaAlquileres.get(i).getPelicula().getTitulo()+" - Retiro: "+listaAlquileres.get(i).getRetiro());
        }
        return texto;
    }
}
