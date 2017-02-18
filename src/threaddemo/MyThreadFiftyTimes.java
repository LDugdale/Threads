/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package threaddemo;

/**
 *
 * @author philsmith
 */
public class MyThreadFiftyTimes extends Thread {
    
    public void run(){
        // loop and print 50 times
        for (int i= 0; i< 50; i++){
            System.out.println("I am the thread, loop " +  i);
    }
    }
    
    public static void main(String[] args) throws InterruptedException {
        
        // instantiate mythread object
        MyThreadFiftyTimes mt = new MyThreadFiftyTimes();
        // start thread
        mt.start();
        mt.join();
        // create for loop to print something else out 50 times
        for (int x = 0; x < 50; x++){
            System.out.println("LOLZ " + x);
        }
    }
    
}
