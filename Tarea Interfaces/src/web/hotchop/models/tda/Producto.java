package web.hotchop.models.tda;

import web.hotchop.models.interfaces.IProducto;

public abstract class Producto implements IProducto {
    private int precio;

    public Producto(Integer precio) {
        this.precio = precio;
    }

    @Override
    public int getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "precio=" + precio +
                '}';
    }
}
