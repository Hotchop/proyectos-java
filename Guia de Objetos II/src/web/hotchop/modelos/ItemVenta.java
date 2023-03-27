package web.hotchop.modelos;

import java.util.UUID;

public class ItemVenta {
    private UUID id;
    private String nombre;
    private String descrip;
    private Float precio;

    public ItemVenta(UUID id, String nombre, String descrip, Float precio) {
        this.id = id;
        this.nombre = nombre;
        this.descrip = descrip;
        this.precio = precio;
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

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Cliente[id="+id+
                ", nombre="+nombre+
                ", descripcion="+descrip+
                ", precio="+ precio+
                "]";
    }
}
