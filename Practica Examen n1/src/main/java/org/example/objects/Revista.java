package org.example.objects;

import org.example.exceptions.Error_Intercambio;
import org.example.interfaces.Intercambio;

import java.time.Year;

public class Revista extends Materiales implements Intercambio {
    private int edicion;
    private boolean subscripcion;
    private boolean prestado;

    public Revista(String titulo, String autor, Year añoPublicacion, int edicion, boolean subscripcion, boolean prestado) {
        super(titulo, autor, añoPublicacion);
        this.edicion = edicion;
        this.subscripcion = subscripcion;
        this.prestado = prestado;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public boolean isSubscripcion() {
        return subscripcion;
    }

    public void setSubscripcion(boolean subscripcion) {
        this.subscripcion = subscripcion;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public void prestar() {
        try{
            if(prestado == true){
                throw new Error_Intercambio("El libro ya esta prestado");
            }
            prestado = true;
            System.out.println("Libro prestado con exito");
        }
        catch (Error_Intercambio ei){
            System.out.println(ei.getMessage());
        }
    }

    @Override
    public void devolver() {
        try {
            if(prestado == false){
                throw new Error_Intercambio("El libro no a sido prestado");
            }
            prestado = false;
            System.out.println("Libro devuelto con exito");
        }catch (Error_Intercambio ei){
            System.out.println(ei.getMessage());
        }
    }
}
