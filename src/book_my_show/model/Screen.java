package book_my_show.model;

import java.util.ArrayList;
import java.util.List;

public class Screen
{
    private int id;
    private final List<Seat> seats;

    public Screen()
    {
        this.seats = new ArrayList<>();
    }

    public int getId()
    {
        return id;
    }

    public List<Seat> getSeats()
    {
        return seats;
    }
}
