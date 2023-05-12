package nicolasmiranda.punto2.objects;

import nicolasmiranda.punto2.interfaces.PersonajeInterface;

public abstract class Personaje implements PersonajeInterface,Comparable<Personaje>{
    private String nombre;
    private String skin;
    private int nivelEnergia;
    private double posicionX;
    private double posicionY;
    private String armas;
    private int vidas;
    private int daño;

    public Personaje(String nombre, String skin, int nivelEnergia, double posicionX, double posicionY, String armas, int vidas, int daño) {
        this.nombre = nombre;
        this.skin = skin;
        this.nivelEnergia = nivelEnergia;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.armas = armas;
        this.vidas = vidas;
        this.daño = daño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public int getNivelEnergia() {
        return nivelEnergia;
    }

    public void setNivelEnergia(int nivelEnergia) {
        this.nivelEnergia = nivelEnergia;
    }

    public void setPosicionX(double posicionX) {
        this.posicionX = posicionX;
    }

    public void setPosicionY(double posicionY) {
        this.posicionY = posicionY;
    }

    public String getArmas() {
        return armas;
    }

    public void setArmas(String armas) {
        this.armas = armas;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", skin='" + skin + '\'' +
                ", nivelEnergia=" + nivelEnergia +
                ", posicionX=" + posicionX +
                ", posicionY=" + posicionY +
                ", armas='" + armas + '\'' +
                ", vidas=" + vidas +
                ", daño=" + daño +
                '}';
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " esta atacando");
    }

    @Override
    public void morir() {
        System.out.println(nombre + " se muere");
    }

    @Override
    public void correr() {
        System.out.println(nombre + " corre");
    }

    @Override
    public void cargarEnergia() {
        System.out.println(nombre + " recarga su energia");
    }

    @Override
    public double getPositionX() {
        return posicionX;
    }

    @Override
    public double getPositionY() {
        return posicionY;
    }

    @Override
    public int compareTo(Personaje o) {
        if(this.getNombre() == null){
            return 0;
        }
        else{
            return this.getNombre().compareTo(o.getNombre());
        }
    }
}
