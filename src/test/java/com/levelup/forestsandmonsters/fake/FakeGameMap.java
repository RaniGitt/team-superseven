package com.levelup.forestsandmonsters.fake;

import com.levelup.forestsandmonsters.GameController.DIRECTION;
import com.levelup.forestsandmonsters.GameMap;
import com.levelup.forestsandmonsters.Position;

public class FakeGameMap extends GameMap{
    
    Position STUBBED_NEW_POSITION = new Position(4,3);
    @Override
    public Position calculatePosition(Position currentPosition, DIRECTION direction) {
        return STUBBED_NEW_POSITION;
    }
    
}
