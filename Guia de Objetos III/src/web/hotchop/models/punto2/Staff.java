package web.hotchop.models.punto2;

public class Staff extends Persona{
    private Double salario;
    private String turno;

    public Staff(Integer dni, String nombre, String apellido, String email, String direccion, Double salario, String turno) {
        super(dni, nombre, apellido, email, direccion);
        this.salario = salario;
        this.turno = turno;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Staff{"+super.toString() +
                "salario=" + salario +
                ", turno='" + turno + '\'' +
                '}';
    }

    public Double salarioAnual(){
        return salario*12;
    }
}
