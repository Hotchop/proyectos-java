package web.hotchop.models.interfaces;

import web.hotchop.models.items.Consumable;
import web.hotchop.models.items.Equipement;
import web.hotchop.models.items.Item;

public interface Inventory {
    void pickUp(Item item);
    String look(Item item);
    void equip(Equipement equipement);
    void use(Consumable consumable);
}
