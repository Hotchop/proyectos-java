package web.hotchop.models;

import web.hotchop.models.interfaces.Reproduccion;

import javax.swing.*;
import java.util.Stack;

public class ListaBasica implements Reproduccion {
    private String nombre;
    private Stack miLista;

    @Override
    public String reproducir() {
        return null;
    }

    @Override
    public void agregarCancion() {

    }

    @Override
    public void verMiLista() {

    }

    @Override
    public void eliminarCancion() {
        JOptionPane.showMessageDialog(null,"Para acceder a esta opcion, compre el paquete PREMIUM");
    }

    @Override
    public void cambiarCancion() {
        JOptionPane.showMessageDialog(null,"Para acceder a esta opcion, compre el paquete PREMIUM");
    }
}
