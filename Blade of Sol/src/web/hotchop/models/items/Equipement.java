package web.hotchop.models.items;

public class Equipement extends Item{
    private boolean equiped;

    public Equipement(String description, String nombre) {
        super(description, nombre);
        this.equiped = false;
    }

    public boolean isEquiped() {
        return equiped;
    }

    public void setEquiped(boolean equiped) {
        this.equiped = equiped;
    }
}
