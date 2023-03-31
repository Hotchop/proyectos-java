package web.hotchop.modelos;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private Integer telefono;
    private String direccion;
    private ArrayList<Ticket> listaAlquileres;

    public Cliente(String nombre, Integer telefono, String direccion) {
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

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void ultimosAlquileres(Ticket tk){
        if(listaAlquileres.size() == 10) {
            listaAlquileres.remove(0);
        }
        listaAlquileres.add(tk);
    }
}
