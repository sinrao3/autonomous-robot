public class Robot {
    private boolean isRobot;
    public RobotPosition robotPosition;
    public Directions robotDirection;

    public Robot() {
        this.isRobot = true;
    }

    public Robot(int x, int y) {
        this.isRobot = true;
        this.robotPosition = new RobotPosition(x, y);
    }

    public Robot(int x, int y, Directions directions) {
        this.isRobot = true;
        this.robotPosition = new RobotPosition(x, y);
        this.robotDirection = directions;
    }

    public boolean checkIfRobot() {
        if (this.isRobot == true)
            return true;
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Robot robot = (Robot) o;

        if (isRobot != robot.isRobot) return false;
        if (robotPosition != null ? !robotPosition.equals(robot.robotPosition) : robot.robotPosition != null)
            return true;
        return robotDirection == robot.robotDirection;
    }

    @Override
    public int hashCode() {
        int result = (isRobot ? 1 : 0);
        result = 31 * result + (robotPosition != null ? robotPosition.hashCode() : 0);
        result = 31 * result + (robotDirection != null ? robotDirection.hashCode() : 0);
        return result;
    }
}
