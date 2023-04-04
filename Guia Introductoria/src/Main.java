import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        /**Punto 1**/
        /*Integer N = 10;
        Double A = 2.5d;
        Character C = 'N';
        System.out.println("N = " + N);
        System.out.println("A = " + A);
        System.out.println("C = " + C);
        System.out.println("N + A = " + (N + A));
        System.out.println("A - N = " + (A - N));
        Integer numChar = Character.getNumericValue(C);
        System.out.println("numChar = " + numChar);*/

        /** Uso del Scanner**/
        /*
        int num1 = 0, num2 = 0;
        int suma;

        Scanner sr = new Scanner(System.in);

        System.out.println("Ingrese numero 1");
        num1 = sr.nextInt();

        System.out.println("Ingrese numero 2");
        num2 = sr.nextInt();

        suma = num1 + num2;
        System.out.println("suma de los dos numeros = "7 + suma);*/

        /**Punto 2**/
        /*
        Integer x = 14;
        Integer y = 20;
        Double N = 3.2d;
        Double M = 4.5d;
        System.out.println("x = " + (x * N));
        System.out.println("M = " + (M - y) * x);
        */

        /**Punto 3**/
        /*int N = 5;
        N += 77;
        N -= 3;
        N *= 2;
        System.out.println("N = " + N);*/

        /**Punto 4**/   //Consular
        /*int A = 3, B = 2, C = 5, D = 1;
        int aux;
        aux = B
        B = C;
        C = A;
        A = D;
        D = aux;
        System.out.println("A + B + C + D = " + A + B + C + D);*/

        /**Punto 5 y 6**/
        /*int A = 5;
        System.out.println((A%2==0) ? "Es par":"Es impar");
        System.out.println((A >= 0) ? "Es positivo":"Es negativo");*/

        /**Punto 7**/
        /*int A = 0;

        Scanner sr = new Scanner(System.in);

        System.out.println("Ingrese numero");
        A = sr.nextInt();

        System.out.println("El numero " + A + ":");
        System.out.println((A%2==0) ? "Es par":"Es impar");
        System.out.println((A>=0) ? "Es positivo":"Es negativo");
        System.out.println((A%5==0) ? "Es multiplo de 5":"No es multiplo de 5");
        System.out.println((A%10==0) ? "Es multiplo de 10":"No es muliplo de 10");
        System.out.println((A>=100) ? "Es mayor o igual a 100":"Es menor a 100");*/

        /**Punto 8**/   //Lecutura de Strings
        /*String nombre = new String();
        Scanner sr = new Scanner(System.in);
        System.out.println("Ingrese nombre");
        nombre = sr.nextLine();
        System.out.println("Buenos dias, " + nombre);*/

        /**Punto 9**/
        /*int num = 0;
        int doble, triple;
        Scanner sr = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        num = sr.nextInt();
        doble = num * 2;
        triple = num * 3;
        System.out.println("El doble es " + doble + " y el triple es " + triple);
        */

        /**Punto 10**/
        float F = 0f;
        float C;
        Scanner sr = new Scanner(System.in);
        System.out.println("Ingrese temperatura en Fahrenheit");
        F = sr.nextFloat();
        C = (F-32)*5/9;
        System.out.println("Equivalente en Celcius = " + C);

        /**Punto 11**/
        /*float radio = 0f;
        float perim, area;
        Scanner sr = new Scanner(System.in);
        System.out.println("Ingrese radio del circulo en metros");
        radio = sr.nextFloat();
        perim = 2 * 3.14f * radio;
        area = 3.14f * radio * radio;
        System.out.println("Perimetro de la Circunferencia = " + perim + " metros");
        System.out.println("Area de la Circunferencia = " + area + " metros cuadrados");*/

        /**Punto 12**/
        /*float speedKmH,speedMS;
        Scanner sr = new Scanner(System.in);
        System.out.println("Ingrese velocidad en kilometros por hora");
        speedKmH = sr.nextFloat();
        speedMS = speedKmH * 1000 / 3600;
        System.out.println("Equivalente a " + speedMS + " metros por segundo");*/

        /**Punto 13**/
        /*double a,b,c;
        Scanner sr = new Scanner(System.in);
        System.out.println("Ingrese cateto A");
        a = sr.nextDouble();
        System.out.println("Ingrese cateto B");
        b = sr.nextDouble();
        c = Math.sqrt(a*a+b*b);
        System.out.println("Hipotenusa del triangulo = " + c);*/

        /**Punto 14**/
        /*double radio, volumen;
        Scanner sr = new Scanner(System.in);
        System.out.println("Ingrese radio de la esfera en cm");
        radio = sr.nextDouble();
        volumen = 4/3*3.14d*Math.pow(radio,3);
        System.out.println("Volumen de la esfera = " + volumen + " cm cubicos");*/

        /**Punto 15**/
        /*String lado1 = JOptionPane.showInputDialog(null,"Ingrese lado nro 1");
        String lado2 = JOptionPane.showInputDialog(null,"Ingrese lado nro 2");
        String lado3 = JOptionPane.showInputDialog(null,"Ingrese lado nro 3");

        double num1 = Double.parseDouble(lado1);
        double num2 = Double.parseDouble(lado2);
        double num3 = Double.parseDouble(lado3);

        double semPerim = (num1+num2+num3)/2;
        double area = Math.sqrt(semPerim*(semPerim-num1)*(semPerim-num2)*(semPerim-num3));

        JOptionPane.showConfirmDialog(null,"El area del triangulo es " + area + " u^2");*/

        /**Punto 16**/
        /*int num;
        Scanner sr = new Scanner(System.in);
        System.out.println("Ingrese numero de 3 cifras");
        num = sr.nextInt();
        System.out.println("Numero 1 = " + num/100);
        num = num%100;
        System.out.println("Numero 2 = " + num/10);
        num = num%10;
        System.out.println("Numero 3 = " + num);*/

        /**Punto 17**/
        /*int num;
        Scanner sr = new Scanner(System.in);
        System.out.println("Ingrese numero de 5 cifras");
        num = sr.nextInt();
        System.out.println(num/10000);
        num = (num%10000)%1000;
        System.out.println(num/100);
        num = (num%100)%10;
        System.out.println(num);*/

        /**Punto 18**/
        /*Scanner sr = new Scanner(System.in);
        System.out.println("Ingrese horas, minutos y segundos");
        Integer H = sr.nextInt();
        Integer M = sr.nextInt();
        Integer S = sr.nextInt();
        if ((0 <= H && H <= 23)&&(0 <= M && M <= 59)&&(0 <= S && S <= 59)){
            System.out.println("La hora es correcta -> " + H + " hs " + M + " min " + S + " seg");
        }
        else{
            System.out.println("La hora es incorrecta");
        }*/

    }//fin metodo main

}//fin clase main