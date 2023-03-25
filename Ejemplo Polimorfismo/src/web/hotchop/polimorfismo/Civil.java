package web.hotchop.polimorfismo;

public class Civil extends Persona{

    private String cargo;

    public Civil(String nombre, Integer dni, String cargo) {
        super(nombre, dni);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return super.toString() +"\n cargo= " + cargo +'\n';
    }
}
