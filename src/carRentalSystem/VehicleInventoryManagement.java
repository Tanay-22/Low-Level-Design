package carRentalSystem;

import carRentalSystem.product.Vehicle;

import java.util.List;

public class VehicleInventoryManagement
{
    private List<Vehicle> vehicles;
    // CRUD

    public VehicleInventoryManagement(List<Vehicle> vehicles)
    {
        this.vehicles = vehicles;
    }

    public List<Vehicle> getVehicles()
    {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles)
    {
        this.vehicles = vehicles;
    }
}
