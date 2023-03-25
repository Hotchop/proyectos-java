package guia1.modelos;

public class Rectangulo {

    private Float ancho = 1.0f;
    private Float alto = 1.0f;

    public Rectangulo (){}

    public Rectangulo(Float ancho, Float alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public void setAncho(Float ancho) {
        this.ancho = ancho;
    }

    public void setAlto(Float alto) {
        this.alto = alto;
    }

    public Float getAncho() {
        return ancho;
    }

    public Float getAlto() {
        return alto;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                '}';
    }

    public Float area(){
        return ancho*alto;
    }

    public Float perimetro(){
        return ancho*2+alto*2;
    }


    public String areaPerim() {
        return "Rectangulo{" +
                "area=" + area() +
                ", perimetro=" + perimetro() +
                '}';
    }
}
