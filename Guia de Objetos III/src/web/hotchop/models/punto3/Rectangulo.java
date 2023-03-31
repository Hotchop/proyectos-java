package web.hotchop.models.punto3;

import java.text.DecimalFormat;

public class Rectangulo extends Figura{
    private Double base;
    private Double altura;
    private DecimalFormat format = new DecimalFormat("#.00");

    public Rectangulo(String color, Boolean coloreado, Double base, Double altura) {
        super(color, coloreado);
        this.base = base;
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + super.toString()+
                "base=" + base +
                ", altura=" + altura +
                ", area=" + format.format(area()) +
                ", perimetro=" + format.format(perimetro()) +
                '}';
    }
    public Double area(){
        return base * altura;
    }
    public Double perimetro(){
        return 2*base+2*altura;
    }
}
