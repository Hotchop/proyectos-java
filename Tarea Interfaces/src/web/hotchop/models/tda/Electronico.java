package web.hotchop.models.tda;

import web.hotchop.models.interfaces.IElectronico;

public abstract class Electronico extends Producto implements IElectronico {
    private String fabricante;

    public Electronico(Integer precio, String fabricante) {
        super(precio);
        this.fabricante = fabricante;
    }

    @Override
    public String getFabricante() {
        return fabricante;
    }

    @Override
    public String toString() {
        return "Electronico{" +
                "fabricante='" + fabricante + '\'' +
                '}';
    }
}
