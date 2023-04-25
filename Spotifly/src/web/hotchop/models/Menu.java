package web.hotchop.models;

import web.hotchop.models.enums.Genero;

import java.time.Year;
import java.util.Scanner;

public class Menu {
    public void launch(){
        Scanner sr = new Scanner(System.in);
        System.out.println("Desea un plan Premium? [Y/N]");
        String input = sr.nextLine();
        if(input == "Y"){
            premiumMenu();
        }
        else{
            basicMenu();
        }
    }
    public void basicMenu(){
        Scanner sr = new Scanner(System.in);
        System.out.println("Ingrese nombre de su lista");
        ListaBasica lista = new ListaBasica(sr.nextLine());
        boolean status = true;
        while(status == true){
            System.out.println("\n*** Spotifly / Plan Basico ***\n" +
                                "Seleccione una opcion:\n" +
                                "[A] Agregar Cancion\n" +
                                "[B] Reproducir Lista\n" +
                                "[C] Cambiar Cancion\n" +
                                "[D] Eliminar Cancion\n" +
                                "[E] Ver Lista\n"+
                                "[X] Salir");
            String choise = sr.nextLine();
            choise.toUpperCase();
            switch (choise){
                case "A": lista.agregarCancion(nuevaCancion());
                    break;
                case "B": lista.reproducir();
                    break;
                case "C": lista.cambiarCancion();
                    break;
                case "D": lista.eliminarCancion();
                    break;
                case "E": lista.verMiLista();
                    break;
                case "X": status = false;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }

    public void premiumMenu(){

    }

    public Cancion nuevaCancion(){
        Scanner sr = new Scanner(System.in);
        System.out.println("Ingrese nombre de artista, edad y nacionalidad");
        String nomArt = sr.nextLine();
        int edad = sr.nextInt();
        sr.nextLine();
        String nacio = sr.nextLine();
        Artista artista = new Artista(nomArt,edad,nacio);
        System.out.println("Ingrese anio de publicacion y nombre del album");
        Year anio = Year.parse(sr.nextLine());
        String nomAlb = sr.nextLine();
        Album album = new Album(anio,nomAlb,artista);
        System.out.println("Ingrese nombre, duracion, genero de la cancion");
        String nombre = sr.nextLine();
        int duracion = sr.nextInt();
        sr.nextLine();
        Genero genero = Genero.valueOf(sr.nextLine());
        Cancion song = new Cancion(nombre,duracion,genero,album);
        return song;
    }
}

