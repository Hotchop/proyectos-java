package org.example.objects;

import com.sun.source.doctree.SystemPropertyTree;

import java.util.ArrayList;
import java.util.Collection;

public class PreguntaMultipleChoise extends Pregunta{
    private Collection<String> listaOpciones;

    //Lanza un aviso si no hay listado de preguntas para que pueda ser corregido
    public PreguntaMultipleChoise(String enunciado, String respuestaCorrecta, Collection<String> listaOpciones) {
        super(enunciado, respuestaCorrecta);
        try{
            if(listaOpciones == null){
                throw new RuntimeException("Cuidado! La lista ingresada es nula. Agregando respuesta generica");
            }
            if(listaOpciones.isEmpty()){
                throw new RuntimeException("Cuidado! La lista ingresada no tiene datos. Agregando respuesta generica");
            }
        }catch (RuntimeException runtimeException){
            System.out.println(runtimeException.getMessage());
            ArrayList<String> generica = new ArrayList<>();
            generica.add("Adivine!");
            listaOpciones = generica;
        }finally {
            this.listaOpciones = listaOpciones;
        }
    }

    public Collection<String> getListaOpciones() {
        return listaOpciones;
    }

    public void setListaOpciones(Collection<String> listaOpciones) {
        this.listaOpciones = listaOpciones;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getEnunciado());
        stringBuilder.append(" -> ");
        for (String string:
             listaOpciones) {
            stringBuilder.append(string);
            stringBuilder.append(" / ");
        }
        return stringBuilder.toString();
    }

    @Override
    public boolean verificarRespuesta(String respuesta) {
        if(respuesta.compareTo(getRespuestaCorrecta()) == 0){
            return true;
        }else {
            return false;
        }
    }
}
