package com.package2;
import java.util.*;
public class SolutionMovie {
	public static Movie[] getMovieByGenre(Movie[] movieArray,String searchGenre) {
        ArrayList<Movie> matchedMovies=new ArrayList<>();
        for (Movie movie:movieArray) {
            if (movie.getGenre().equalsIgnoreCase(searchGenre)) {
                matchedMovies.add(movie);
            }
        }
        return matchedMovies.toArray(new Movie[0]);
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        Movie movies[]=new Movie[4];
        
        for (int i=0;i<4;i++) {
            String movieName=sc.nextLine();
            String company=sc.nextLine();
            String genre=sc.nextLine();
            int budget=sc.nextInt();
            sc.nextLine();
            movies[i] = new Movie(movieName,company,genre,budget);
        }

        String searchGenre=sc.nextLine();   
        Movie result[] = getMovieByGenre(movies, searchGenre);
        
        for (Movie movie:result) {
            if (movie.getBudget()>80000000) 
            {
                System.out.println("High Budget Movie");
            } 
            else 
            {
                System.out.println("Low Budget Movie");
            }

	}

}
}
/*
 * aaa
    Marvel
    Action
    250000000
    bbb
    Marvel
    Comedy
    25000000
    ccc
    Marvel
    Comedy
    2000000
    ddd
    Marvel
    Action
    300000000
    Action*/
