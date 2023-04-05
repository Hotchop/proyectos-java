import web.hotchop.modelos.Sistema;

public class Main {
    public static void main(String[] args) {
        Sistema videostore = new Sistema();
        videostore.cargadatos();
        videostore.menu();
    }
}