package org.example.objects;

import org.example.exceptions.Error_Intercambio;
import org.example.interfaces.Intercambio;

import java.time.Year;

public class Libro extends Materiales implements Intercambio {
    private int paginas;
    private boolean disponibilidad;
    private boolean prestado;

    public Libro(String titulo, String autor, Year añoPublicacion, int paginas, boolean disponibilidad, boolean prestado) {
        super(titulo, autor, añoPublicacion);
        this.paginas = paginas;
        this.disponibilidad = disponibilidad;
        this.prestado = prestado;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public void prestar() {
        try {
            if(disponibilidad == false){
               throw new Error_Intercambio("Libro no disponible");
            }
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
