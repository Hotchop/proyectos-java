package nicolasmiranda.punto1;

import java.time.LocalDate;

public class Gerente extends Empleado{
    private double salario;

    public Gerente(int dni, String nombre, String nacimiento, double salario) {
        super(dni, nombre, nacimiento);
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString()+"Gerente{" +
                "salario=" + salario +
                '}';
    }
}
