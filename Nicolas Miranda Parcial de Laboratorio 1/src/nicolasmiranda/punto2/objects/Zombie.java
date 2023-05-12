package nicolasmiranda.punto2.objects;

import nicolasmiranda.punto2.interfaces.EnemigoInterface;

public class Zombie extends Enemigo{
    public Zombie(String nombre, String skin, int nivelEnergia, double posicionX, double posicionY, String armas, int vidas, int daño, double velocidad) {
        super(nombre, skin, nivelEnergia, posicionX, posicionY, armas, vidas, daño, velocidad);
    }

    @Override   ///Sobreescrita la funcion correr de Personajes para que el Zombie use supervelocidad
    public void correr() {
        System.out.println("El zombie"+super.getNombre()+" corre a super velocidad");
    }
}
