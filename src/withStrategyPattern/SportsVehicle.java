package withStrategyPattern;

import withStrategyPattern.strategy.DriveStrategy;
import withStrategyPattern.strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle
{
    public SportsVehicle()
    {
        super(new SportsDriveStrategy());
    }
}
