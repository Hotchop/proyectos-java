package web.hotchop.models;

import web.hotchop.models.interfaces.Reproduccion;

import java.util.LinkedList;
import java.util.Stack;

public class ListaPremium implements Reproduccion {
    private String nombre;
    private LinkedList<Cancion> miLista = new LinkedList<>();

    @Override
    public void reproducir() {

    }

    @Override
    public void agregarCancion(Cancion nueva) {

    }

    @Override
    public void verMiLista() {

    }

    @Override
    public void cambiarCancion() {

    }

    @Override
    public void eliminarCancion() {

    }
}
