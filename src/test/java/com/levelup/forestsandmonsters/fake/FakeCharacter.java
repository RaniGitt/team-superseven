package com.levelup.forestsandmonsters.fake;

import com.levelup.forestsandmonsters.Character;
import com.levelup.forestsandmonsters.Position;
import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class FakeCharacter extends Character {

    public DIRECTION directionProvided=DIRECTION.EAST;
    
    public Position STUBBED_NEW_POSITION=new Position(0,0);;
    
    public void move(Object object) {
    }

    public Position getPosition() {
        return STUBBED_NEW_POSITION;
    }
  
    

}
