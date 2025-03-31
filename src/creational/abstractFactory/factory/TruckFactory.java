package creational.abstractFactory.factory;

import creational.abstractFactory.FordTruck;
import creational.abstractFactory.Vehicle;

public class TruckFactory extends VehicleFactory
{
    @Override
    public Vehicle createVehicle()
    {
        return new FordTruck();
    }
}