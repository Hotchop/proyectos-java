package Test;

import File.PersistenceCollecion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    /*IMPORTANTE PRESTAR ATENCION AL ARCHIVO README.TXT DEL EJEMPLO PARA ENTENDER DE QUE SE COMPONE*/

    public static void main(String[] args) {
        /*
        * A continuacion se desarrollara un pequeño ejemplo donde se instanciaran una serie de clases
        * donde se aplicaherencia y composicion en coleccion, a modo de prueba para explicar el uso de la clase de
        * Persistencia desarrollada.
        * */

        // Estructura para implementar la Persistencia de objetos (ESCRITURA)

        String employeesFile = "Employees"; //Nombre del archivo a persistir y leer
        try {

            //Listado de objetos que contendra el vendedor Sebastian
            List<CellPhone> sebastianCellPhones = new ArrayList<>();
            sebastianCellPhones.add(new CellPhone("7+", "Iphone", 12312312));
            sebastianCellPhones.add(new CellPhone("A7", "Samsung G.", 1452312312));

            //Listado de objetos que contendra el vendedor Matias
            List<CellPhone> matiasCellPhones = new ArrayList<>();
            matiasCellPhones.add(new CellPhone("P9", "Nokia", 112312312));
            matiasCellPhones.add(new CellPhone("S10", "Samsung", 123123125));

            //Vendedores
            Employee sellerSebastian = new Seller(36234234, "Sebastian", "Soler", "sebastiansoler@gmail.com", 223987654, sebastianCellPhones, 7);
            Employee sellerMatias = new Seller(32456987, "Matias", "Oliva", "matiasoliva@gmail.com", 223234567, matiasCellPhones, 9);

            System.out.println("=> Se genero toda la informacion a  Persistir. OK! ");

            //Array de Empleados a Persistir
            List<Employee> employeesToPersist = new ArrayList<>();
            employeesToPersist.add(sellerSebastian);
            employeesToPersist.add(sellerMatias);
            System.out.println("=> Genero un listado que contenga lo que quiero Guardar \n(Siempre en ARRAYLIST aunque sea un solo Objeto enorme). OK! ");

            //Clase encargada de Persistir Empleados junto con toda su composicion.
            PersistenceCollecion<Employee> employeePersistenceCollecion = new PersistenceCollecion<>();

            System.out.println("=> Se genera la clase encargada de Persistir mi ArrayList de Objetos. OK! ");

            //Persisto lo que contiene el array
            employeePersistenceCollecion.WriteIntoFile(employeesToPersist, employeesFile);

            System.out.println("=> AHORA YA TENEMOS PERSISTIDA LA COLECCION DE OBJETOS. OK! ");
            System.out.println("\n=> Podra ver que el archivo ya se genero correctamente en la raiz del proyecto.\n(No lo intente abrir ya que es ilegible)\nIngrese alguna letra para continuar!");
            Scanner scanner = new Scanner(System.in);
            String cont = scanner.next();



            // PROCESO DE LECTURA !
            // Declaro mi listado para atrapar lo obtenido del archivo.
            List<Employee> employeesFromFile = new ArrayList<>();

            System.out.println("=> Genero un list del mismo tipo del persistido para capturar lo que Leremo del archivo. OK! ");

            //Utilizo una variable como nombre para validar que siempre sea el mismo valor (employeesFile).
            //Leo y obtengo otro listado de empleados tal cual se Persistio.
            employeesFromFile = employeePersistenceCollecion.ReadFromFile(employeesFile);

            System.out.println("=> Ya lei del archivo y lo pase a mi listado. OK! ");

            //Recorro el listado para ver los empleados Leidos del archivo.
            System.out.println("=====> LISTA DE EMPLEADOS LEIDOS !");
            for(Employee emp : employeesFromFile){
                System.out.println("======================================================================");
                System.out.println(emp.toString());

                //Metodo del vendedor para listar todos los celulares, hecho para evitar hacer otro foreach y ver todos de forma mas simple
                ((Seller)emp).showCellPhones();
            }

            System.out.println("\n==> Fin del Test, Archivo Persistido, ahora solo con leerlo ya tiene todos los empleados guardados.!!");
        }
        catch (Exception e){
            System.out.println("=> SE ROMPIO ALGO A LA HORA DE ESCRIBIR EN EL ARCHIVO!!\n\n=>Mensaje: " + e.getMessage());
        }
    }
}
