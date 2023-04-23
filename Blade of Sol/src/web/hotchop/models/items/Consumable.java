package web.hotchop.models.items;

public class Consumable extends Item{
    private int heal;
    private boolean consumed;

    public Consumable(String description, int heal) {
        super(description);
        this.heal = heal;
        this.consumed = false;
    }

    public int getHeal() {
        return heal;
    }

    public void setHeal(int heal) {
        this.heal = heal;
    }

    public boolean isConsumed() {
        return consumed;
    }

    public void setConsumed(boolean consumed) {
        this.consumed = consumed;
    }
}
