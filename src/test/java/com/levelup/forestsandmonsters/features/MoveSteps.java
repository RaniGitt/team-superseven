package com.levelup.forestsandmonsters.features;

import com.levelup.forestsandmonsters.GameController;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.awt.Point;

public class MoveSteps {

@Given("the character starts at position with XCordinates {int}")
public void givenTheCharacterStartsAtX(int startX) {
    this.startX = startX;
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

@Given("starts at Ycordinates {int}")
public void givenTheCharacterStartsAtY(int startY) {
    this.startY=startY;
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

@Given("the player chooses to move in the {word}")
public void givenPlayerChooseDirection(String direction) {

    this.direction=GameController.DIRECTION.valueOf(direction);
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}
@When("the character moves")
public void theCharacterMoves() {
    gc = new GameController();
    gc.setCharacterPosition(new Point(this.startX,this.startY));
    gc.move(this.direction);
    GameController.GameStatus status = gc.getStatus();
    this.currentPosition = status.currentPosition;
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}
@Then("the character is now at position with XCoordinates {int}")
public void checkXCoordinates(int endX) {
    //assertNotNull("Expected position not null",this.currentPosition);
    assertNotNull(this.currentPosition,"Expected position not Null");
    assertEquals(endX, this.currentPosition.x);
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}
@Then("the character is now at position with YCoordinates {int}")
public void checkYCoordinates(int endY) {
    assertNotNull(this.currentPosition,"Expected position not Null");
    assertEquals(endY, this.currentPosition.y);
    System.out.println("Running assertions>>>>>>>>>>>>>>.");
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}
    GameController gc;
    int startX, startY, endX, endY;
    GameController.DIRECTION direction;
    Point currentPosition;



    
}
