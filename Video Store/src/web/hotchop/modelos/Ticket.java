package web.hotchop.modelos;

import javax.swing.*;
import java.time.LocalDate;

public class Ticket {
    private Cliente cliente;
    private Pelicula pelicula;
    private LocalDate retiro;
    private LocalDate devolucion;

    public Ticket(Cliente cliente, Pelicula pelicula) {
        this.cliente = cliente;
        this.pelicula = pelicula;
        this.retiro = LocalDate.now();
        this.devolucion =LocalDate.now().plusWeeks(1);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public LocalDate getRetiro() {
        return retiro;
    }

    public void setRetiro(LocalDate retiro) {
        this.retiro = retiro;
    }

    public LocalDate getDevolucion() {
        return devolucion;
    }

    public void setDevolucion(LocalDate devolucion) {
        this.devolucion = devolucion;
    }


    @Override
    public String toString() {
        return cliente.getNombre()+"\n"+cliente.getTelefono()+"\n"+cliente.getDireccion()+"\n"+"Pelicula:"+pelicula.getTitulo()+
                "\nFecha de Retiro: "+retiro+"\nFecha de Devolucion: "+devolucion;
    }
}
