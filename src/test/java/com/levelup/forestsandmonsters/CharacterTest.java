package com.levelup.forestsandmonsters;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.Test;

import com.levelup.forestsandmonsters.fake.FakeGameMap;

public class CharacterTest {
    
    Character testObj;
    Position STUBBED_NEW_POSITION = new Position(4,3);

  
    @Test
    public void test_Move_With_Empty_Direction()
    {
        testObj=new Character();
        testObj.setName("TeamSeven");
        testObj.move(null);
    }

    @Test
    public void test_getPostion()
    {
        testObj=new Character();
        testObj.setName("TeamSeven");
        Position position =testObj.getPosition();
        assertNull(testObj.getPosition()); 

    }

    @Test
    public void test_Move_With_All_Patarameter()
    {
        testObj=new Character();
        testObj.setName("TeamSeven");
        FakeGameMap fakeMap=new FakeGameMap();
        testObj.enterMap(fakeMap);
        testObj.move(GameController.DIRECTION.WEST);
        assertNotNull(testObj.getPosition()); 
    }
    
}
