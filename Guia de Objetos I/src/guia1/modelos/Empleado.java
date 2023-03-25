package guia1.modelos;

public class Empleado {

    private String nombre;
    private String apellido;
    private Integer dni;
    private Float salario;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, Integer dni, Float salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.salario = salario;
    }

    public Float salAnual() {
        return salario*12;
    }

    public void modSalario(Float porcentaje){
        salario += salario*porcentaje/100;
    }

    @Override
    public String toString() {
        return "Empleado[dni=" + dni
                + ", nombre=" + nombre
                + ", apellido=" + apellido
                + ", salario=" + salario
                + "]";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }
}
