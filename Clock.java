/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock_gui;

import java.awt.AWTEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowEvent;
import java.util.Date;

/**
 *
 * @author UAS
 */
public class Clock extends Frame implements Runnable{
    Label l1,l2,l3,l4,l5;
    
    
    
    
    Clock(){
    setTitle("Clock");
        setLayout(null);
        setSize(140,100);
        setVisible(true);
        setLocation(1000,300);
        this.setBackground(Color.gray);
    l1=new Label("",Label.CENTER);
    l1.setForeground(Color.white);
    l1.setBackground(Color.black);
    l1.setBounds(30, 60,25, 20);
    add(l1);
    
    l2=new Label(":",Label.CENTER);
    l2.setForeground(Color.white);
    l2.setBackground(Color.black);
    l2.setBounds(55, 60, 10,20);
    add(l2);
    
    l3=new Label("",Label.CENTER);
    l3.setForeground(Color.white);
    l3.setBackground(Color.black);
    l3.setBounds(65,60, 25, 20);
    add(l3);
    
    l4=new Label(":",Label.CENTER);
    l4.setForeground(Color.white);
    l4.setBackground(Color.black);
    l4.setBounds(90, 60,10, 20);
    add(l4);
    
    l5=new Label("",Label.CENTER);
    l5.setForeground(Color.white);
    l5.setBackground(Color.black);
    l5.setBounds(100,60,25,20);
    add(l5);
    
    Font f=new Font("Arial",Font.BOLD,20);
    l1.setFont(f);
    l2.setFont(f);
    l3.setFont(f);
    l4.setFont(f);
    l5.setFont(f);
    
    this.enableEvents(AWTEvent.WINDOW_EVENT_MASK);
    }
    @Override
    public void processWindowEvent(WindowEvent e){
        switch(e.getID()){
            case WindowEvent.WINDOW_CLOSING:
            System.exit(0);
            this.dispose();
        
    }
    
    }
    
    @Override
    public void run() {

while(true){
      try{
               Thread.sleep(1000);
               Date d=new Date();
              l1.setText(d.getHours()%12+"");
              l3.setText(d.getMinutes()+"");
              l5.setText(d.getSeconds()+"");
              
            }
            catch(Exception e){
                
            }
    
}
    }
    
}
