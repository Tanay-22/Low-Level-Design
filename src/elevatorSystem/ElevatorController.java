package elevatorSystem;

import java.util.PriorityQueue;

public class ElevatorController
{
    private ElevatorCar elevatorCar;
    private PriorityQueue<Integer> upMinHeap;
    private PriorityQueue<Integer> downMaxHeap;

    public ElevatorCar getElevatorCar()
    {
        return elevatorCar;
    }

    public PriorityQueue<Integer> getUpMinHeap()
    {
        return upMinHeap;
    }

    public PriorityQueue<Integer> getDownMaxHeap()
    {
        return downMaxHeap;
    }

    public ElevatorController(ElevatorCar elevatorCar)
    {
        this.elevatorCar = elevatorCar;
        upMinHeap = new PriorityQueue<>();
        downMaxHeap = new PriorityQueue<>((x, y) -> y - x);
    }

    public void submitExternalRequest(int floor, ElevatorDirection direction)
    {
        if (direction == ElevatorDirection.UP)
        {
            upMinHeap.offer(floor);
        }
        else
        {
            downMaxHeap.offer(floor);
        }
    }

    public void submitInternalRequest(int floor)
    {

    }

    public void controlElevator()
    {
        while(true)
        {
            if(elevatorCar.getDirection() == ElevatorDirection.UP)
            {
            }
        }
    }

}
