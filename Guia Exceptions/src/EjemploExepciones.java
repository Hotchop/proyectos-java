import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EjemploExepciones {
    public static int intentos = 0;

    public static int DevuelveNumero(int num) {
        try {
            if (num % 2 == 0) {
                throw new Exception("Numero Par");
            }
            return 1;
        } catch (Exception ex) {
            ex.getMessage().concat("Rompi todo y pase por Catch");
            return 2;
        } finally {
            return 3;
        }
    }

    public static void adivina(int solucion) {
        try {
            String rta = JOptionPane.showInputDialog(null,"Adivine numero (1-500)");
            int respuesta = Integer.parseInt(rta);
            ++intentos;
            if (respuesta == solucion) {
                JOptionPane.showMessageDialog(null,"Respuesta Correcta!\nNumero: "+solucion+"\nIntentos: "+intentos);
            } else {
                if (respuesta < solucion) {
                    JOptionPane.showMessageDialog(null,"El numero es mas grande que "+respuesta);
                } else {
                    JOptionPane.showMessageDialog(null,"El numero es mas chico que "+respuesta);
                }
                adivina(solucion);
            }
        } catch (InputMismatchException iarg) {
            JOptionPane.showMessageDialog(null,"Error: Debe ingresar un numero");
            ++intentos;
            adivina(solucion);
        }
    }
}