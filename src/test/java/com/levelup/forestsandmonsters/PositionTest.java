package com.levelup.forestsandmonsters;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class PositionTest {
    @Test
    public void initializationSetsCoordinates(){
        Position positionObject = new Position(0,5);
        assertEquals(0, positionObject.coordinates.x);
        assertEquals(5, positionObject.coordinates.y);
    }
}
