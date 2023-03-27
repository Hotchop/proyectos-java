package web.hotchop.modelos.banco;

import java.util.UUID;

public class CuentaDeudora {
    private UUID id;
    private Double balance = 0d;
    private Cliente cliente;

    public CuentaDeudora(UUID id, Double balance, Cliente cliente) {
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

    public String deposito(Double ingreso){
        balance += ingreso;
        return "Se depositaron $"+ingreso+"\nBalance actual: $"+balance;
    }

    public String extraccion(Double egreso){
        if(balance - egreso < -2000){
            return "Saldo insuficiente, no se a completado la operacion.\nBalance actual: $"+balance;
        }
        else{
            balance -= egreso;
            return "Se retiraron $"+egreso+"\nBalance actual: $"+balance;
        }
    }
}
