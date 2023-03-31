package web.hotchop.models.punto1;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Cilindro extends Circulo{
    private Double altura;
    private DecimalFormat dFormat = new DecimalFormat("#.00");


    public Cilindro() {
        this.altura = 1.0d;
    }

    public Cilindro(Double radio, String color, Double altura) {
        super(radio, color);
        this.altura = altura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    /*@Override
    public String toString() {
        return "Cilindro:\nRadio:"+getRadio()+
                "\nAltura:"+altura+
                "\nArea:"+area()+
                "\nVolumen:"+volumen();
    }*/

    @Override
    public String toString() {
        return "Cilindro: subclase de "+super.toString()+
                " altura= "+altura+
                " area cil=" +dFormat.format(area())+ " volumen="+dFormat.format(volumen());
    }
    @Override
    public Double area(){
        return (2*Math.PI*altura + 2*super.area());
    }
    public Double volumen(){
        return super.area()*altura;
    }
}
