/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package threaddemo;

/**
 * class that extends Thread
 * output: simple statement
 * @author philsmith
 */
public class MyThread extends Thread{
	
    public void run(){
        System.out.println("This is an instance of a Thread that exends Thread (remember the s)");
    }
    
}