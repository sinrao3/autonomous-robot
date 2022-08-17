import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RobotTest {

    @Test
    void shouldBeAbleToInitialiseNewRobot(){
        Robot robot = new Robot();
        assertTrue(robot.checkIfRobot());
    }

}

