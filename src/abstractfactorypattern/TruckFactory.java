package abstractfactorypattern;

public class TruckFactory extends VehicleFactory
{
    @Override
    public Vehicle createVehicle()
    {
        return new FordTruck();
    }
}