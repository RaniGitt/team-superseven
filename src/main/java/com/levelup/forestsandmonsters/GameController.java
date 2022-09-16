package com.levelup.forestsandmonsters;

import java.awt.Point;

public class GameController {
    // TODO: If your stakeholder wants to call this CHARACTER, change var name for
    // low representational gap
    static final String DEFAULT_CHARACTER_NAME = "Character";
    Character character;
    GameMap map;
    public GameMap getMap() {
        return map;
    }

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
         this.character = new Character(name);
         this.status.characterName=name;
         if(name==null||name=="")
         this.status.characterName=DEFAULT_CHARACTER_NAME;

        
    }

    public void setMap(GameMap map){
        this.map=map;
    }

    public void setcharacter(Character character){
        this.character=character;
    }

    public void startGame() {
       if(map==null)
            map = new GameMap(); 
        if (character == null)
        {
            this.character = new Character();
        }
        character.enterMap(map);
        this.status.characterName = this.character.getName();
        this.status.currentPosition = this.character.getPosition().coordinates;
        
    }

    public GameStatus getStatus() 
        {

        GameStatus snapshotStatus = new GameStatus();
        snapshotStatus.characterName = this.status.characterName;
        snapshotStatus.currentPosition = this.status.currentPosition;
        return snapshotStatus;
        

        }

    public void move(DIRECTION directionToMove) {
        // TODO: Implement move - should call something on another class
        // TODO: Should probably also update the game results

            this.character.move(directionToMove);
            this.status.currentPosition = this.character.getPosition().coordinates;

    }

    public void setCharacterPosition(Point point) {
        
        status.currentPosition = point;
        this.character.getPosition().coordinates.x=point.x;
        this.character.getPosition().coordinates.y=point.y;
       // this.character.setCharacterPosition(point);
    }

    public int getTotalPositions() {
        return this.map.getTotalPositions();
    }   

}
