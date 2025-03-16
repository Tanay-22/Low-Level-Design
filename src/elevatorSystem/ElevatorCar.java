package elevatorSystem;

public class ElevatorCar
{
    private int id;
    private ElevatorDisplay display;
    private int currentFloor;
    private ElevatorDirection direction;
    private ElevatorState state;
    private InternalButtons internalButtons;
    private ElevatorDoor door;

    public ElevatorCar()
    {
        display = new ElevatorDisplay();
        internalButtons = new InternalButtons();
        state = ElevatorState.IDLE;
        currentFloor = 0;
        direction = ElevatorDirection.UP;
        door = new ElevatorDoor();
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public int getCurrentFloor()
    {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor)
    {
        this.currentFloor = currentFloor;
    }

    public ElevatorDirection getDirection()
    {
        return direction;
    }

    public void setDirection(ElevatorDirection direction)
    {
        this.direction = direction;
    }

    public ElevatorState getState()
    {
        return state;
    }

    public void setState(ElevatorState state)
    {
        this.state = state;
    }

    public InternalButtons getInternalButtons()
    {
        return internalButtons;
    }

    public void setInternalButtons(InternalButtons internalButtons)
    {
        this.internalButtons = internalButtons;
    }

    public ElevatorDoor getDoor()
    {
        return door;
    }

    public void setDoor(ElevatorDoor door)
    {
        this.door = door;
    }

    public void showDisplay()
    {
        display.showDisplay();
    }

    public void pressButton(int destination)
    {
        internalButtons.pressButton(destination, this);
    }


    public void setDisplay()
    {
        this.display.setDisplay(currentFloor, direction);
    }

    public boolean moveElevator(int destinationFloor, ElevatorDirection direction)
    {
        int startFloor = currentFloor;
        if(direction == ElevatorDirection.UP)
        {
            for (int i = startFloor; i <= destinationFloor; i++)
            {
                this.currentFloor = startFloor;
                setDisplay();
                showDisplay();
                if (i == destinationFloor)
                    return true;
            }
        }
        else if (direction == ElevatorDirection.DOWN)
        {
            for (int i = startFloor; i>=destinationFloor; i--)
            {

                this.currentFloor = startFloor;
                setDisplay();
                showDisplay();
                if (i == destinationFloor)
                    return true;
            }
        }
        return false;
    }
}
