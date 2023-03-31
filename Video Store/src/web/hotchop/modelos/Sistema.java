package web.hotchop.modelos;

import javax.swing.*;
import java.time.Year;
import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    ArrayList<Pelicula> listadoPeliculas = new ArrayList<>();
    ArrayList<Cliente> listadoClientes = new ArrayList<>();
    ArrayList<Ticket> listadoAlquileres = new ArrayList<>();
    public void test(){
        for (int i = 0; i < 1; i++) {
            System.out.println("listadoPeliculas.size() = " + listadoPeliculas.size());
            cargaPelicula();
        }

    }
    public void menu(){
        boolean check = true;
        while(check == true){
            String opcion = JOptionPane.showInputDialog(null,"*****CUBEBUSTER STAFF MENU*****" +
                    "\n----------------------------"+"\nSeleccione una opcion del menu para continuar:"+"\n[A] Retiro Pelicula" +
                    "\n[B] Devolucion Pelicula" +
                    "\n[C] Alquileres Vigentes" +
                    "\n[D] Devoluciones actuales" +
                    "\n[E] Alquileres por Cliente" +
                    "\n[F] Peliculas Mas Alquiladas" +
                    "\n[G] Listado de Popularidad por Genero" +
                    "\n[H] Informacion de Pelicula" +
                    "\n[X] Exit");
            switch (opcion){
                case "A":retiro();
                    break;
                case "B":devolucion();
                    break;
                case "C":
                    break;
                case "D":
                    break;
                case "E":
                    break;
                case "F":
                    break;
                case "G":
                    break;
                case "H":
                    break;
                case "X": check = false;
                    break;
            }
        }
    }
    public Pelicula datosPelicula(String titulo){
        Scanner sr = new Scanner(System.in);
        System.out.println("Ingrese Genero de la Pelicula");
        String genero = sr.nextLine();
        System.out.println("Ingrese Estreno de la Pelicula (año-mes-dia)");
        Year year = Year.parse(sr.nextLine());
        System.out.println("Ingrese Duracion en Minutos de la Pelicula");
        Integer duracion = Integer.parseInt(sr.nextLine());
        System.out.println("Ingrese Clasificacion de la Pelicula");
        String clasificacion = sr.nextLine();
        System.out.println("Ingrese Siglas del Pais de la Pelicula");
        String siglas = sr.nextLine();
        System.out.println("Ingrese Descripcion de la Pelicula");
        String desc = sr.nextLine();
        Pelicula aux = new Pelicula(titulo,genero,year,duracion,clasificacion,siglas,desc);
        return aux;
    }
    public void cargaPelicula(){
        Scanner sr = new Scanner(System.in);
        System.out.println("Ingrese Titulo de la Pelicula");
        String titulo = sr.nextLine();
        Pelicula aux = buscaPelicula(titulo);
        if(aux == null){
            System.out.println("Nueva Pelicula");
            aux = datosPelicula(titulo);
            listadoPeliculas.add(aux);
        }
        else{
            System.out.println("Aumentando Stock");
            aux.setStock(aux.getStock()+1);
        }

    }
    public Pelicula buscaPelicula(String titulo){
        int i = 0;
        while((i < listadoPeliculas.size()) && (listadoPeliculas.get(i).getTitulo().compareTo(titulo) != 0)){
            i++;
        }
        if(i < listadoPeliculas.size()){
            return listadoPeliculas.get(i);
        }
        else{
            return null;
        }
    }
    public Cliente buscaCliente(String nombre){
        int i = 0;
        while(i < listadoClientes.size() && listadoClientes.get(i).getNombre().compareTo(nombre) != 0){
            i++;
        }
        if(i < listadoClientes.size()){
            return listadoClientes.get(i);
        }
        else{
            return null;
        }
    }
    public void retiro(){
        String titulo = JOptionPane.showInputDialog(null,"Ingrese titulo de la pelicula a retirar");
        Pelicula aux = buscaPelicula(titulo);
        if(aux != null){
            if(aux.getStock() > 0){
                String nombre = JOptionPane.showInputDialog(null,"Ingrese nombre del cliente");
                Cliente client = buscaCliente(nombre);
                if(client == null){
                    String tel = JOptionPane.showInputDialog(null,"Nuevo cliente.\nIngrese telefono");
                    Integer telNum = Integer.parseInt(tel);
                    String dir = JOptionPane.showInputDialog(null,"Ingrese direccion");
                    client = new Cliente(nombre,telNum,dir);
                    listadoClientes.add(client);
                }
                aux.setStock(aux.getStock()-1);
                aux.setAlquileresTotales(aux.getAlquileresTotales()+1);
                Ticket tk = new Ticket(client,aux);
                client.ultimosAlquileres(tk);
                listadoAlquileres.add(tk);
                JOptionPane.showConfirmDialog(null,tk.toString());
            }
            else{
                JOptionPane.showConfirmDialog(null,"La pelicula no se encuentra en stock");
            }
        }
        else{
            JOptionPane.showConfirmDialog(null,"Pelicula no encontrada");
        }

    }
    public void devolucion(){
        String titulo = JOptionPane.showInputDialog(null,"Ingrese nombre de pelicula devuelta");
        String nombre = JOptionPane.showInputDialog(null,"Ingrese nombre del cliente");
        int i = 0;
        while(i < listadoAlquileres.size() && (listadoAlquileres.get(i).getCliente().getNombre().compareTo(nombre) !=0 && listadoAlquileres.get(i).getPelicula().getTitulo().compareTo(titulo) != 0)){
            i++;
        }
        if(i < listadoAlquileres.size()){
            listadoAlquileres.get(i).getPelicula().setStock(listadoAlquileres.get(i).getPelicula().getStock()+1);
            listadoAlquileres.remove(i);
            JOptionPane.showMessageDialog(null,"Pelicula Devuelta con Exito");
        }
        else{
            JOptionPane.showMessageDialog(null,"No se encuentra un alquiler correspondiente");
        }
    }
}
