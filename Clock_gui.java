/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock_gui;

/**
 *
 * @author UAS
 */
public class Clock_gui {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Clock c=new Clock();
        Thread t=new Thread(c);
        t.start();
    }
    
}
