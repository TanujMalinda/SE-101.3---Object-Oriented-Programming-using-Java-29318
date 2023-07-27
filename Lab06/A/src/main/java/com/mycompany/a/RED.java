/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a;

/**
 *
 * @author Lenovo
 */
public class RED extends Thread{
        @Override
        public void run(){
       while(true){
            try{
                  System.out.println("RED");
            Thread.sleep(10000);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
      
    }
    
}
}