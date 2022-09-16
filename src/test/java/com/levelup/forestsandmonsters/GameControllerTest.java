package com.levelup.forestsandmonsters;

import static org.junit.Assert.*;
import org.junit.Test;

import com.levelup.forestsandmonsters.GameController.DIRECTION;
import com.levelup.forestsandmonsters.fake.FakeCharacter;
import com.levelup.forestsandmonsters.fake.FakeGameMap;


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
              

                FakeCharacter testCharacter = new FakeCharacter();
                testObj.setcharacter(testCharacter);
                FakeGameMap fMap=new FakeGameMap();
                testObj.setMap(fMap);
                testObj.startGame();

                assertNotNull(testObj.map);
                assertEquals(testCharacter.STUBBED_NEW_POSITION, testCharacter.getPosition());



    }

    @Test
    public void test_Move_withCharacter()
    {
        GameController testObjforMove = new GameController();

            FakeCharacter testcharformove = new FakeCharacter();
            testObjforMove.setcharacter(testcharformove);
            FakeGameMap fMaptomv=new FakeGameMap();
            testObjforMove.setMap(fMaptomv);
            testObjforMove.startGame();
            testObjforMove.move(DIRECTION.EAST);

            assertEquals(DIRECTION.EAST,testcharformove.directionProvided);
            assertEquals(testcharformove.STUBBED_NEW_POSITION, testcharformove.getPosition());
            assertEquals(testcharformove.STUBBED_NEW_POSITION.coordinates, testObjforMove.getStatus().currentPosition);



    }
}
