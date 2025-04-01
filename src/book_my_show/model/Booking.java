package book_my_show.model;

import java.util.List;

public class Booking
{
    private final int id;
    private final Show show;
    private final List<Seat> seats;
    private final Payment payment;

    public Booking(int id, Show show, List<Seat> seats, Payment payment)
    {
        this.id = id;
        this.show = show;
        this.seats = seats;
        this.payment = payment;
    }

    public int getId()
    {
        return id;
    }

    public Show getShow()
    {
        return show;
    }

    public List<Seat> getSeats()
    {
        return seats;
    }

    public Payment getPayment()
    {
        return payment;
    }
}
