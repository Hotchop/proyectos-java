package web.hotchop.models.punto1;

public class Cilindro extends Circulo{
    private Double altura = 1.0d;

    public Cilindro() {
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

    @Override
    public String toString() {
        return "Cilindro:\nRadio:"+getRadio()+
                "\nAltura:"+altura+
                "\nArea:"+area()+
                "\nVolumen:"+volumen();
    }

    public Double volumen(){
        return area()*altura;
    }
}
