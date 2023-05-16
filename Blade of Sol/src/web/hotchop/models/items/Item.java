package web.hotchop.models.items;

public class Item {
    private String description;
    private String nombre;

    public Item(String description, String nombre) {
        this.description = description;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return description;
    }
}
