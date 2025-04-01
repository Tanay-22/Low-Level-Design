package book_my_show;

import book_my_show.controller.MovieController;
import book_my_show.controller.TheatreController;
import book_my_show.model.*;
import book_my_show.model.enums.City;
import book_my_show.model.enums.SeatCategory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BookMyShow
{
    private final MovieController movieController;
    private final TheatreController theatreController;

    public BookMyShow()
    {
        this.movieController = new MovieController();
        this.theatreController = new TheatreController();
    }

    public static void main(String[] args)
    {
        BookMyShow bookMyShow = new BookMyShow();
        bookMyShow.initialize();
    }

    private void initialize()
    {
        createMovies();
        createTheatre();
        simulateBooking(City.GORAKHPUR, "avengers");
    }

    private void createMovies()
    {
        Movie avengers = new Movie(1, "Avengers", 128);
        Movie bahubali = new Movie(2, "Bahubali", 180);

        movieController.addMovie(avengers, City.GORAKHPUR);
        movieController.addMovie(avengers, City.KANPUR);
        movieController.addMovie(bahubali, City.GURGAON);
        movieController.addMovie(bahubali, City.GORAKHPUR);
    }

    private void createTheatre()
    {
        Movie avenger = movieController.getMovieByName("Avengers");
        Movie bahubali = movieController.getMovieByName("Bahubali");

        Theatre inoxTheatre = new Theatre(1, City.GORAKHPUR);
        createScreen(inoxTheatre);
        theatreController.addTheatre(inoxTheatre, inoxTheatre.getCity());

        for (Screen screen : inoxTheatre.getScreens())
        {
            Show show1 = createShows(1, screen, avenger, 1200);
            Show show2 = createShows(2, screen, bahubali, 1500);
            inoxTheatre.getShows().add(show1);
            inoxTheatre.getShows().add(show2);
        }

    }

    private void createScreen(Theatre theatre)
    {
        for (int i = 0; i < 5; i++)
        {
            Screen screen = new Screen();
            createSeats(screen);
            theatre.getScreens().add(screen);
        }
    }

    private void createSeats(Screen screen)
    {
        for (int i = 0; i < 40; i++)
        {
            Seat seat = new Seat();
            seat.setId(i);
            seat.setSeatCategory(SeatCategory.SILVER);
            screen.getSeats().add(seat);
        }
        for (int i = 40; i < 70; i++)
        {
            Seat seat = new Seat();
            seat.setId(i);
            seat.setSeatCategory(SeatCategory.GOLD);
            screen.getSeats().add(seat);
        }
        for (int i = 70; i < 100; i++)
        {
            Seat seat = new Seat();
            seat.setId(i);
            seat.setSeatCategory(SeatCategory.PLATINUM);
            screen.getSeats().add(seat);
        }
    }

    private Show createShows(int showId, Screen screen, Movie movie, int showStartTime)
    {
        Show show = new Show();
        show.setId(showId);
        show.setScreen(screen);
        show.setMovie(movie);
        show.setShowStartTime(showStartTime);

        return show;
    }

    private void simulateBooking(City city, String movieName)
    {
        // 1. search movie by my location
        List<Movie> movies = movieController.getMoviesByCity(city);

        // 2. select the movie 
        Movie interestedMovie = movies.stream()
                .filter(movie -> movie.getName().equalsIgnoreCase(movieName))
                .findFirst()
                .get();

        // 3. get all shows of this movie in  user's city
        Map<Theatre, List<Show>> showsTheatreWise = theatreController.getAllShows(interestedMovie, city);

        // 4. select particular show user
        Map.Entry<Theatre, List<Show>> entry = showsTheatreWise.entrySet().iterator().next();
        List<Show> runningShows = entry.getValue();
        Show interestedShow = runningShows.get(0);

        // 5. select seat
        int seatNumber = 50;
        List<Integer> bookedSeats = interestedShow.getBookedSeatIds();
        if (!bookedSeats.contains(seatNumber))
        {
            bookedSeats.add(seatNumber);
            //startPayment
            List<Seat> myBookedSeats = new ArrayList<>();
            for (Seat screenSeat : interestedShow.getScreen().getSeats())
            {
                if (screenSeat.getId() == seatNumber)
                {
                    myBookedSeats.add(screenSeat);
                }
            }
            Booking booking = new Booking(20, interestedShow, myBookedSeats, new Payment(20));
            Bill bill = new Bill(booking);
            System.out.println("Bill - ₹" + bill.getAmount());
        }
        else
        {
            //throw exception
            System.out.println("seat already booked, try again");
        }
    }
}
