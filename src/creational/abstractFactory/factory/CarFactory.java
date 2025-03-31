package creational.abstractFactory.factory;

import creational.abstractFactory.ToyotaCar;
import creational.abstractFactory.Vehicle;

public class CarFactory extends VehicleFactory
{
    @Override
    public Vehicle createVehicle()
    {
        return new ToyotaCar();
    }
}