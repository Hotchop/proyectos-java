import web.hotchop.models.punto1.Cilindro;
import web.hotchop.models.punto2.Estudiante;
import web.hotchop.models.punto2.Persona;
import web.hotchop.models.punto2.Staff;
import web.hotchop.models.punto3.Circulo;
import web.hotchop.models.punto3.Cuadrado;
import web.hotchop.models.punto3.Rectangulo;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /**Punto 1**/
        /*Cilindro cil1 = new Cilindro();
        System.out.println(cil1.toString());
        Cilindro cil2 = new Cilindro(7d,"azul",9d);
        System.out.println(cil2.toString());*/

        /**Punto 2**/
        /*Estudiante est1 = new Estudiante(39836196,"Nicolas","Miranda","mirandanic1996@gmail.com","Gascon 4972",2022,10000d,"Programacion");
        Estudiante est2 = new Estudiante(27364912,"Klee","Bakugan","klee@gmail.com","Monstad 4972",2022,10000d,"Ingenieria");
        Estudiante est3 = new Estudiante(83726152,"Raiden","Ei","raiden@gmail.com","Inazuma 4972",2022,10000d,"Politica");
        Estudiante est4 = new Estudiante(27162534,"Ganyu","Adeptus","ganyu@gmail.com","Liyue 4972",2022,10000d,"Contabilidad");
        Staff st1 = new Staff(27384762,"Ruby","Rose","pablo@email.com","Red 1234",80000d,"Tarde");
        Staff st2 = new Staff(56382836,"Weiss","Shnee","weiss@email.com","White 1234",80000d,"Tarde");
        Staff st3 = new Staff(29371993,"Blake","Belladona","blake@email.com","Black 1234",80000d,"Noche");
        Staff st4 = new Staff(26152672,"Yang","Xiao Long","yang@email.com","Yellow 1234",80000d,"Noche");
        ArrayList<Persona> lista = new ArrayList<>();
        lista.add(est1);
        lista.add(st3);
        lista.add(est4);
        lista.add(st1);
        lista.add(est2);
        lista.add(st2);
        lista.add(st4);
        lista.add(est3);
        Integer nEstudiantes = 0,nStaff = 0;
        for (Persona i:
             lista) {
            if(i instanceof Estudiante){
                ++nEstudiantes;
            }
            else{
                if(i instanceof Staff){
                    ++nStaff;
                }
            }
        }
        System.out.println("Total Estudiantes: "+nEstudiantes+" Total Staff: "+nStaff);
        Double totalMensual = 0d;
        for (Persona i:
             lista) {
            if(i instanceof Estudiante){
                totalMensual += ((Estudiante) i).getCouta();
            }
        }
        System.out.println("Ingresos Mensuales= "+totalMensual+" Ingresos Anuales= "+totalMensual*12);*/

        /**Punto 3**/
        Circulo cir1 = new Circulo("rojo",true,3d);
        Circulo cir2 = new Circulo("azul",false,5d);
        Rectangulo rec1 = new Rectangulo("verde",true,2d,3d);
        Rectangulo rec2 = new Rectangulo("amarillo",false,3d,6d);
        System.out.println(cir1.toString());
        System.out.println(cir2.toString());
        System.out.println(rec1.toString());
        System.out.println(rec2.toString());
        Cuadrado cua1 = new Cuadrado("violeta",true,5d);
        System.out.println(cua1.toString());
    }
}