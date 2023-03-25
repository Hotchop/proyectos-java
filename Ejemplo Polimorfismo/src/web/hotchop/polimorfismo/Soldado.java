package web.hotchop.polimorfismo;

public class Soldado extends Persona{

    private String rango;

    private static Integer cantidadSoldados = 0;

    public static Integer getCantidadSoldados() {
        return cantidadSoldados;
    }

    public Integer id;

    public static void setCantidadSoldados(Integer cantidadSoldados) {
        Soldado.cantidadSoldados = cantidadSoldados;
    }

    public Soldado(String nombre, Integer dni, String rango) {
        super(nombre, dni);
        this.rango = rango;
        this.id = ++Soldado.cantidadSoldados;
        this.atacar();
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    @Override
    public String toString() {
        return super.toString()+"\n id =" + id + "rango= " + rango +'\n';
    }

    public void atacar(){
        if(cantidadSoldados>=4){
            System.out.println("Atacando...");
        }
        else{
            System.out.println("Insuficiente");
        }
    }
}
