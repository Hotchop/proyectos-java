package nicolasmiranda.punto2.objects;

public class Muro extends Objeto{
    private double resistencia;

    public Muro(double alto, double ancho, double posicionX, double posicionY, double resistencia) {
        super(alto, ancho, posicionX, posicionY);
        this.resistencia = resistencia;
    }

    public double getResistencia() {
        return resistencia;
    }

    public void setResistencia(double resistencia) {
        this.resistencia = resistencia;
    }

    @Override
    public String toString() {
        return "Muro{" +
                "resistencia=" + resistencia +
                '}';
    }

    @Override  ///Overrides agregador para que la posicion de las paredes no pueda ser alterada una vez creada
    public void setPosicionX(double posicionX) {
        System.out.println("Posicion del muro no puede ser alterada");
    }

    @Override
    public void setPosicionY(double posicionY) {
        System.out.println("Posicion del muro no puede ser alterada");
    }
}
