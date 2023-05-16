package web.hotchop.models.items;

public class Weapon extends Equipement{
    private int damage;
    private int hitModifier;

    public Weapon(String description, String nombre, int damage, int hitModifier) {
        super(description, nombre);
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
