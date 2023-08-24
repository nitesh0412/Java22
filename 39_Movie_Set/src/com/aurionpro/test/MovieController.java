package com.aurionpro.test;

import com.aurionpro.manager.MovieManager;
import com.aurionpro.model.Movie;

public class MovieController {

    private MovieManager manager;

    public MovieController() {
        this.manager = new MovieManager();
    }

    public void addMovie(int id, String name, int year, String genre) {
        Movie movie = new Movie(id, name, year, genre);
        manager.addMovie(movie);
    }

    public static void main(String[] args) {
        MovieController movieController = new MovieController();
        movieController.addMovie(1, "Interstellar", 2014, "Science Fiction");
        movieController.addMovie(2, "temp", 2014, "Science");
        System.out.println("List Movies");
        System.out.println(movieController.manager.getMovies());
        
        
        movieController.manager.clearMovies();
    }
}
