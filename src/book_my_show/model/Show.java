package book_my_show.model;

import java.util.ArrayList;
import java.util.List;

public class Show
{
    private int id;
    private Movie movie;
    private Screen screen;
    private int showStartTime;
    private final List<Integer> bookedSeatIds;

    public Show()
    {
        bookedSeatIds = new ArrayList<>();
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public Movie getMovie()
    {
        return movie;
    }

    public void setMovie(Movie movie)
    {
        this.movie = movie;
    }

    public Screen getScreen()
    {
        return screen;
    }

    public void setScreen(Screen screen)
    {
        this.screen = screen;
    }

    public int getShowStartTime()
    {
        return showStartTime;
    }

    public void setShowStartTime(int showStartTime)
    {
        this.showStartTime = showStartTime;
    }

    public List<Integer> getBookedSeatIds()
    {
        return bookedSeatIds;
    }
}