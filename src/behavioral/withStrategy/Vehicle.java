package behavioral.withStrategy;

import behavioral.withStrategy.strategy.DriveStrategy;

public class Vehicle
{
    DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy)
    {
        this.driveStrategy = driveStrategy;
    }

    public void drive()
    {
        driveStrategy.drive();
    }
}
