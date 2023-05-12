public class Alumno implements Comparable<Alumno> {
    private String nombre;
    private String nacionalidad;

    public Alumno() {
    }

    public Alumno(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public int compareTo(Alumno o) {
        if(this.nacionalidad == null){
            return 0;
        }else {
            return this.nacionalidad.compareTo(o.getNacionalidad());
        }
    }
}
