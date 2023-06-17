package org.example.objects;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Juego {
    private HashMap<Integer,Pregunta> listaPreguntas;
    private Puntaje puntaje;

    public Juego() {
        this.listaPreguntas = new HashMap<Integer,Pregunta>();
        this.puntaje = new Puntaje();
    }


    //Carga un conjunto de preguntas al Map del juego
    public void cargaPreguntas(){
        ArrayList<String> lista1 = new ArrayList<>();
        lista1.add("3");
        lista1.add("7");
        lista1.add("8");
        ArrayList<String> lista2 = new ArrayList<>();
        lista2.add("Negro");
        lista2.add("Blanco");
        lista2.add("Marron");
        ArrayList<String> lista3 = new ArrayList<>();
        PreguntaMultipleChoise preg1 = new PreguntaMultipleChoise("Cuanto es 1 + 7 - 5 ?","3",lista1);
        PreguntaVerdaderoFalso preg2 = new PreguntaVerdaderoFalso("Java es mucho mas facil que C","Verdadero");
        PreguntaMultipleChoise preg3 = new PreguntaMultipleChoise("Si vas norte, este, sur, oeste y norte, quedando en el mismo lugar, de que color es el oso que ves?","Blanco",lista2);
        PreguntaVerdaderoFalso preg4 = new PreguntaVerdaderoFalso("Pluton es un planeta","Falso");
        PreguntaMultipleChoise preg5 = new PreguntaMultipleChoise("Esta pregunta es injusta","Pistacho",lista3);

        listaPreguntas.put(1,preg1);
        listaPreguntas.put(2,preg2);
        listaPreguntas.put(3,preg3);
        listaPreguntas.put(4,preg4);
        listaPreguntas.put(5,preg5);
    }

    //Inicia el juego y ejecuta los metodos en orden
    public void inicaJuego(){
        String respuesta;
        Scanner scanner = new Scanner(System.in);
        cargaPreguntas();
        ArrayList<Pregunta> valores = new ArrayList<Pregunta>();
        valores.addAll(listaPreguntas.values());
        for (Pregunta pregunta:
             valores) {
            muestraPregunta(pregunta);
            respuesta = scanner.nextLine();
            contador(verifica(pregunta,respuesta));
        }
        guardaresultado();
        muestraResultado();
    }

    //Muestra la siguiente pregunta por pantalla
    public void muestraPregunta(Pregunta pregunta){
        System.out.println(pregunta.toString());
    }

    //Envia un mensaje despues de verificar si la respuesta es incorrecta o incorrecta
    public boolean verifica(Pregunta pregunta,String respuesta){
        if(pregunta.verificarRespuesta(respuesta) == true){
            System.out.println("Respuesta Correcta!");
            return true;
        }else{
            System.out.println("Respuesta Incorrecta!");
            return false;
        }
    }

    //Cuenta los aciertos y errores del jugador
    public void contador(Boolean resultado){
        if(resultado){
            puntaje.setAciertos(1);
        }else{
            puntaje.setErrores(1);
        }
    }

    //Guarda el ultimo resultado en el archivo
    public void guardaresultado(){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            Puntaje[] puntajeArray = objectMapper.readValue(new File("src/main/resources/archivo.json"),Puntaje[].class);
            ArrayList<Puntaje> puntajes = new ArrayList<>();
            puntajes.addAll(Arrays.asList(puntajeArray));
            puntajes.add(puntaje);
            String jsonactualizado = objectMapper.writeValueAsString(puntajes);

            FileWriter fileWriter = new FileWriter("src/main/resources/archivo.json");
            fileWriter.write(jsonactualizado);
            fileWriter.close();

        }catch (IOException ioException){
            ioException.printStackTrace();
        }
    }

    //Muestra Resultados desde el archivo
    public void muestraResultado(){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            Puntaje[] puntajeArray = objectMapper.readValue(new File("src/main/resources/archivo.json"),Puntaje[].class);

            for (Puntaje puntaje:
                 puntajeArray) {
                System.out.println(puntaje.toString());
                System.out.println("------------------");
            }

        }catch (IOException ioException){
            ioException.printStackTrace();
        }
    }

}
