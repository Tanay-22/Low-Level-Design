package creationalDesignPattern.abstractFactoryPattern.factory;

import creationalDesignPattern.abstractFactoryPattern.FordTruck;
import creationalDesignPattern.abstractFactoryPattern.Vehicle;

public class TruckFactory extends VehicleFactory
{
    @Override
    public Vehicle createVehicle()
    {
        return new FordTruck();
    }
}