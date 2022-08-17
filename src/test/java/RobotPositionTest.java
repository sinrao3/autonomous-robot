import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RobotPositionTest {

    @Test
    void shouldInitialiseRobotInGivenPosition(){
        int x = 1, y = 2;

        RobotPosition robotPosition = new RobotPosition(x, y);

        assertEquals(x, robotPosition.x);
        assertEquals(y, robotPosition.y);
    }
    @Test
    void twoRobotsInSamePositionShouldNotBeSame(){
        int x = 1, y = 2;

        Robot robot = new Robot(x, y);
        Robot anotherRobot = new Robot(x, y);

        assertNotEquals(robot,anotherRobot);

    }
}
