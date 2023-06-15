package org.example.objects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Sistema <T>{
    private Collection<T> biblioteca;
    public Sistema() {
        this.biblioteca = new ArrayList<T>();
    }

    private void agregar(T material){
        biblioteca.add(material);
    }
    private <T extends Comparable> void buscar(T material){
        try {

        }catch (RuntimeException re){
            System.out.println(re.getMessage());
        }
    }
    private void eliminar(){

    }
}
