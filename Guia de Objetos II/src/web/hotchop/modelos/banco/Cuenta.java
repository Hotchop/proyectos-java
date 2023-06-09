package web.hotchop.modelos.banco;

import java.util.ArrayList;
import java.util.UUID;

public class Cuenta {
    private UUID id;
    private Double balance = 0d;
    private Cliente cliente;
    private ArrayList<String> registro = new ArrayList<>();

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

    public String deposito(Double ingreso){
        balance += ingreso;
        registrar("El cliente "+ cliente.getNombre()+" deposito $"+ingreso);
        return "Se depositaron $"+ingreso+"\nBalance actual: $"+balance;
    }

    public String extraccion(Double egreso){
        if(balance - egreso < 0){
            return "No se puede retirar. Saldo insuficiente";
        }
        else{
            balance -= egreso;
            registrar("El cliente "+ cliente.getNombre()+" retiro $"+egreso);
            return "Se retiraron $"+egreso+"\nBalance actual: $"+balance;
        }
    }

    public void registrar(String reg){
        if(registro.size()==10) {
            registro.remove(0);
        }
        registro.add(reg);
    }

    public void printReg(){
        System.out.println("Ultimos 10 movimientos");
        for (String i:registro) {
            System.out.println(i);
        }
    }
}
