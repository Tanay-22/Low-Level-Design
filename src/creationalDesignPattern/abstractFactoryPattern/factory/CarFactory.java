package creationalDesignPattern.abstractFactoryPattern.factory;

import creationalDesignPattern.abstractFactoryPattern.ToyotaCar;
import creationalDesignPattern.abstractFactoryPattern.Vehicle;

public class CarFactory extends VehicleFactory
{
    @Override
    public Vehicle createVehicle()
    {
        return new ToyotaCar();
    }
}