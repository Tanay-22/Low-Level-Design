package parkingLot.model;

import java.time.LocalDateTime;

public class ParkingSpot
{
    private boolean isOccupied;
    private Vehicle vehicle;
    private final int pricePerHour;
    private final VehicleType vehicleType;
    private LocalDateTime entryTime;

    public ParkingSpot(int pricePerHour, VehicleType vehicleType)
    {
        this.pricePerHour = pricePerHour;
        this.vehicleType = vehicleType;
        this.isOccupied = false;
    }

    public boolean isOccupied()
    {
        return isOccupied;
    }

    public void setOccupied(boolean occupied)
    {
        isOccupied = occupied;
    }

    public Vehicle getVehicle()
    {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle)
    {
        this.vehicle = vehicle;
    }

    public int getPricePerHour()
    {
        return pricePerHour;
    }

    public VehicleType getVehicleType()
    {
        return vehicleType;
    }

    public LocalDateTime getEntryTime()
    {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime)
    {
        this.entryTime = entryTime;
    }
}
