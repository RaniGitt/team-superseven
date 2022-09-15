package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;

import com.levelup.forestsandmonsters.fake.FakeCharacter;


public class GameControllerTest {

    Character testObj;
    public String characterName;
    
    @Test
    public void InitializationCreatesResults() {
        GameController testObj = new GameController();
        assertNotNull(testObj.status);
    }

    @Test
    public void test_Move_With_Empty_Direction()
    {
        GameController testObj = new GameController();
        FakeCharacter testCharacter = new FakeCharacter();
        testCharacter.move(null);

    }

    @Test
    public void test_Create_Character()
    {
        GameController testObj = new GameController();
                testObj.createCharacter(characterName);

    }

    @Test
    public void test_StartGame()
    {
        GameController testObj = new GameController();
                testObj.startGame();
                assertNotNull(testObj.map);
                

    }
}
