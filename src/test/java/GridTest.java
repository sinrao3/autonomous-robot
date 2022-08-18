import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GridTest {
    @Test
    void shouldBeAbleToMoveRobotForwardByOneGridPoint(){
        Grid grid = new Grid(5,5);
        Robot robot = new Robot(1,1,Directions.NORTH);
        grid.moveForward(robot);
        assertEquals(2,robot.robotPosition.x);
        assertEquals(1,robot.robotPosition.y);
    }

    @Test
    void shouldBeAbleToRotateRobotToLeft(){
        Grid grid = new Grid(5,5);
        Robot robot = new Robot(1,1,Directions.NORTH);
        grid.rotateLeft(robot);
        assertEquals(Directions.WEST,robot.robotDirection);
    }

    @Test
    void shouldBeAbleToRotateRobotToRight(){
        Grid grid = new Grid(5,5);
        Robot robot = new Robot(1,1,Directions.NORTH);
        grid.rotateRight(robot);
        assertEquals(Directions.EAST,robot.robotDirection);
    }
}
