/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooptraining3;

import komponen.Movie;
import utama.MovieTheater;

/**
 *
 * @author Daniel P Suryahadi
 */
public class OOPTraining3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MovieTheater teater = new MovieTheater();
        Movie[] kumpulan_film = new Movie[2];
        kumpulan_film[0] = new Movie("Ultraman", 90);
        kumpulan_film[1] = new Movie("Kamen Rider", 75);
        
        teater.setMovies(kumpulan_film);
        teater.printAllMovieInfo();
    }
    
}
