package web.hotchop.models;

import web.hotchop.models.tda.Electronico;

public class TvLcd extends Electronico {
    private int pulgadas;

    public TvLcd(Integer precio, String fabricante, Integer pulgadas) {
        super(precio, fabricante);
        this.pulgadas = pulgadas;
    }

    public Integer getPulgadas() {
        return pulgadas;
    }

    @Override
    public double getPrecioVenta() {
        return super.getPrecio();
    }

    @Override
    public String toString() {
        StringBuilder build = new StringBuilder();
        build.append("TV LCD -> ")
                .append("Precio: "+getPrecioVenta())
                .append("/ Fabricante: "+getFabricante())
                .append("/ Pulgadas: "+pulgadas);
        return build.toString();
    }
}
