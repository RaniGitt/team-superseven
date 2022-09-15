Feature: Move in a direction 
    
I want to move my character. If they attempt to 
move past a boundary, the move results in no change in position.
    
<img src="images/sbe.png" width="300">

Scenario Outline: Move in a direction
    Given the character starts at position with XCoordinates <startingPositionX> 
    And starts at YCoordinates <startingPositionY>
    And the player choses to move in <direction>
    When the character moves
    Then the character is now at position with XCoordinates <endingPositionX>
    And YCoordinates <endingPositionY>
    Examples:
        | startingPositionX | startingPositionY | direction | endingPositionX | endingPositionY |
        | 0 | 0 | NORTH | 0 | 1 |
        | 0 | 0 | SOUTH | 0 | 0 |
        | 0 | 0 | WEST  | 0 | 0 |
        | 5 | 7 | EAST  | 6 | 7 |
        | 5 | 3 | WEST  | 4 | 3 | 
        | 9 | 3 | WEST  | 8 | 3 |
        | 9 | 3 | EAST  | 9 | 3 |
        | 3 | 9 | NORTH | 3 | 9 |
        | 3 | 9 | SOUTH | 3 | 8 |