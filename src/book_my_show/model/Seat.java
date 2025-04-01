package book_my_show.model;

import book_my_show.model.enums.SeatCategory;

public class Seat
{
    private int id;
    private int row;
    private SeatCategory seatCategory;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public int getRow()
    {
        return row;
    }

    public void setRow(int row)
    {
        this.row = row;
    }

    public SeatCategory getSeatCategory()
    {
        return seatCategory;
    }

    public void setSeatCategory(SeatCategory seatCategory)
    {
        this.seatCategory = seatCategory;
    }
}
