package behavioralDesignPattern.withStrategyPattern;

import behavioralDesignPattern.withStrategyPattern.strategy.PassengerStrategy;

public class PassengerVehicle extends Vehicle
{
    public PassengerVehicle()
    {
        super(new PassengerStrategy());
    }
}
