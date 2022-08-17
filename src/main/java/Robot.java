public class Robot {
    private boolean isRobot;

    public Robot() {
        this.isRobot=true;
    }

    public boolean checkIfRobot() {
        if(this.isRobot==true)
            return true;
        return false;
    }
}
