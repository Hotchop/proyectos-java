import web.hotchop.models.punto1.Cilindro;
import web.hotchop.models.punto1.Circulo;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        /**Punto 1**/
        Cilindro cil1 = new Cilindro();
        System.out.println(cil1.toString());
        Cilindro cil2 = new Cilindro(7d,"azul",8d);
        System.out.println(cil2.toString());
    }
}