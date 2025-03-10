package parkingLot;

import parkingLot.model.Vehicle;
import parkingLot.model.VehicleType;

public class Main
{
    public static void main(String[] args) throws InterruptedException
    {
        ParkingLot parkingLot = new ParkingLot();

        // Create vehicles
        Vehicle bike = new Vehicle("MH12AB1234", VehicleType.TWO_WHEELER);
        Vehicle car = new Vehicle("MH14XY5678", VehicleType.FOUR_WHEELER);

        // Vehicle entering
        System.out.println("Bike trying to enter...");
        boolean bikeEntry = parkingLot.enter(bike);
        System.out.println("Bike entry successful? " + bikeEntry);

        System.out.println("Car trying to enter...");
        boolean carEntry = parkingLot.enter(car);
        System.out.println("Car entry successful? " + carEntry);

        // Simulate parking time
        System.out.println("\nVehicles are parked for 3 seconds to simulate time...");
        Thread.sleep(3000); // Simulates the vehicle being parked for 3 seconds

        // Vehicle leaving and calculating bill
        System.out.println("\nBike trying to leave...");
        double bikeCharge = parkingLot.leave(bike);
        if (bikeCharge >= 0)
        {
            System.out.printf("Bike parked. Please pay: ₹%.2f\n", bikeCharge);
        }
        else
        {
            System.out.println("Bike not found!");
        }

        System.out.println("\nCar trying to leave...");
        double carCharge = parkingLot.leave(car);
        if (carCharge >= 0)
        {
            System.out.printf("Car parked. Please pay: ₹%.2f\n", carCharge);
        }
        else
        {
            System.out.println("Car not found!");
        }
    }
}

