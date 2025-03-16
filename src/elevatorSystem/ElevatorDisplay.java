package elevatorSystem;

public class ElevatorDisplay
{
    private int floor;
    private ElevatorDirection direction;

    public void setDisplay(int floor, ElevatorDirection direction)
    {
        this.floor = floor;
        this.direction = direction;
    }

    public void showDisplay()
    {
        System.out.println(floor);
        System.out.println(direction);
    }
}
