package web.hotchop.models.items;

public class Armor extends Equipement{
    private int resistance;

    public Armor(String description, int resistance) {
        super(description);
        this.resistance = resistance;
    }
}
