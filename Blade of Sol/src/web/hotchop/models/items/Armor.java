package web.hotchop.models.items;

public class Armor extends Equipement{
    private int resistance;

    public Armor(String description, String nombre, int resistance) {
        super(description, nombre);
        this.resistance = resistance;
    }

    public int getResistance() {
        return resistance;
    }

    public void setResistance(int resistance) {
        this.resistance = resistance;
    }
}
