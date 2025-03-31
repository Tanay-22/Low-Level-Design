package creational.abstractFactory;

import creational.abstractFactory.factory.CarFactory;
import creational.abstractFactory.factory.TruckFactory;
import creational.abstractFactory.factory.VehicleFactory;

public class Main
{
    public static void main(String[] args)
    {
        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.createVehicle();
        car.drive();
        car.stop();

        VehicleFactory truckFactory = new TruckFactory();
        Vehicle truck = truckFactory.createVehicle();
        truck.drive();
        truck.stop();
    }
}