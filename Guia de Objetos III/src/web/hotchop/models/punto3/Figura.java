package web.hotchop.models.punto3;

import javax.swing.*;
import java.text.DecimalFormat;

public class Figura {
    private String color;
    private Boolean coloreado;

    public Figura(String color, Boolean coloreado) {
        this.color = color;
        this.coloreado = coloreado;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getColoreado() {
        return coloreado;
    }

    public void setColoreado(Boolean coloreado) {
        this.coloreado = coloreado;
    }

    @Override
    public String toString() {
        return "Figura{" +
                "color='" + color + '\'' +
                ", coloreado=" + coloreado +
                '}';
    }
}
