package web.hotchop.models.punto1;

public class Circulo {
    private Double radio = 1.0d;
    private String color = "rojo";

    public Circulo() {
    }

    public Circulo(Double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", color='" + color + '\'' +
                '}';
    }

    public Double area(){
        return Math.PI*Math.pow(radio,2);
    }
}
