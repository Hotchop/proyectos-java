package nicolasmiranda.punto2.objects;

public abstract class Objeto {
    private double alto;
    private double ancho;
    private double posicionX;
    private double posicionY;

    public Objeto(double alto, double ancho, double posicionX, double posicionY) {
        this.alto = alto;
        this.ancho = ancho;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }

    @Override
    public String toString() {
        return "Objeto{" +
                "alto=" + alto +
                ", ancho=" + ancho +
                ", posicionX=" + posicionX +
                ", posicionY=" + posicionY +
                '}';
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(double posicionX) {
        this.posicionX = posicionX;
    }

    public double getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(double posicionY) {
        this.posicionY = posicionY;
    }
}
