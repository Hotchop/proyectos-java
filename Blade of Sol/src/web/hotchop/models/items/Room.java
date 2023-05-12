package web.hotchop.models.items;

import web.hotchop.models.Enemy;

import java.util.ArrayList;

public class Room {
    private String description;
    private Room north;
    private Room west;
    private Room south;
    private Room east;
    private boolean accesible;
    private Enemy enemy;
    private ArrayList<Item> contents;

    public Room(String description, Room north, Room west, Room south, Room east, boolean accesible, Enemy enemy, ArrayList<Item> contents) {
        this.description = description;
        this.north = north;
        this.west = west;
        this.south = south;
        this.east = east;
        this.accesible = accesible;
        this.enemy = enemy;
        this.contents = contents;
    }
}
