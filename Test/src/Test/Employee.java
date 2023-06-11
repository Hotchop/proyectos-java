package Test;

import java.io.Serializable;

//DEBO IMPLEMENTAR SERIALIZABLE PARA QUE EL OBJETO SE PUEDA PERSISTIR
//(Esta implementacion no me obliga a redefinir ningun metodo, de esto se encargara la Clase de Persistencia.)
public abstract class Employee implements Serializable {

    //Private properties
    private int dni;
    private String name;
    private String surName;
    private String email;
    private int phone;
    private float salaryBase;

    //Constructors
    public Employee(int dni, String name, String surName, String email, int phone) {
        setDni(dni);
        setName(name);
        setSurName(surName);
        setEmail(email);
        setPhone(phone);
        setSalaryBase(20000);
    }

    //Public Access
    public int getDni() {
        return this.dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getSurName() {
        return this.surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public float getSalaryBase() {
        return this.salaryBase;
    }

    public void setSalaryBase(float salaryBase) {
        this.salaryBase = salaryBase > 0 ? salaryBase : 0;
    }

    @Override
    public String toString(){
        String messageFormat = "==> Datos Personales: [ DNI:%d - Nombres:%s - Apellidos:%s - Direccion: %s - Telefono: %s - Salario Base: %.2f ]";

        return String.format(messageFormat, getDni(), getName(), getSurName(), getEmail(), getPhone(), getSalaryBase());
    }

    @Override
    public boolean equals(Object obj) {
        boolean equals = false;

        if (obj instanceof Employee)
            equals = this.dni == ((Employee) obj).getDni();

        return  equals;
    }
}
