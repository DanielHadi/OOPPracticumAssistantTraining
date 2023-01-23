/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package komponen;

/**
 *
 * @author Daniel P Suryahadi
 */
public class Movie {
    private String title;
    private int duration;
    
    public Movie(String judul, int durasi){
        this.title = judul;
        this.duration = durasi;
    }
    
    public void setTitle(String judul){
        this.title = judul;
    }
    
    public void setDuration(int durasi){
        this.duration = durasi;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public int getDuration(){
        return this.duration;
    }
    
    private double calculatePrice(){
        if (this.duration > 150){
            return 50000;
        } else if (this.duration >= 90 && this.duration <= 150){
            return 40000;
        } else {
            return 30000;
        }
    }
    
    public void printMovieInfo(){
        System.out.format("Film dengan judul %s memiliki harga tiket %.1f", this.title, this.calculatePrice());
    }
}
