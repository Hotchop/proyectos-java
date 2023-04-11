package web.hotchop.models;

import web.hotchop.models.interfaces.IProducto;
import web.hotchop.models.tda.Electronico;


public class IPhone extends Electronico{
    private String color;
    private String modelo;

    public IPhone(Integer precio, String fabricante, String color, String modelo) {
        super(precio, fabricante);
        this.color = color;
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public double getPrecioVenta() {
        return super.getPrecio();
    }

    @Override
    public String toString() {
        StringBuilder build = new StringBuilder();
        build.append("IPhone -> ")
                .append("Precio: "+getPrecioVenta())
                .append("/ Fabricante: "+getFabricante())
                .append("/ Color: "+color)
                .append("/ Modelo: "+modelo);
        return build.toString();
    }
}
