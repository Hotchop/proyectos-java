package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Persona<String>> personaList = new ArrayList<>();

        Persona per1 = new Persona("Nico","26","ARG");
        Persona per2 = new Persona("Juan","30","ARG");
        Persona per3 = new Persona("James","23","USA");
        Persona per4 = new Persona("Timmy","10","GRM");
        Persona per5 = new Persona("Hu Tao","20","CHN");

        personaList.add(per1);
        personaList.add(per2);
        personaList.add(per3);
        personaList.add(per4);
        personaList.add(per5);

        String jsonPersonas = objectMapper.writeValueAsString(personaList);

        FileWriter fileWriter = new FileWriter("src/main/resources/personas.json");
        fileWriter.write(jsonPersonas);
        fileWriter.close();

        System.out.println("Archivo creado con exito");
        System.out.println("Testeando lectura de archivo");

        Persona<String>[] personasArray = objectMapper.readValue(new File("src/main/resources/personas.json"),Persona[].class);
        personaList.clear();
        personaList.addAll(Arrays.asList(personasArray));
        for (Persona persona:
             personaList) {
            System.out.println(persona);
        }
    }
}