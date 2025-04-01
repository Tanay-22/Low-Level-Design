package book_my_show.controller;

import book_my_show.model.enums.City;
import book_my_show.model.Movie;
import book_my_show.model.Show;
import book_my_show.model.Theatre;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TheatreController
{
    private final Map<City, List<Theatre>> cityWiseTheatres;
    private final List<Theatre> allTheatres;

    public TheatreController()
    {
        this.cityWiseTheatres = new HashMap<>();
        this.allTheatres = new ArrayList<>();
    }

    public void addTheatre(Theatre theatre, City city)
    {
        allTheatres.add(theatre);
        cityWiseTheatres.computeIfAbsent(city, k -> new ArrayList<>()).add(theatre);
    }

    public Map<Theatre, List<Show>> getAllShows(Movie movie, City city)
    {
        return cityWiseTheatres.getOrDefault(city, List.of()).stream()
                .map(theatre -> Map.entry(theatre, theatre.getShows().stream()
                        .filter(show -> show.getMovie().getId() == movie.getId())
                        .toList()))
                .filter(entry -> !entry.getValue().isEmpty())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    public List<Theatre> getTheatresByCity(City city)
    {
        return cityWiseTheatres.get(city);
    }
}
