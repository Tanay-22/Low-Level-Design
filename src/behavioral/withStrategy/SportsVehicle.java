package behavioral.withStrategy;

import behavioral.withStrategy.strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle
{
    public SportsVehicle()
    {
        super(new SportsDriveStrategy());
    }
}
