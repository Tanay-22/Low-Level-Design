package carRentalSystem.product;

import java.time.LocalDate;

public class Vehicle
{
    private int id;
    private String vehicleNumber;
    private String companyName;
    private String modelName;
    private VehicleType vehicleType;
    private long kmDriven;
    private LocalDate manufacturingDate;
    private int average;
    private int cc;
    private int dailyRentalCost;
    private int hourlyRentalCost;
    private int noOfSeats;
    private Status status;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getVehicleNumber()
    {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber)
    {
        this.vehicleNumber = vehicleNumber;
    }

    public String getCompanyName()
    {
        return companyName;
    }

    public void setCompanyName(String companyName)
    {
        this.companyName = companyName;
    }

    public String getModelName()
    {
        return modelName;
    }

    public void setModelName(String modelName)
    {
        this.modelName = modelName;
    }

    public VehicleType getVehicleType()
    {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType)
    {
        this.vehicleType = vehicleType;
    }

    public long getKmDriven()
    {
        return kmDriven;
    }

    public void setKmDriven(long kmDriven)
    {
        this.kmDriven = kmDriven;
    }

    public LocalDate getManufacturingDate()
    {
        return manufacturingDate;
    }

    public void setManufacturingDate(LocalDate manufacturingDate)
    {
        this.manufacturingDate = manufacturingDate;
    }

    public int getAverage()
    {
        return average;
    }

    public void setAverage(int average)
    {
        this.average = average;
    }

    public int getCc()
    {
        return cc;
    }

    public void setCc(int cc)
    {
        this.cc = cc;
    }

    public int getDailyRentalCost()
    {
        return dailyRentalCost;
    }

    public void setDailyRentalCost(int dailyRentalCost)
    {
        this.dailyRentalCost = dailyRentalCost;
    }

    public int getHourlyRentalCost()
    {
        return hourlyRentalCost;
    }

    public void setHourlyRentalCost(int hourlyRentalCost)
    {
        this.hourlyRentalCost = hourlyRentalCost;
    }

    public int getNoOfSeats()
    {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats)
    {
        this.noOfSeats = noOfSeats;
    }

    public Status getStatus()
    {
        return status;
    }

    public void setStatus(Status status)
    {
        this.status = status;
    }
}
