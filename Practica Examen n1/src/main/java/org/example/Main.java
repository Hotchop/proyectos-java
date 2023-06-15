package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.objects.Libro;
import org.example.objects.Materiales;
import org.example.objects.Revista;
import org.example.objects.Sistema;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        Sistema<Materiales> sistema = new Sistema<>();
        Libro lib1 = new Libro("Harry Potter","JK",1996,500,true,false);
        Libro lib2 = new Libro("Harry Potter 2","JK",1997,500,true,true);
        Libro lib3 = new Libro("Harry Potter 3","JK",1998,500,true,false);
        Revista rev1 = new Revista("Hola","Juan",2023,10,true,false);
        Revista rev2 = new Revista("Gente","Paula",2023,5,true,true);

        lib1.devolver();

        lib2.prestar();

        lib2.devolver();

        sistema.agregar(lib1);
        sistema.agregar(rev1);
        sistema.agregar(rev2);
        sistema.agregar(lib3);

        sistema.eliminar(lib2);

        sistema.agregar(lib2);

        try {
            String jsonString = objectMapper.writeValueAsString(sistema.getBiblioteca());
            FileWriter fileWriter = new FileWriter("src/main/resources/biblioteca.json");
            fileWriter.write(jsonString);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}