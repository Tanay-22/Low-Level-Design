package book_my_show.controller;

import book_my_show.model.enums.City;
import book_my_show.model.Movie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieController
{
    private final Map<City, List<Movie>> cityWiseMovies;
    private final List<Movie> allMovies;

    public MovieController()
    {
        this.cityWiseMovies = new HashMap<>();
        this.allMovies = new ArrayList<>();
    }

    public void addMovie(Movie movie, City city)
    {
        allMovies.add(movie);
        cityWiseMovies.computeIfAbsent(city, k -> new ArrayList<>()).add(movie);
    }

    public Movie getMovieByName(String movieName)
    {
        // can apply trie for search
        for (Movie movie: allMovies)
        {
            if (movie.getName().equalsIgnoreCase(movieName))
                return movie;
        }
        return null;
    }

    public List<Movie> getMoviesByCity(City city)
    {
        return cityWiseMovies.get(city);
    }
}
