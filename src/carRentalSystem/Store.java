    package carRentalSystem;

    import carRentalSystem.product.Vehicle;

    import java.time.LocalDate;
    import java.util.ArrayList;
    import java.util.Iterator;
    import java.util.List;

    public class Store
    {
        private int id;
        private VehicleInventoryManagement vehicleInventoryManagement;
        private Location location;
        private List<Reservation> reservations;

        public Store()
        {
            reservations = new ArrayList<>();
        }

        public int getId()
        {
            return id;
        }

        public void setId(int id)
        {
            this.id = id;
        }
        public List<Vehicle> getVehicles()
        {
            return vehicleInventoryManagement.getVehicles();
        }

        public void setVehicles(List<Vehicle> vehicles)
        {
            vehicleInventoryManagement = new VehicleInventoryManagement(vehicles);
        }

        public Reservation createReservation(Vehicle vehicle, User user, LocalDate from, LocalDate till)
        {
            Reservation reservation = new Reservation(user, vehicle);
            reservation.setBookingDate(LocalDate.now());
            reservation.setBookedFrom(from);
            reservation.setBookedTill(till);
            reservations.add(reservation);

            return reservation;
        }

        public Location getLocation()
        {
            return location;
        }

        public void setLocation(Location location)
        {
            this.location = location;
        }

        public List<Reservation> getReservations()
        {
            return reservations;
        }

        public void setReservations(List<Reservation> reservations)
        {
            this.reservations = reservations;
        }

        public boolean completeReservation(int reservationId)
        {
            // take out the reservation from the list and call complete the reservation method
            Iterator<Reservation> iterator = reservations.iterator();
            while (iterator.hasNext())
            {
                Reservation reservation = iterator.next();
                if (reservation.getId() == reservationId)
                {
                    reservation.setReservationStatus(ReservationStatus.COMPLETED);
                    iterator.remove();
                    return true;
                }
            }
            return false;
        }
    }
