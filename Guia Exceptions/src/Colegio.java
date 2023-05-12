import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Colegio {
    public List<Alumno> listado;

    public Colegio() {
        this.listado = new ArrayList<>();
    }

    public void agregarNacionalidad(Alumno alumno){
        try{
            if(alumno.getNacionalidad() == null){
                throw new RuntimeException("Alumno sin nacionalidad");
            }
        }catch (RuntimeException ex){
            System.out.println("El alumno no tiene nacionalidad. Ingresela a continuacion");
            Scanner scanner = new Scanner(System.in);
            alumno.setNacionalidad(scanner.nextLine());
        }finally {
            listado.add(alumno);
        }

    }
    public void verNacionalidad(String nacionalidad){
        try {
            if(listado.isEmpty()){
                throw new RuntimeException("Error: Lista vacia");
            }
            int total = 0;
            for (Alumno i:
                    listado) {
                if(nacionalidad.compareTo(i.getNacionalidad()) == 0) {
                    total++;
                }
            }
            System.out.println("Alumnos pertenecientes a "+nacionalidad+" - "+total);
        }catch (RuntimeException ex){
            System.out.println(ex.getMessage());
        }
    }
    public void cuantos(){
        try {
            if(listado.isEmpty()){
                throw new RuntimeException("Error: Lista vacia");
            }
            String comparable = listado.get(0).getNacionalidad();
            List<String> naciones = new ArrayList<>();
            naciones.add(comparable);
            for (Alumno i:
                 listado) {
                if(comparable.compareTo(i.getNacionalidad()) != 0){
                    comparable = i.getNacionalidad();
                    naciones.add(comparable);
                }
                System.out.println("Total de nacionalidades: "+naciones.size()+"\nListado de naciones:\n");
                for (String j:
                     naciones) {
                    System.out.println(j+"\n");
                }
            }
        }catch (RuntimeException ex){
            System.out.println(ex.getMessage());
        }

    }
    public void borrarAlumno(Alumno alumno){
        try {
            if(listado.contains(alumno) == false){
                throw new RuntimeException("Error: Alumno no exite");
            }
            listado.remove(alumno);
        }catch (RuntimeException ex){
            System.out.println(ex.getMessage());
        }
    }
    public void verTodo(){
        try {
            if(listado.isEmpty()){
                throw new RuntimeException("Error: Lista vacia");
            }
            System.out.println("Listado de nacionalidades y cantidad de alumnos:\n");
            String nacion = listado.get(0).getNacionalidad();
            int total = 1;
            for (Alumno i:
                 listado) {
                if(nacion.compareTo(i.getNacionalidad()) != 0){
                    System.out.println(nacion+" --> "+total);
                    nacion = i.getNacionalidad();
                    total = 1;
                }
                else {
                    total++;
                }
            }
            System.out.println(nacion+" --> "+total);
        }catch (RuntimeException ex){
            System.out.println(ex.getMessage());
        }
    }
}
