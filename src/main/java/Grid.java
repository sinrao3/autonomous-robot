public class Grid {

    private int length;
    private int width;

    public Grid(int l, int w) {
        this.length=l;
        this.width=w;
    }

    public void moveForward(Robot robot) {
        switch(robot.robotDirection) {
            case NORTH: robot.robotPosition.x = robot.robotPosition.x + 1;break;
            case WEST:  robot.robotPosition.y = robot.robotPosition.y - 1;break;
            case SOUTH: robot.robotPosition.x = robot.robotPosition.x - 1;break;
            case EAST:  robot.robotPosition.y = robot.robotPosition.y + 1;break;
        }
    }

    public void rotateLeft(Robot robot) {
        Directions newDirection;
        if(robot.robotDirection== Directions.NORTH){
            newDirection= Directions.WEST;
        }
        else{
            newDirection= Directions.values()[robot.robotDirection.ordinal() - 1];
        }
        robot.robotDirection=newDirection;
    }

    public void rotateRight(Robot robot) {
        Directions newDirection;
        if(robot.robotDirection== Directions.WEST){
            newDirection= Directions.NORTH;
        }
        else{
            newDirection= Directions.values()[robot.robotDirection.ordinal() + 1];
        }
        robot.robotDirection=newDirection;
    }
}
