/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package threaddemo;

/**
 * class that implements Runnable
 * prints a simple statement
 * @author philsmith
 */
public class HelloRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("This is a Thread that implements Runnable");
    }

  
    
}
