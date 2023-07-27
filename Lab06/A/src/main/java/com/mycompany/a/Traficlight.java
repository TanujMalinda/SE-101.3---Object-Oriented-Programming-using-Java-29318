/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class Traficlight extends Thread{
   public void run(){
       try {
           Thread.sleep(2000);
       } catch (InterruptedException ex) {
           Logger.getLogger(Traficlight.class.getName()).log(Level.SEVERE, null, ex);
       }
       System.out.println("RED");
       try {
           Thread.sleep(3000);
       } catch (InterruptedException ex) {
           Logger.getLogger(Traficlight.class.getName()).log(Level.SEVERE, null, ex);
       }
       System.out.println("YELLOW");
       try {
           Thread.sleep(4000);
       } catch (InterruptedException ex) {
           Logger.getLogger(Traficlight.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
    
}
