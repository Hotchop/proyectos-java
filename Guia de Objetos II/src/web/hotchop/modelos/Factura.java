package web.hotchop.modelos;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public class Factura {
    private UUID id;
    private ArrayList<ItemVenta> carrito;
    private Float monto = 0f;
    private LocalDate fecha;
    private Cliente cliente;

    public Factura(UUID id, ArrayList<ItemVenta> carrito,LocalDate fecha, Cliente cliente) {
        this.id = id;
        this.carrito = carrito;
        this.fecha = fecha;
        this.cliente = cliente;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public ArrayList<ItemVenta> getCarrito() {
        return carrito;
    }

    public void setCarrito(ArrayList<ItemVenta> carrito) {
        this.carrito = carrito;
    }

    public Float getMonto() {
        return monto;
    }

    public void setMonto(Float monto) {
        this.monto = monto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Factura[id="+id+
                ", fecha="+fecha+
                ", monto="+monto+
                ", montoDesc"+montoFinal()+
                ", "+cliente.toString()+
                "]";
    }
    public void montoTotal(ArrayList<ItemVenta> carrito){
        for (ItemVenta i:carrito) {
            monto += i.getPrecio();
        }
    }

    public Float montoFinal(){
        return monto -= monto*cliente.getDescuento()/100;
    }

    public String montos(){
        return "Monto Total:"+monto+"\nMonto Final:"+montoFinal();
    }


}
