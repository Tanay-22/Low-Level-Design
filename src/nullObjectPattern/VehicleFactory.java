package nullObjectPattern;

public class VehicleFactory
{
    static Vehicle getVehicleObject(String type)
    {
        if ("Car".equalsIgnoreCase(type))
        {
            return new Car();
        }
        else if ("Bike".equalsIgnoreCase(type))
        {
            return new Bike();
        }
//        return null;
        return new NullVehicle();
    }
}
