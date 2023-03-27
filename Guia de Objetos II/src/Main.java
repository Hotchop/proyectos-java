import web.hotchop.modelos.*;
import web.hotchop.modelos.banco.Cliente;
import web.hotchop.modelos.banco.Cuenta;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        /**Punto 1**/
        /*Autor joshua = new Autor("Joshua","Bloch","joshua@email.com",'M');
        Autor ana = new Autor("Ana","Klee","ana@email.com",'F');
        Libro java = new Libro("Effective Java",450f,150,joshua,ana);
        System.out.println(java);
        java.setPrecio(500f);
        java.setStock(java.getStock()+50);
        System.out.println(java);
        System.out.println(java.getAutor1());
        System.out.println(java.getAutor2());
        System.out.println(java.mensaje());*/

        /**Punto 2**/
        /*Cliente nico = new Cliente(UUID.randomUUID(),"Nicolas Miranda","mirandanic1996@gmail.com",20f);
        System.out.println(nico.toString());
        ArrayList<ItemVenta> carrito = new ArrayList<>();
        carrito.add(new ItemVenta(UUID.randomUUID(),"Hollow Knight","Metroidvania",1600f));
        carrito.add(new ItemVenta(UUID.randomUUID(),"Nier Replicant","Action RPG",3000f));
        carrito.add(new ItemVenta(UUID.randomUUID(),"Subnautica","Adventure",1600f));
        carrito.add(new ItemVenta(UUID.randomUUID(),"Slay the Spire","Deckbuilding",800f));
        Factura fac1 = new Factura(UUID.randomUUID(),carrito,LocalDate.now(),nico);
        fac1.montoTotal(carrito);
        System.out.println(fac1.montos());
        System.out.println(fac1.toString());*/

        /**Punto 3**/
        Cliente nico = new Cliente(UUID.randomUUID(),"Nicolas Miranda","M");
        System.out.println(nico.toString());
        Cuenta cuenta1 = new Cuenta(UUID.randomUUID(),10000d,nico);
        Scanner sr = new Scanner(System.in);
        cuenta1.deposito(sr.nextDouble());
        cuenta1.deposito(sr.nextDouble());
        cuenta1.deposito(sr.nextDouble());
        cuenta1.deposito(sr.nextDouble());
        cuenta1.deposito(sr.nextDouble());
        cuenta1.deposito(sr.nextDouble());
        cuenta1.extraccion(sr.nextDouble());
        cuenta1.extraccion(sr.nextDouble());
        cuenta1.extraccion(sr.nextDouble());
        cuenta1.extraccion(sr.nextDouble());
        cuenta1.extraccion(sr.nextDouble());
        cuenta1.extraccion(sr.nextDouble());
        cuenta1.extraccion(sr.nextDouble());
        cuenta1.extraccion(sr.nextDouble());
        cuenta1.printReg();
        System.out.println(cuenta1.toString());
    }
}