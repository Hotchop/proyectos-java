package org.example.objects;

import java.util.Scanner;

public class PreguntaVerdaderoFalso extends Pregunta{
    public PreguntaVerdaderoFalso(String enunciado, String respuestaCorrecta) {
        super(enunciado, respuestaCorrecta);
    }

    @Override
    public String toString() {
        return getEnunciado() + "  -  Verdadero o Falso ";
    }

    @Override
    public boolean verificarRespuesta(String respuesta) {   ///Verifica que la pregunta este bien escrita. Sino, da otro intento para ingresarla
        try{
            String respuestaU = respuesta.toUpperCase();
            String correctaU = getRespuestaCorrecta().toUpperCase();
            if((respuestaU.compareTo("VERDADERO") != 0) && (respuestaU.compareTo("FALSO") != 0)){
                System.out.println(respuesta);
                throw new RuntimeException("Debe escribir Verdadero o Falso. Intente de nuevo");
            }else{
                if(respuestaU.compareTo(correctaU) == 0){
                    return true;
                }else{
                    return false;
                }
            }
        }catch (RuntimeException runtimeException){
            System.out.println(runtimeException.getMessage());
            Scanner sr = new Scanner(System.in);
            respuesta = sr.nextLine();
            return verificarRespuesta(respuesta);
        }
    }
}
