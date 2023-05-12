package nicolasmiranda.punto2.objects;

import nicolasmiranda.punto2.interfaces.EnemigoInterface;

public class Enemigo extends Personaje implements EnemigoInterface {
    private double velocidad;

    public Enemigo(String nombre, String skin, int nivelEnergia, double posicionX, double posicionY, String armas, int vidas, int daño, double velocidad) {
        super(nombre, skin, nivelEnergia, posicionX, posicionY, armas, vidas, daño);
        this.velocidad = velocidad;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return super.toString()+"Enemigo{" +
                "velocidad=" + velocidad +
                '}';
    }

    @Override
    public void devorar() {
        System.out.println(super.getNombre()+" se devora al jugador");
    }

    @Override
    public void morder() {
        System.out.println(super.getNombre()+" muerde al jugador");
    }

    @Override
    public void rugir() {
        System.out.println(super.getNombre()+" ruge");
    }
}
