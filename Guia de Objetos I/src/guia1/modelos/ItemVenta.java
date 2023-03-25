package guia1.modelos;

public class ItemVenta {
    private String id;
    private String descripcion;
    private Integer cantidad;
    private Float precio;

    public ItemVenta(String id, String descripcion, Integer cantidad, Float precio) {
        this.id = id;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public Float precioTotal(){
        return precio*cantidad;
    }

    @Override
    public String toString() {
        return "ItemVenta[id=" + id +
                ", descripción=" + descripcion +
                ", cantidad=" + cantidad +
                ", pUnitario=" + precio +
                ", pTotal=" + precioTotal() +
                ']';
    }
}
