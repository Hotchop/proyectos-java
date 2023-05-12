package nicolasmiranda.punto2.objects;

public class Plataforma extends Objeto{
    private String material;

    public Plataforma(double alto, double ancho, double posicionX, double posicionY, String material) {
        super(alto, ancho, posicionX, posicionY);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
