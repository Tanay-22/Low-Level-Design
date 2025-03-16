package elevatorSystem;

import java.util.ArrayList;
import java.util.List;

public class ElevatorCreator
{
    static List<ElevatorController> elevatorControllers = new ArrayList<>();

    static
    {
        ElevatorCar elevatorCar1 = new ElevatorCar();
        elevatorCar1.setId(1);
        ElevatorController controller1 = new ElevatorController(elevatorCar1);

        ElevatorCar elevatorCar2 = new ElevatorCar();
        elevatorCar1.setId(2);
        ElevatorController controller2 = new ElevatorController(elevatorCar2);

        elevatorControllers.add(controller1);
        elevatorControllers.add(controller2);
    }
}
