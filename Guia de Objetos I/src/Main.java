import guia1.modelos.*;

import javax.swing.*;
import java.awt.datatransfer.FlavorEvent;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        /**Punto 1**/
        /*String anchoS = JOptionPane.showInputDialog(null,"Ingrese ancho");
        String altoS = JOptionPane.showInputDialog(null,"Ingrese alto");
        Float ancho = Float.parseFloat(anchoS);
        Float alto = Float.parseFloat(altoS);

        Rectangulo rec1 = new Rectangulo(ancho,alto);
        JOptionPane.showConfirmDialog(null,rec1.toString());

        JOptionPane.showConfirmDialog(null,rec1.areaPerim());

        anchoS = JOptionPane.showInputDialog(null,"Edite ancho");
        altoS = JOptionPane.showInputDialog(null,"Edite alto");
        rec1.setAncho(Float.parseFloat(anchoS));
        rec1.setAlto(Float.parseFloat(altoS));
        JOptionPane.showConfirmDialog(null,rec1.toString());

        JOptionPane.showConfirmDialog(null,rec1.areaPerim());

        Rectangulo recPrueba = new Rectangulo();
        JOptionPane.showConfirmDialog(null,"Verificacion por defecto - " + recPrueba.toString());*/

        /**Punto 2**/
        /*Empleado carlos = new Empleado("Carlos","Gutierrez",23456345,25000f);
        Empleado ana = new Empleado("Ana","Sanchez",34234123,27500f);
        System.out.println(carlos.toString());
        System.out.println(ana.toString());

        Scanner sr = new Scanner(System.in);
        System.out.println("Ingrese porcentaje de cambio de salario");
        carlos.modSalario(sr.nextFloat());
        System.out.println("Salario anual de " + carlos.getNombre() + " " + carlos.getApellido() + " = " + carlos.salAnual());*/

        /**Punto 3**/
        /*ItemVenta poroto = new ItemVenta("FX234","Lata de Porotos",345,200f);
        System.out.println(poroto.toString());*/

        /**Punto 4**/
        /*CuentaBancaria nico = new CuentaBancaria(UUID.randomUUID(),"Nicolas Miranda",15000d);
        Scanner sr = new Scanner(System.in);
        System.out.println("Ingrese monto a acreditar");
        System.out.println("Monto total = " + nico.credito(sr.nextDouble()));
        System.out.println("Ingrese monto a debitar");
        System.out.println("Monto total = " + nico.debito(sr.nextDouble()));
        System.out.println("Ingrese monto a debitar");
        System.out.println("Monto total = " + nico.debito(sr.nextDouble()));
        System.out.println("Balance de la cuenta = " + nico.toString());*/

        /**Punto 5**/
        /*Hora reloj = new Hora(23,59,58);
        reloj.avanza();
        reloj.avanza();
        reloj.avanza();
        reloj.retraza();
        reloj.retraza();
        reloj.retraza();
        reloj.retraza();*/

    }//fin metodo main
}//fin clase main