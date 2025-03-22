package abstractFactoryPattern.factory;

import abstractFactoryPattern.FordTruck;
import abstractFactoryPattern.Vehicle;

public class TruckFactory extends VehicleFactory
{
    @Override
    public Vehicle createVehicle()
    {
        return new FordTruck();
    }
}