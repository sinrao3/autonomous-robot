public class Robot {
    private boolean isRobot;
    public RobotPosition robotPosition;
    public Directions robotDirection;

    public Robot() {
        this.isRobot=true;
    }

    public Robot(int x, int y) {
        this.isRobot=true;
        this.robotPosition= new RobotPosition(x,y);
    }

    public Robot(int x, int y,Directions directions) {
        this.isRobot=true;
        this.robotPosition= new RobotPosition(x,y);
        this.robotDirection= directions;
    }

    public boolean checkIfRobot() {
        if(this.isRobot==true)
            return true;
        return false;
    }

}
