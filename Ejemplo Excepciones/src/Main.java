import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numerador;
        int divisor;
        double res;

        Calculadora calculadora = new Calculadora();
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese numerador");
            numerador = scanner.nextInt();
            System.out.println("Ingrese divisor");
            divisor = scanner.nextInt();
            res = calculadora.dividir(numerador, divisor);
            System.out.println("Respuesta = " + res);
        } catch (DividirPorCeroException e) {
            System.out.println(e.getMessage());
            main(args);     ///Esto loopea al inicio del main para volver a intentar luego del error
        }


        /*try{
            int resultado = numerador/divisor;
            System.out.println("resultado = " + resultado);
        }catch (ArithmeticException arithmeticException){
            System.out.println(arithmeticException.getMessage());
        }catch (NullPointerException nullPointerException){
            System.out.println(nullPointerException.getMessage());
        } finally {
            System.out.println("Finalizado");
        }
        System.out.println("Continua la ejecucion");
    }*/
    }
}