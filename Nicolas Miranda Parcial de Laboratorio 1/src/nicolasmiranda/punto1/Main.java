package nicolasmiranda.punto1;
/**DNI: 39836196
 * Miranda, Nicolas Martin
 * Comision 4
 */
public class Main {     ///Main del punto 1: Empleado y Gerentes
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente(1234,"Pablo","01/11/1990",10000d);
        Gerente gerente2 = new Gerente(2354,"Juan","03/12/1989",20000d);
        Gerente gerente3 = new Gerente(1446,"Pablo","05/03/1992",25000d);

        System.out.println("gerente1 = " + gerente1);
        System.out.println("gerente2 = " + gerente2);
        System.out.println("gerente3 = " + gerente3);
    }
}