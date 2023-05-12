package nicolasmiranda.punto2.objects;

import nicolasmiranda.punto2.interfaces.Defensa;
import nicolasmiranda.punto2.interfaces.Vuelo;

public class Bestia extends Enemigo implements Vuelo, Defensa {
    public Bestia(String nombre, String skin, int nivelEnergia, double posicionX, double posicionY, String armas, int vidas, int daño, double velocidad) {
        super(nombre, skin, nivelEnergia, posicionX, posicionY, armas, vidas, daño, velocidad);
    }

    @Override
    public void vuelo() {
        System.out.println("La bestia "+super.getNombre()+" toma vuelo");
    }

    @Override
    public void defenderse() {
        System.out.println("La bestia"+super.getNombre()+" se recubre de armadura");
    }
}
