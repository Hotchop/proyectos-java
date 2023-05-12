package nicolasmiranda.punto2.objects;

import nicolasmiranda.punto2.interfaces.Defensa;
import nicolasmiranda.punto2.interfaces.PlayerInterface;

public class Player extends Personaje implements Defensa,PlayerInterface {
    private double escudo;
    private final double velocidad = 10;

    public Player(String nombre, String skin, int nivelEnergia, double posicionX, double posicionY, String armas, int vidas, int daño,double escudo) {
        super(nombre, skin, nivelEnergia, posicionX, posicionY, armas, vidas, daño);
        this.escudo = escudo;
    }

    public double getEscudo() {
        return escudo;
    }

    public void setEscudo(double escudo) {
        this.escudo = escudo;
    }

    public double getVelocidad() {
        return velocidad;
    }

    @Override
    public String toString() {
        return super.toString()+"Player{" +
                "escudo=" + escudo +
                ", velocidad=" + velocidad +
                '}';
    }

    @Override
    public void defenderse() {
        System.out.println("El jugador "+super.getNombre()+" se defiende con su escudo");
    }

    @Override
    public void invisibilidad() {
        System.out.println("El jugador "+super.getNombre()+" se vuelve invisible");
    }

    @Override
    public void salto() {
        System.out.println("El jugador "+super.getNombre()+" salta");
    }
}
