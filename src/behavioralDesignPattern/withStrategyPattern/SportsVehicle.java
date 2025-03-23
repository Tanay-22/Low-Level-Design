package behavioralDesignPattern.withStrategyPattern;

import behavioralDesignPattern.withStrategyPattern.strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle
{
    public SportsVehicle()
    {
        super(new SportsDriveStrategy());
    }
}
