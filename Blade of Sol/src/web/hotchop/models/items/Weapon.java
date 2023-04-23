package web.hotchop.models.items;

public class Weapon extends Equipement{
    private int damage;
    private int hitModifier;

    public Weapon(String description, int damage, int hitModifier) {
        super(description);
        this.damage = damage;
        this.hitModifier = hitModifier;
    }

    public int getDamage() {
        return damage;
    }

    public int getHitModifier() {
        return hitModifier;
    }
}
