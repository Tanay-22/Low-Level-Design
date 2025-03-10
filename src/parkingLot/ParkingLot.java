package parkingLot;

import parkingLot.model.ParkingSpot;
import parkingLot.model.Vehicle;
import parkingLot.model.VehicleType;

import java.time.Duration;
import java.time.LocalDateTime;

public class ParkingLot
{
    private ParkingSpot[][] parkingSpots;

    public ParkingLot()
    {
        this.initialize();
    }

    private void initialize()
    {
        parkingSpots = new ParkingSpot[10][10];
        for (int i = 0; i < 10; i++)
        {
            // 2 wheelers
            for (int j = 0; j < 5; j++)
            {
                parkingSpots[i][j] = new ParkingSpot(20, VehicleType.TWO_WHEELER);
            }
            // 4 wheelers
            for (int j = 5; j < 10; j++)
            {
                parkingSpots[i][j] = new ParkingSpot(50, VehicleType.FOUR_WHEELER);
            }
        }
    }

    public boolean enter(Vehicle vehicle)
    {
        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                if(parkingSpots[i][j].getVehicleType().equals(vehicle.getVehicleType()) && !parkingSpots[i][j].isOccupied())
                {
                    parkingSpots[i][j].setEntryTime(LocalDateTime.now());
                    parkingSpots[i][j].setVehicle(vehicle);
                    parkingSpots[i][j].setOccupied(true);
                    return true;
                }
            }
        }
        return false;
    }

    public double leave(Vehicle vehicle)
    {
        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                if(parkingSpots[i][j].isOccupied() && parkingSpots[i][j].getVehicle().equals(vehicle))
                {
                    Duration duration = Duration.between(parkingSpots[i][j].getEntryTime(), LocalDateTime.now());
                    parkingSpots[i][j].setVehicle(null);
                    parkingSpots[i][j].setEntryTime(null);
                    parkingSpots[i][j].setOccupied(false);
                    return duration.toSeconds() * parkingSpots[i][j].getPricePerHour(); // let seconds be hour
                }
            }
        }
        return -1.0;
    }
}
