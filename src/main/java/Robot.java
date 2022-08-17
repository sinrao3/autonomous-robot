public class Robot {
    private boolean isRobot;
    private RobotPosition robotPosition;

    public Robot() {
        this.isRobot=true;
    }

    public Robot(int x, int y) {
        this.isRobot=true;
        this.robotPosition= new RobotPosition(x,y);
    }

    public boolean checkIfRobot() {
        if(this.isRobot==true)
            return true;
        return false;
    }
}
