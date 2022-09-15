package com.levelup.forestsandmonsters;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class Character {

    private String name;
    private Position currentPosition;
    private GameMap map;

    public Character(String name2) {
        this.name=name2;
    }

    public Character() {
       }

    public String getName() {
        return this.name;
    }

    public void move(DIRECTION direction) {
        if(direction!=null)
        currentPosition=map.calculatePosition(currentPosition,direction);
    }

    public void setName(String name) {
        this.name=name;
    }

    public Position getPosition() {
        return currentPosition;
    }

    public void enterMap(GameMap map) {
        this.map=map;
    }
    
}
