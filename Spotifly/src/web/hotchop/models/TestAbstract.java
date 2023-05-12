package web.hotchop.models;

public abstract class TestAbstract {
    private String color;
    public static int cantidad = 0;

    public abstract double calculaRadio();

    public static int doble(int dato){
        return dato * 2;
    }
}
