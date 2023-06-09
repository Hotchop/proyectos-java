package web.hotchop.modelos;

import java.util.UUID;

public class Cliente {
    private UUID id;
    private String nombre;
    private String email;
    private Float descuento;

    public Cliente(UUID id, String nombre, String email, Float descuento) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.descuento = descuento;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Float getDescuento() {
        return descuento;
    }

    public void setDescuento(Float descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Cliente[id="+id+
                ", nombre="+nombre+
                ", email="+email+
                ", descuento="+ descuento+
                "]";
    }
}
