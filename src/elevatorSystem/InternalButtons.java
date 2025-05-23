package elevatorSystem;

public class InternalButtons
{
    private InternalDispatcher internalDispatcher;
    private int[] availableButtons;
    private int buttonSelected;

    public InternalButtons()
    {
        this.internalDispatcher = new InternalDispatcher();
        this.availableButtons = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    }

    void pressButton(int destination, ElevatorCar elevatorCar)
    {

        //1.check if destination is in the list of available floors

        //2.submit the request to the jobDispatcher
        internalDispatcher.submitInternalRequest(destination, elevatorCar);
    }

}
