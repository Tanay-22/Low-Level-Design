package elevatorSystem;

import java.util.List;

public class ExternalDispatcher
{
    private List<ElevatorController> elevatorControllers = ElevatorCreator.elevatorControllers;

    public void submitExternalRequest(int floor, ElevatorDirection direction)
    {
        for (ElevatorController elevatorController : elevatorControllers)
        {
            int elevatorID = elevatorController.getElevatorCar().getId();
            if (elevatorID % 2 == 1 && floor % 2 == 1)
            {
                elevatorController.submitExternalRequest(floor, direction);
            }
            else if (elevatorID % 2 == 0 && floor % 2 == 0)
            {
                elevatorController.submitExternalRequest(floor, direction);

            }
        }
    }
}
