package web.hotchop.models.punto3;

import java.text.DecimalFormat;

public class Cuadrado extends Rectangulo{
    private DecimalFormat decimalFormat = new DecimalFormat("#.00");
    public Cuadrado(String color, Boolean coloreado, Double lado) {
        super(color, coloreado, lado, lado);
    }

    @Override
    public String toString() {
        return "Cuadrado{" + super.toString()+
                "lado=" + super.getBase() +
                ", area=" + decimalFormat.format(super.area()) +
                ", perimetro=" + decimalFormat.format(super.perimetro()) +
                '}';
    }
}
