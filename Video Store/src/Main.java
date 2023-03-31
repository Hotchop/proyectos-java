import web.hotchop.modelos.Cliente;
import web.hotchop.modelos.Pelicula;

import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pelicula> listadoPeliculas = new ArrayList<>();
        ArrayList<Cliente> listadoClientes = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            cargaPelicula(listadoPeliculas);
        }
        menu();
    }
    public static void menu(){
        boolean check = true;
        Scanner sr = new Scanner(System.in);
        String opcion;
        while(check == true){
            System.out.println("*****CUBEBUSTER STAFF MENU*****" +
                             "\n-------------------------------");
            System.out.println("Seleccione una opcion del menu para continuar:");
            System.out.println("[A]Retiro Pelicula" +
                             "\n[B]Devolucion Pelicula" +
                             "\n[C]Alquileres Vigentes" +
                             "\n[D]Devoluciones actuales" +
                             "\n[E]Alquileres por Cliente" +
                             "\n[F]Peliculas Mas Alquiladas" +
                             "\n[G]Listado de Popularidad por Genero" +
                             "\n[H]Informacion de Pelicula" +
                             "\n[X]Exit");
            switch (opcion = sr.nextLine()){
                case "A":
                    break;
                case "B":
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
    public static Pelicula datosPelicula(){
        Scanner sr = new Scanner(System.in);
        System.out.println("Ingrese Titulo de la Pelicula");
        String titulo = sr.nextLine();
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
    public static void cargaPelicula(ArrayList<Pelicula> listadoPeliculas){
        Pelicula aux = datosPelicula();
        if(!listadoPeliculas.isEmpty()){
            int i = 0;
            while(i<listadoPeliculas.size() && listadoPeliculas.get(i).getTitulo() != aux.getTitulo()){
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