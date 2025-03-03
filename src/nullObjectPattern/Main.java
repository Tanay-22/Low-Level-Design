package nullObjectPattern;

public class Main
{
    public static void main(String[] args)
    {
        Vehicle car = VehicleFactory.getVehicleObject("Car");
        Vehicle bike = VehicleFactory.getVehicleObject("Bike");
        Vehicle boat = VehicleFactory.getVehicleObject("Boat");

        printVehicleDetails(car);
        printVehicleDetails(bike);
        printVehicleDetails(boat);

    }

    private static void printVehicleDetails(Vehicle vehicle)
    {
        System.out.println("Seating Capacity: " + vehicle.getSeatingCapacity());
        System.out.println("Fuel Tank Capacity: " + vehicle.getTankCapacity());
    }
}
