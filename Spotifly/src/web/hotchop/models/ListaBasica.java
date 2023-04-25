package web.hotchop.models;

import web.hotchop.models.interfaces.Reproduccion;

import javax.swing.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class ListaBasica implements Reproduccion {
    private String nombre;
    private LinkedList<Cancion> miLista;

    public ListaBasica(String nombre) {
        this.nombre = nombre;
        this.miLista = new LinkedList<>();
    }

    @Override
    public void reproducir() {
        if (!miLista.isEmpty()) {
            System.out.println("Reproduciendo -> " + miLista.getFirst().toString());
            System.out.println("Presione 'p' para pausar");
            miLista.addLast(miLista.getFirst());
            miLista.removeFirst();
            Scanner sr = new Scanner(System.in);
            String input = sr.nextLine();
            while (input.compareTo("p") != 0) {
                System.out.println("Comando desconocido");
                input = sr.nextLine();
            }
            System.out.println("Cancion pausada");
        }
        else {
            System.out.println("Lista vacia");
        }
    }
    @Override
    public void agregarCancion(Cancion nueva) { ///Modificar para Linked List
        miLista.add(nueva);
    }

    @Override
    public void verMiLista() {      ///Modificar para Linked List
        if(miLista.isEmpty()){
            System.out.println("La lista esta vacia");
        }
        else{
            for (Cancion i:
                 miLista) {
                System.out.println(i.toString());
            }
        }
    }

    @Override
    public void eliminarCancion() {
        System.out.println("Para acceder a esta opcion, compre el paquete PREMIUM");
    }

    @Override
    public void cambiarCancion() {
        System.out.println("Para acceder a esta opcion, compre el paquete PREMIUM");
    }
}
