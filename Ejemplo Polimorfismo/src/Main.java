import web.hotchop.polimorfismo.Civil;
import web.hotchop.polimorfismo.Persona;
import web.hotchop.polimorfismo.Soldado;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Persona soldado1 = new Soldado("Juan",231243234,"soldado");
        Persona soldado2 = new Soldado("Maria",258991234,"capitan");
        Persona soldado3 = new Soldado("Ana",231203944,"general");
        Persona soldado4 = new Soldado("Gonzalo",231276165,"soldado");

        /*System.out.println("soldado1 = " + soldado1.toString());
        System.out.println("soldado2 = " + soldado2.toString());
        System.out.println("soldado3 = " + soldado3.toString());
        System.out.println("soldado4 = " + soldado4.toString());*/


        ArrayList<Persona> lista = new ArrayList<>();
        lista.add(soldado1);
        lista.add(soldado2);
        lista.add(soldado3);
        lista.add(soldado4);


        Civil civil1 = new Civil("Pepe",213234534,"administrativo");

        lista.add(civil1);

        System.out.println("lista = " + lista.toString());

    }
}