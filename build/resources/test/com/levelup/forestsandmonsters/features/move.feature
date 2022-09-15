Feature: Move in direction
![Gamer](images/gamerErin.png)

I want to move my character. If they attempt to move past the boundary, the move results in no chnage in position.


Scenario Outline:: Move in a direction
    Given the character starts at position with XCordinates <startingpostionX>
    And starts at Ycordinates <startingpositionY>
    And the player chooses to move in the <direction>
    When the character moves
    Then the character is now at position with XCoordinates <endingPositionX>
    And  the character is now at position with YCoordinates <endingPositionY>
    Examples:
        | startingpostionX | startingpositionY | direction | endingPositionX | endingPositionY |
        | 5 | 5 | NORTH | 5 | 6 |
        | 2 | 2 | SOUTH | 1 | 2 |
        

