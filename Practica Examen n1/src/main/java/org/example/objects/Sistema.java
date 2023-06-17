package org.example.objects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Sistema <T>{
    private Collection<T> biblioteca;
    public Sistema() {
        this.biblioteca = new ArrayList<T>();
    }

    public Collection<T> getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Collection<T> biblioteca) {
        this.biblioteca = biblioteca;
    }

    public void agregar(T material){
        biblioteca.add(material);
    }
    public boolean buscar(T material){
        return (biblioteca.contains(material));
    }
    public void eliminar(T material){
        try {
            if(buscar(material)){
                biblioteca.remove(material);
                System.out.println("Libro eliminado con exito");
            }else{
                throw new RuntimeException("Libro no encontrado");
            }
        }catch (RuntimeException re){
            System.out.println(re.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Sistema{" +
                "biblioteca=" + biblioteca +
                '}';
    }
}
