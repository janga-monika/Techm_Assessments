package com.package2;

public class Movie1 {

	private int movieId;
    private String director;
    private int rating;
    private int budget;

    public Movie1(int movieId,String director,int rating,int budget) {
        this.movieId = movieId;
        this.director = director;
        this.rating = rating;
        this.budget = budget;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId=movieId;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director=director;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating=rating;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget=budget;
    }
	
}
