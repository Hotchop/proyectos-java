package web.hotchop.models;

import web.hotchop.models.interfaces.Combat;
import web.hotchop.models.interfaces.Inventory;
import web.hotchop.models.items.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Player implements Inventory, Combat {
    private int hp;
    private static final int MAX_HP = 100;
    private Weapon weaponE;
    private Armor armorE;
    private ArrayList<Item> inventory;

    public Player(Weapon weapon, Armor armor) {
        this.hp = MAX_HP;
        this.weaponE = weapon;
        this.armorE = armor;
        this.inventory = new ArrayList<>();
        inventory.add(weapon);
        inventory.add(armor);
    }

    @Override
    public void pickUp(Item item) {
        inventory.add(item);
    }

    @Override
    public String look(Item item) {
        return item.toString();
    }

    @Override
    public void equip(Equipement equipment) {
        if(equipment instanceof Armor){
            this.armorE.setEquiped(false);
            equipment.setEquiped(true);
            this.armorE = (Armor) equipment;

        }
        else{
            this.weaponE.setEquiped(false);
            equipment.setEquiped(true);
            this.weaponE = (Weapon) equipment;
        }
    }

    @Override
    public void use(Consumable consumable) {
        if(!consumable.isConsumed()){
            if(hp+consumable.getHeal() >= MAX_HP){
                hp = MAX_HP;
            }
            else{
                hp += consumable.getHeal();
            }
            consumable.setConsumed(true);
        }
    }

    @Override
    public int attack() {
        Random d20 = new Random();
        int hit = 1 + d20.nextInt(20) + this.weaponE.getHitModifier();
        return hit;
    }

    @Override
    public int damage() {
        return weaponE.getDamage();
    }

    @Override
    public void getHit(int damage) {
        hp -= damage;
        if(hp <= 0){
            die();
        }
    }

    @Override
    public void die() {

    }
}