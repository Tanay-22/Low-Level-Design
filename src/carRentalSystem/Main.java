package carRentalSystem;


import carRentalSystem.product.Status;
import carRentalSystem.product.Vehicle;
import carRentalSystem.product.VehicleType;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        // Create users
        User user1 = new User();
        user1.setName("John Doe");
        user1.setDrivingLicense("DL12345");

        // Create vehicles
        Vehicle vehicle1 = new Vehicle();
        vehicle1.setId(1);
        vehicle1.setVehicleNumber("KA01AB1234");
        vehicle1.setCompanyName("Toyota");
        vehicle1.setModelName("Corolla");
        vehicle1.setVehicleType(VehicleType.CAR);
        vehicle1.setDailyRentalCost(1000);
        vehicle1.setHourlyRentalCost(100);
        vehicle1.setStatus(Status.AVAILABLE);

        // Create a store
        Store store1 = new Store();
        store1.setId(1);
        store1.setLocation(new Location("123 Main St", "Bangalore", "Karnataka", 560001));
        store1.setVehicles(new ArrayList<>(List.of(vehicle1)));

        // Create a vehicle rental system
        VehicleRentalSystem rentalSystem = new VehicleRentalSystem(new ArrayList<>(List.of(store1)), new ArrayList<>(List.of(user1)));

        // Create a reservation
        Reservation reservation = store1.createReservation(vehicle1, user1, LocalDate.now(), LocalDate.now().plusDays(2));
        reservation.setReservationType(ReservationType.DAILY);

        // Generate a bill
        Bill bill = new Bill(reservation);
        System.out.println("Total Bill Amount: " + bill.getTotalBillAmount());

        // Complete the reservation
        store1.completeReservation(reservation.getId());
    }
}
