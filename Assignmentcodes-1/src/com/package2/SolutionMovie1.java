package com.package2;
import java.util.*;
public class SolutionMovie1 {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Movie1 movies[]=new Movie1[4];
        
        for(int i=0;i<4;i++) {
            int movieId=sc.nextInt();
            sc.nextLine();  
            String director=sc.nextLine();
            int rating=sc.nextInt();
            int budget=sc.nextInt();
            sc.nextLine();  
            movies[i]=new Movie1(movieId, director, rating, budget);
        }

        String director=sc.nextLine();
        int rating=sc.nextInt();
        int budget=sc.nextInt();
       

        double avgBudget=findAvgBudgetByDirector(movies, director);
        if(avgBudget>0) {
            System.out.println((int)avgBudget);
        } 
        else 
        {
            System.out.println("Sorry!The given director has not yet directed any movie");
        }

        Movie1 movie=getMovieByRatingBudget(movies, rating, budget);
        if (movie!=null) {
            System.out.println(movie.getMovieId());
        } else {
            System.out.println("Sorry - No movie is available with the specified rating and budget requirement");
        }
    }

    public static double findAvgBudgetByDirector(Movie1[] movieArray, String director) {
        int sumBudget = 0;
        int count = 0;
        for (Movie1 movie : movieArray) {
            if (movie.getDirector().equalsIgnoreCase(director)) {
                sumBudget += movie.getBudget();
                count++;
            }
        }
        if (count == 0) {
            return 0;
        }
        return (double) sumBudget / count;
    }

    public static Movie1 getMovieByRatingBudget(Movie1[] movieArray, int rating, int budget) {
        for (Movie1 movie : movieArray) {
            if (movie.getRating() == rating && movie.getBudget() == budget) {
                if (budget % rating == 0) {
                    return movie;
                }
            }
        }
        return null;
    }

}
/*1101
GVM
4
100
1201
Shankar
5
500
1301
Shankar
3
50
1401
GVM
5
300
GVM
5
300*/