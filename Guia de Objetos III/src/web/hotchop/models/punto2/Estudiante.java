package web.hotchop.models.punto2;

import java.time.LocalDate;

public class Estudiante extends Persona{
    private Integer ingreso;
    private Double couta;
    private String carrera;

    public Estudiante(Integer dni, String nombre, String apellido, String email, String direccion, Integer ingreso, Double couta, String carrera) {
        super(dni, nombre, apellido, email, direccion);
        this.ingreso = ingreso;
        this.couta = couta;
        this.carrera = carrera;
    }

    public Integer getIngreso() {
        return ingreso;
    }

    public void setIngreso(Integer ingreso) {
        this.ingreso = ingreso;
    }

    public Double getCouta() {
        return couta;
    }

    public void setCouta(Double couta) {
        this.couta = couta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiante{" +super.toString()+
                "ingreso=" + ingreso +
                ", couta=" + couta +
                ", carrera='" + carrera + '\'' +
                '}';
    }
}
