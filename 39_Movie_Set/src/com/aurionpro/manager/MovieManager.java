package com.aurionpro.manager;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import com.aurionpro.model.Movie;

public class MovieManager  {
	
	List<Movie> movies;
	
	static final String filepath = "D://Movie";
		
	public MovieManager()
	{   
		movies = new ArrayList<>();
		loadMovies();
	}
	
	public void loadMovies() {
		try {
			FileInputStream fileInputStream = new FileInputStream(filepath);
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			
			List<Movie> loadedMovies = (List<Movie>) objectInputStream.readObject();
			
			objectInputStream.close();
			
			movies.addAll(loadedMovies);
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void addMovie(Movie movie) {
		movies.add(movie);
		saveMovies();
	}
	
	private void saveMovies() {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(filepath);
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			
			objectOutputStream.writeObject(movies);
			
			objectOutputStream.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public List<Movie> getMovies() {
		//loadMovies();
		return movies;
	}
	
	 public void clearMovies() {
	        movies.clear();  
	        saveMovies();    
	    }
	 
	 public int getMovieId(String name) {
			for(  int i=0;i<this.movies.size();i++) {
				if(name.equals(this.movies.get(i).getName())) {
					return this.movies.get(i).getId();
					
				}
			}
			
			return -1;
		}
	
	
}
