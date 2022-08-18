import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RobotDirectionTest {

    @Test
    void shouldBeAbleToInitialiseDirectionOfRobot(){
        RobotDirection robotDirection= new RobotDirection(Directions.NORTH);
        assertEquals(robotDirection.direction,Directions.NORTH);
    }

}
