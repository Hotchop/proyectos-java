package web.hotchop.models.punto3;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Circulo extends Figura{
    private Double radio;
    private DecimalFormat format = new DecimalFormat("#.00");

    public Circulo(String color, Boolean coloreado, Double radio) {
        super(color, coloreado);
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + super.toString()+ "radio=" + radio +", area=" + format.format(area()) +", perimetro=" + format.format(perimetro()) + '}';
    }

    public Double area(){
        return Math.PI*Math.pow(radio,2);
    }
    public Double perimetro(){
        return 2*Math.PI*radio;
    }
}
