/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a;

/**
 *
 * @author Lenovo
 */
public class GREEN extends Thread{
    @Override
    public void run(){
       while(true){
        try{
            System.out.println("GREEN");
            Thread.sleep(5000);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
}
}