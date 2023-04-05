package web.hotchop.modelos;

import web.hotchop.modelos.enums.Genero;
import web.hotchop.modelos.enums.Pais;
import web.hotchop.modelos.enums.Raiting;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Year;
import java.util.*;

public class Sistema {
    ArrayList<Pelicula> listadoPeliculas = new ArrayList<>();
    ArrayList<Cliente> listadoClientes = new ArrayList<>();
    ArrayList<Ticket> listadoAlquileres = new ArrayList<>();
    public void cargadatos(){
        Pelicula pel1 = new Pelicula("Tron", Genero.Aventura,Year.of(1982),96, Raiting.PG, Pais.USA,
                "Un hacker es secuestrado en el mundo digital y obligado a participar en juegos de " +
                        "gladiadores donde la ayuda de un programa de seguridad heroico es su única oportunidad de escapar.");
        Pelicula pel2 = new Pelicula("Iron Man",Genero.Accion,Year.of(2008),126,Raiting.PG13,Pais.USA,
                "Tras de estar cautivo en una cueva afgana, el multimillonario ingeniero " +
                "Tony Stark crea una armadura única para luchar contra el mal.");
        Pelicula pel3 = new Pelicula("Star Wars",Genero.Aventura,Year.of(1997),121,Raiting.PG,Pais.USA,
                "Luke Skywalker une sus fuerzas con un caballero jedi, un piloto fanfarrón, un wookiee y dos droides para salvar a la " +
                        "galaxia de la estación espacial del Imperio, a la vez que intenta rescatar a la princesa Leia del malvado Darth Vader.");
        pel1.setStock(7);
        pel2.setStock(9);
        pel3.setStock(5);
        listadoPeliculas.add(pel1);
        listadoPeliculas.add(pel2);
        listadoPeliculas.add(pel3);
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
                case "C":vigentes();
                    break;
                case "D":venceHoy();
                    break;
                case "E":ultimosAlquileres();
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
                JOptionPane.showMessageDialog(null,"*****CUBEBUSTER*****\nFACTURA DE RETIRO\n"+tk.toString()+"\n\n***GRACIAS POR ALQUILAR CON NOSOTROS***");
            }
            else{
                JOptionPane.showMessageDialog(null,"La pelicula no se encuentra en stock");
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Pelicula no encontrada");
        }

    }
    public void devolucion(){
        String titulo = JOptionPane.showInputDialog(null,"Ingrese nombre de pelicula devuelta");
        String nombre = JOptionPane.showInputDialog(null,"Ingrese nombre del cliente");
        int i = 0;
        while(i < listadoAlquileres.size() && (listadoAlquileres.get(i).getCliente().getNombre().compareTo(nombre) !=0 || listadoAlquileres.get(i).getPelicula().getTitulo().compareTo(titulo) != 0)){
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
    public void vigentes(){     ///Emprolijar
        JOptionPane.showMessageDialog(null,listadoAlquileres.toString());
    }
    public void venceHoy(){
        if(!listadoAlquileres.isEmpty()){
            String text = "Lista de alquieres que vencen hoy: ";
            int i = 0;
            while(i < listadoAlquileres.size()){
                if(listadoAlquileres.get(i).getDevolucion() == LocalDate.now()){
                    text = String.join("\n",listadoAlquileres.get(i).toString());
                }
                i++;
            }
            JOptionPane.showMessageDialog(null,text);
        }
        else{
            JOptionPane.showMessageDialog(null,"No hay alquileres pendientes");
        }
    }
    public void ultimosAlquileres(){
        String nombre = JOptionPane.showInputDialog(null,"Ingrese nombre del cliente");
        Cliente aux = buscaCliente(nombre);
        if(aux != null){
            JOptionPane.showMessageDialog(null,aux.toString());
        }
        else{
            JOptionPane.showMessageDialog(null,"Cliente no Encontrado");
        }
    }
}
