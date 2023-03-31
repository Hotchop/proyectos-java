package web.hotchop.modelos;

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
        this.devolucion =LocalDate.EPOCH.plusWeeks(1);
    }
}
