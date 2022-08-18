public class Game {

    public Grid grid;
    public Robot robot;

    public Game(Grid grid, Robot robot) {
        this.grid = grid;
        this.robot = robot;
    }

    public void control(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'L') {
                grid.rotateLeft(robot);
            } else if (string.charAt(i) == 'R') {
                grid.rotateRight(robot);
            } else if (string.charAt(i) == 'M') {
                grid.moveForward(robot);
            }
        }

    }
}
