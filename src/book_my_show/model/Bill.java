package book_my_show.model;

public class Bill
{
    private final Booking booking;
    private double amount;

    public Bill(Booking booking)
    {
        this.booking = booking;
        calculateBill();
    }

    private void calculateBill()
    {
        this.booking.getSeats().stream().forEach(seat -> amount += seat.getSeatCategory().getPrice());
        amount = 1.12 * amount;
    }

    public double getAmount()
    {
        return amount;
    }

    public Booking getBooking()
    {
        return booking;
    }
}
