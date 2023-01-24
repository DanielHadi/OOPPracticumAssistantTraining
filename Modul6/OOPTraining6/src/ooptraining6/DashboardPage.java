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
public class DashboardPage extends WebPage{

    public DashboardPage(String webTitle) {
        super(webTitle);
    }
    
    public void login (String username){
        this.loggedUsername = username;
        System.out.format("%s berhasil login ke halaman dashboard\n", this.loggedUsername);
    }
    
    protected void showMainPage(){
        if (this.loggedUsername == null){
            System.out.print("# Akses ditutup untuk user guest\t##\n");
            System.out.print("# Mohon login terlebih dahulu\t\t##\n");
        } else{
            System.out.format("# Dashboard Page - %s!\t##\n",this.loggedUsername);
            System.out.print("# Opsi-opsi page dashboard\t\t##\n");
            System.out.print("# dsb.\t\t\t\t\t##\n");
        }
    }
}
