import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class GameTest {

    @Test
    void shouldBeAbleToControlRobotMovements() {
        Grid grid = new Grid(5, 5);
        Robot robot = new Robot(1, 2, Directions.NORTH);
        Game game = new Game(grid, robot);
        Robot finalRobot = new Robot(1, 3, Directions.NORTH);
        String string = "LMLMLMLMM";

        game.control(string);

        assertEquals(finalRobot, robot);
    }

    @Test
    void shouldBeAbleToControlAnotherRobotMovements() {
        Grid grid = new Grid(5, 5);
        Robot robot = new Robot(3, 3, Directions.EAST);
        Game game = new Game(grid, robot);
        Robot finalRobot = new Robot(5, 1, Directions.EAST);
        String string = "MMRMMRMRRM";

        game.control(string);

        assertEquals(finalRobot, robot);
    }

}
