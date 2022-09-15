package com.levelup.forestsandmonsters;

import java.awt.Point;

public class GameController {
    // TODO: If your stakeholder wants to call this CHARACTER, change var name for
    // low representational gap
    static final String DEFAULT_CHARACTER_NAME = "Character";
    Character character;
    GameMap map;
    public class GameStatus {
        // TODO: Add other status data
        public String characterName = DEFAULT_CHARACTER_NAME;
        public Point currentPosition = null;
    }

    GameStatus status;

    public GameController() {
        status = new GameStatus();
    }

    // TODO: Ensure this AND CLI commands match domain model
    public static enum DIRECTION {
        NORTH, SOUTH, EAST, WEST
    }

    // Pre-implemented to demonstrate ATDD
    // TODO: Update this if it does not match your design
    public void createCharacter(String name) {
         character = new Character(name);
        
    }

    public void startGame() {
         map = new GameMap(); 
        if (character == null)
        {
            this.character = new Character();
        }
        character.enterMap(map);
        this.status.characterName = this.character.getName();
        this.status.currentPosition = this.character.getPosition().coordinates;
        
    }

    public GameStatus getStatus() {
        return this.status;
    }

    public void move(DIRECTION directionToMove) {
        // TODO: Implement move - should call something on another class
        // TODO: Should probably also update the game results

    }

    public void setCharacterPosition(Point point) {
        
        //status.currentPosition = point;
        
    }

}
