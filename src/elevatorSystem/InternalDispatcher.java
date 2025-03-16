package elevatorSystem;

import java.util.List;

public class InternalDispatcher
{
    List<ElevatorController> elevatorControllerList = ElevatorCreator.elevatorControllers;

    public void submitInternalRequest(int floor, ElevatorCar elevatorCar)
    {

    }
}
