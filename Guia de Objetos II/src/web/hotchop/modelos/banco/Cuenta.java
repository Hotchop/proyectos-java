package web.hotchop.modelos.banco;

import java.util.UUID;

public class Cuenta {
    private UUID id;
    private Double balance;
    private Cliente cliente;

    public Cuenta(UUID id, Double balance, Cliente cliente) {
        this.id = id;
        this.balance = balance;
        this.cliente = cliente;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "id=" + id +
                ", balance=" + balance +
                ", " + cliente.toString() +
                '}';
    }

    public void deposito(){

    }

    public  void extraccion(){

    }
}
