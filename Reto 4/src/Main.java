import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ingrese altura de la escalera");
        Scanner sr = new Scanner(System.in);
        int altura = sr.nextInt();
        if(altura > 0){
            for (int i = 0; i < altura*2; i++) {
                System.out.print(' ');
            }
            System.out.println('_');
            altura -= 1;
            while(altura > 0){
                for (int i = 0; i < altura * 2; i++) {
                    System.out.print(' ');
                }
                System.out.println("_|");
                altura -= 1;
            }
            System.out.println("_|");
        }
        else{
            if(altura < 0){
                altura *= -1;
                System.out.println('_');
                for (int i = 0; i < altura; i++) {
                    for (int j = 0; j <= i*2; j++) {
                        System.out.print(' ');
                    }
                    System.out.println("|_");
                }
            }
            else{
                System.out.println("__");
            }
        }
    }
}