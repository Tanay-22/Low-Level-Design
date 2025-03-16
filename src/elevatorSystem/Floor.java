package elevatorSystem;

public class Floor
{
    private int floorNumber;
    private ExternalDispatcher externalDispatcher;

    public Floor(int floorNumber)
    {
        this.floorNumber = floorNumber;
        externalDispatcher = new ExternalDispatcher();
    }

    public void pressButton(ElevatorDirection direction)
    {
        externalDispatcher.submitExternalRequest(floorNumber, direction);
    }
}
