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
public abstract class WebPage implements Loginable {
    private String webTitle;
    protected String loggedUsername;

    public WebPage(String webTitle) {
        this.webTitle = webTitle;
    }
    
    protected void showHeader(){
        System.out.print("####################\n");
        System.out.format("### %s             ##\n",this.webTitle);
        System.out.print("#-----------------##\n");
    }
    
    protected abstract void showMainPage();
    
    protected void showFooter(){
        System.out.print("#-----------------##\n");
        System.out.print("# Created by Daniel             ##\n");
        System.out.print("####################\n");
    }
    
    public void showFullPage(){
        this.showHeader();
        this.showMainPage();
        this.showFooter();
    }
}
