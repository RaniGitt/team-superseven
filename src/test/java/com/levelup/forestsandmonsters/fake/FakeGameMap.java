package com.levelup.forestsandmonsters.fake;

import com.levelup.forestsandmonsters.GameController.DIRECTION;
import com.levelup.forestsandmonsters.cli.GameMap;
import com.levelup.forestsandmonsters.cli.Position;

public class FakeGameMap extends GameMap{
    
    Position STUBBED_NEW_POSITION = new Position(4,3);

    public Position calculatePostion(Position currentPosition, DIRECTION direction) {
        return STUBBED_NEW_POSITION;
    }
    
}
