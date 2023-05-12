package web.hotchop.models;

import web.hotchop.models.enums.EnemyStatus;
import web.hotchop.models.interfaces.Combat;
import web.hotchop.models.items.Item;

import java.util.ArrayList;
import java.util.Random;

public class Enemy implements Combat {
    private String name;
    private int hp;
    private int attack;
    private int hitChance;
    private int defense;
    private EnemyStatus status;
    private ArrayList<Item> loot;
    private ArrayList<String> messages;

    public Enemy(String name, int hp, int attack, int hitChance, int defense, ArrayList<Item> loot, ArrayList<String> messages) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.hitChance = hitChance;
        this.defense = defense;
        this.status = EnemyStatus.ALIVE;
        this.loot = loot;
        this.messages = messages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getHitChance() {
        return hitChance;
    }

    public void setHitChance(int hitChance) {
        this.hitChance = hitChance;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public EnemyStatus getStatus() {
        return status;
    }

    public void setStatus(EnemyStatus status) {
        this.status = status;
    }

    public ArrayList<Item> getLoot() {
        return loot;
    }

    public void setLoot(ArrayList<Item> loot) {
        this.loot = loot;
    }

    public ArrayList<String> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<String> messages) {
        this.messages = messages;
    }

    public int getAttack() {
        return attack;
    }

    @Override
    public int attack() {
        Random d20 = new Random();
        int hit = 1 + d20.nextInt(20) + hitChance;
        return hit;
    }

    @Override
    public int damage() {
        return getAttack();
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
