package guia1.modelos;

import java.util.UUID;

public class CuentaBancaria {
    private UUID id;
    private String nombre;
    private Double balance;

    public CuentaBancaria(UUID id, String nombre, Double balance) {
        this.id = id;
        this.nombre = nombre;
        this.balance = balance;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", balance=" + balance +
                '}';
    }

    public Double credito(Double monto){
        return balance += monto;
    }
    public Double debito(Double monto){
        if(balance - monto < 0d){
            System.out.println("Saldo insuficiente en la cuenta");
            return balance;
        }
        else{
            return balance -= monto;
        }
    }
}
