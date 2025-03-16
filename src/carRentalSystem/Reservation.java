package carRentalSystem;

import carRentalSystem.product.Vehicle;

import java.time.LocalDate;

public class Reservation
{
    private int id;
    private User user;
    private Vehicle vehicle;
    private LocalDate bookingDate;
    private LocalDate bookedFrom;
    private LocalDate bookedTill;
    private Location pickUpLocation;
    private Location dropOffLocation;
    private ReservationType reservationType;
    private ReservationStatus reservationStatus;

    public Reservation(User user, Vehicle vehicle)
    {
        this.user = user;
        this.vehicle = vehicle;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }

    public Vehicle getVehicle()
    {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle)
    {
        this.vehicle = vehicle;
    }

    public LocalDate getBookingDate()
    {
        return bookingDate;
    }

    public void setBookingDate(LocalDate bookingDate)
    {
        this.bookingDate = bookingDate;
    }

    public LocalDate getBookedFrom()
    {
        return bookedFrom;
    }

    public void setBookedFrom(LocalDate bookedFrom)
    {
        this.bookedFrom = bookedFrom;
    }

    public LocalDate getBookedTill()
    {
        return bookedTill;
    }

    public void setBookedTill(LocalDate bookedTill)
    {
        this.bookedTill = bookedTill;
    }

    public Location getPickUpLocation()
    {
        return pickUpLocation;
    }

    public void setPickUpLocation(Location pickUpLocation)
    {
        this.pickUpLocation = pickUpLocation;
    }

    public Location getDropOffLocation()
    {
        return dropOffLocation;
    }

    public void setDropOffLocation(Location dropOffLocation)
    {
        this.dropOffLocation = dropOffLocation;
    }

    public ReservationType getReservationType()
    {
        return reservationType;
    }

    public void setReservationType(ReservationType reservationType)
    {
        this.reservationType = reservationType;
    }

    public ReservationStatus getReservationStatus()
    {
        return reservationStatus;
    }

    public void setReservationStatus(ReservationStatus reservationStatus)
    {
        this.reservationStatus = reservationStatus;
    }
}
