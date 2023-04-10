package web.hotchop.modelos;

import web.hotchop.modelos.enums.Genero;
import web.hotchop.modelos.enums.Pais;
import web.hotchop.modelos.enums.Raiting;

import javax.swing.*;
import java.text.CollationElementIterator;
import java.time.LocalDate;
import java.time.Year;
import java.util.*;

public class Sistema{
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
        pel1.setStock(1);
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
                    "\nSeleccione una opcion del menu para continuar:"+"\n[A] Retiro Pelicula" +
                    "\n[B] Devolucion Pelicula" +
                    "\n[C] Alquileres Vigentes" +
                    "\n[D] Devoluciones por Fecha" +
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
                case "D":venceFecha();
                    break;
                case "E":ultimosAlquileres();
                    break;
                case "F":popularidad();
                    break;
                case "G":popularPorGenero();
                    break;
                case "H":muestraPelicula();
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
                    Long telNum = Long.parseLong(tel);
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
        StringBuilder build = new StringBuilder();
        build.append("Lista de alquileres activos\n");
        for (int i = 0; i < listadoAlquileres.size(); i++) {
            build.append(listadoAlquileres.get(i).toString())
                    .append("\n------------------------\n");
        }
        JOptionPane.showMessageDialog(null,build.toString());
    }
    public void venceFecha(){
        if(!listadoAlquileres.isEmpty()){
            String dateS = JOptionPane.showInputDialog(null,"Ingrese fecha (Formato: Año-Mes-Dia)");
            LocalDate date = LocalDate.parse(dateS);
            StringBuilder builder = new StringBuilder();
            builder.append("Lista de alquieres que vencen el "+dateS+": \n");
            int i = 0;
            while(i < listadoAlquileres.size()){
                if(listadoAlquileres.get(i).getDevolucion().isEqual(date)){
                    builder.append(listadoAlquileres.get(i).toString())
                            .append("\n------------------------\n");
                }
                i++;
            }
            JOptionPane.showMessageDialog(null,builder.toString());
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
    public void popularidad(){
        Collections.sort(listadoPeliculas,Collections.reverseOrder());
        StringBuilder build = new StringBuilder();
        build.append("Peliculas Más Populares:\n");
        for (int i = 0; i < listadoPeliculas.size(); i++) {
            build.append(listadoPeliculas.get(i).toString())
                    .append("\n------------------------\n");
        }
        JOptionPane.showMessageDialog(null,build.toString());
    }
    public void popularPorGenero(){
        Genero[] options = {Genero.Accion,Genero.Aventura,Genero.Comedia,Genero.Documental,Genero.Drama,Genero.Horror};
        int choise = JOptionPane.showOptionDialog(null,"Elija Genero\n","Haga Click en una Opcion",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,options,options[0]);
        ArrayList<Pelicula> listaGenero = new ArrayList<>();
        int i = 0;
        while(i < listadoPeliculas.size()){
            if(listadoPeliculas.get(i).getGenero().compareTo(options[choise]) == 0){
                listaGenero.add(listadoPeliculas.get(i));
            }
            i++;
        }
        Collections.sort(listaGenero,Collections.reverseOrder());
        StringBuilder build = new StringBuilder();
        build.append("Peliculas Más Populares del Genero "+options[choise]+":\n");
        for (i = 0; i < listaGenero.size(); i++) {
            build.append(listaGenero.get(i).toString())
                    .append("\n------------------------\n");
        }
        JOptionPane.showMessageDialog(null,build.toString());
    }
    public void muestraPelicula(){
        String titulo = JOptionPane.showInputDialog(null,"Ingrese nombre de la pelicula");
        Pelicula aux = buscaPelicula(titulo);
        if(aux != null){
            StringBuilder build = new StringBuilder();
            build.append("Pelicula: "+aux.getTitulo())
                    .append("\n")
                    .append("Genero: "+aux.getGenero())
                    .append("\n")
                    .append("Estreno: "+aux.getLanzamiento())
                    .append("\n")
                    .append("Duracion: "+aux.getDuracionMin()+" minutos")
                    .append("\n")
                    .append("Clasificacion: "+aux.getClasificacion())
                    .append("\n")
                    .append("Pais: "+aux.getSiglasPais())
                    .append("\n")
                    .append("Descripcion: "+aux.getDescripcion())
                    .append("\n")
                    .append("Stock: "+aux.getStock())
                    .append("\n")
                    .append("Alquieres Totales: "+aux.getAlquileresTotales());
            JOptionPane.showMessageDialog(null,build.toString());
        }
        else{
            JOptionPane.showMessageDialog(null,"Pelicula no encontrada");
        }
    }
}
