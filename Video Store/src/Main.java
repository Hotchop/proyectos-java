import web.hotchop.modelos.Cliente;
import web.hotchop.modelos.Pelicula;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pelicula> listadoPeliculas = new ArrayList<>();
        ArrayList<Cliente> listadoClientes = new ArrayList<>();
        cargaPelicula(listadoPeliculas);
        //Menu
        //Retiro de pelicula
        //Devolucion de pelicula
        //Ver alquileres vigentes
        //Devoluciones LocalDate
        //Ultimos alquileres clientes
        //Mas alquilados
        //Ordenar por genero y por popularidad
        //Ver detalles de pelicula

    }
    public static void menu(){

    }
    public static Pelicula datosPelicula(){
        Scanner sr = new Scanner(System.in);
        System.out.println("Ingrese Titulo de la Pelicula");
        String titulo = sr.nextLine();
        System.out.println("Ingrese Estreno de la Pelicula");
        LocalDate estreno = LocalDate.parse(sr.nextLine());
        System.out.println("Ingrese Duracion en Minutos de la Pelicula");
        Integer duracion = sr.nextInt();
        System.out.println("Ingrese Clasificacion de la Pelicula");
        String clasificacion = sr.nextLine();
        System.out.println("Ingrese Siglas del Pais de la Pelicula");
        String siglas = sr.nextLine();
        System.out.println("Ingrese Descripcion de la Pelicula");
        String desc = sr.nextLine();
        Pelicula aux = new Pelicula(titulo,estreno,duracion,clasificacion,siglas,desc);
        return aux;
    }
    public static void cargaPelicula(ArrayList<Pelicula> listadoPeliculas){
        Pelicula aux = datosPelicula();
        if(!listadoPeliculas.isEmpty()){
            int i = 0;
            while(listadoPeliculas.get(i).getTitulo() != aux.getTitulo() || i < listadoPeliculas.size()){
                i++;
            }
            if(i < listadoPeliculas.size()){
                listadoPeliculas.get(i).setStock(listadoPeliculas.get(i).getStock()+1);
            }
            else{
                listadoPeliculas.add(aux);
            }
        }
        else{
            listadoPeliculas.add(aux);
        }
    }
}