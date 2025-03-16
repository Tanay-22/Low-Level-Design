package elevatorSystem;

import java.util.List;

public class Building
{
    private List<Floor> floors;

    public Building(List<Floor> floors)
    {
        this.floors = floors;
    }

    public void addFloor(Floor newFloor)
    {
        floors.add(newFloor);
    }

    public void removeFloor(Floor floor)
    {
        floors.remove(floor);
    }

    public List<Floor> getAllFloorList()
    {
        return floors;
    }
}
