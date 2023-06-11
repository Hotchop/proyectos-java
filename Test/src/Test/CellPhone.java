package Test;

import java.io.Serializable;

//DEBO IMPLEMENTAR SERIALIZABLE PARA QUE EL OBJETO SE PUEDA PERSISTIR
//(Esta implementacion no me obliga a redefinir ningun metodo, de esto se encargara la Clase de Persistencia.)
public class CellPhone implements Serializable{
    private int id;
    private String model;
    private String mark;
    private int number;
    private static int contId= 1;

    public CellPhone(String model, String mark, int number) {
        setModel(model);
        setMark(mark);
        setNumber(number);
    }

    public int getId() {
        return this.id;
    }

    private void setId() {
        this.id = contId++;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMark() {
        return this.mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString(){
        String messageFormat = "=> Datos Telefono: [ ID: %d - Modelo: %s - Marca: %s - Numero: %d ]";

        return String.format(messageFormat, getId(), getModel(), getMark(), getNumber());
    }

    @Override
    public boolean equals(Object obj) {
        boolean equals = false;

        if (obj instanceof CellPhone)
            equals = getId() == ((CellPhone) obj).getId();

        return  equals;
    }
}
