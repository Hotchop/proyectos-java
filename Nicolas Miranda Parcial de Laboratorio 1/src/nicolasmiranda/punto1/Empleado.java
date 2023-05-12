package nicolasmiranda.punto1;

import java.time.LocalDate;

public class Empleado {
    private int idPersonal;
    private int dni;
    private String nombre;
    private String nacimiento;
    private static int id = 0;

    public Empleado(int dni, String nombre, String nacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        ++id;
        this.idPersonal = id;
    }

    @Override
    public String toString() {
        return "Empleado{id="+ idPersonal+
                ", dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", nacimiento=" + nacimiento +
                '}';
    }
}
