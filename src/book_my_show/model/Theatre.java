package book_my_show.model;

import book_my_show.model.enums.City;

import java.util.ArrayList;
import java.util.List;

public class Theatre
{
    private final int id;
    private final City city;
    private final List<Screen> screens;
    private final List<Show> shows;

    public Theatre(int id, City city)
    {
        this.id = id;
        this.city = city;
        this.screens = new ArrayList<>();
        this.shows = new ArrayList<>();
    }

    public int getId()
    {
        return id;
    }

    public City getCity()
    {
        return city;
    }

    public List<Screen> getScreens()
    {
        return screens;
    }

    public List<Show> getShows()
    {
        return shows;
    }
}