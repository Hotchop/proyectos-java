import net.hotchop.modelo.Persona;

import javax.swing.*;
import java.util.Scanner;

public class MainPrincipal {

    public static void main(String[] args) {

        /*Scanner sr = new Scanner(System.in);

        System.out.println("Ingrese el nombre...");
        String nombre = sr.nextLine();
        System.out.println("Ingrese el apellido...");
        String apellido = sr.nextLine();
        System.out.println("Ingrese el DNI...");
        Integer dni = sr.nextInt();*/

        /**Metodo Input mediante ventanas emergentes**/
        String nombre = JOptionPane.showInputDialog(null,"Ingrese nombre");
        String apellido = JOptionPane.showInputDialog(null,"Ingrese apellido");
        String dniStr= JOptionPane.showInputDialog(null,"Ingrese dni");
        Integer dni = Integer.parseInt(dniStr);

        Persona maria = new Persona(nombre,apellido,dni);
        System.out.println("Persona = " + maria.toString());
        maria.setNombre("Ana");
        System.out.println("Persona = " + maria.toString());

        Persona carla = new Persona("Carla","Morales",23123456);
        System.out.println("Persona = " + carla.toString());

        JOptionPane.showConfirmDialog(null,maria.toString());

    }
}
