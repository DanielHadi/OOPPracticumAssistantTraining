/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utama;

import komponen.Movie;

/**
 *
 * @author Daniel P Suryahadi
 */
public class MovieTheater {
    private Movie[] movies;
    
    public void setMovies(Movie[] film){
        this.movies = film;
    }
    
    public Movie[] getMovies(){
        return this.movies;
    }
    
    public void printAllMovieInfo(){
        for (int i = 0; i < movies.length; i++){
            System.out.format("Film #%d: %s dengan durasi %d menit\n",i,movies[i].getTitle(),movies[i].getDuration());
            movies[i].printMovieInfo();
            System.out.println();
        }
    }
}
