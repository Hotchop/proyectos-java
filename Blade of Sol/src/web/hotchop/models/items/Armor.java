package web.hotchop.models.items;

public class Armor extends Equipement{
    private int resistance;

    public Armor(String description, int resistance) {
        super(description);
        this.resistance = resistance;
    }

    public int getResistance() {
        return resistance;
    }

    public void setResistance(int resistance) {
        this.resistance = resistance;
    }
}
