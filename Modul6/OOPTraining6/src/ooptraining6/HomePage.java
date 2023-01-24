/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooptraining6;

/**
 *
 * @author Daniel P Suryahadi
 */
public class HomePage extends WebPage {

    public HomePage(String webTitle) {
        super(webTitle);
    }
    
    public void login (String username){
        this.loggedUsername = username;
        System.out.format("Selamat datang di halaman home, %s\n", this.loggedUsername);
    }
    
    protected void showMainPage(){
        if (this.loggedUsername == null){
            System.out.print("# Selamat datang\t\t\t##\n");
            System.out.print("# Anda sedang berada di home page\t##\n");
            System.out.print("# Ini penjelasan umum home page\t\t##\n");
        } else{
            System.out.format("# Selamat datang, %s!\t\t##\n",this.loggedUsername);
            System.out.print("# Anda sedang berada di home page\t##\n");
            System.out.print("# Ini penjelasan khusus home page\t##\n");
        }
    }
}
