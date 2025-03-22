package abstractFactoryPattern.factory;

import abstractFactoryPattern.ToyotaCar;
import abstractFactoryPattern.Vehicle;

public class CarFactory extends VehicleFactory
{
    @Override
    public Vehicle createVehicle()
    {
        return new ToyotaCar();
    }
}