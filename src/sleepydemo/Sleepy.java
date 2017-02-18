/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sleepydemo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author philsmith
 */
public class Sleepy implements Runnable {

    @Override
    public void run() {
        
        // get System's current time in milliseconds
        long startTime = System.currentTimeMillis();
        //notify user that sleepy is going to sleep for 5 seconds
        System.out.println("Sleepy: I'm tired....");
        try {
            // try: thread sleep for 5 seconds
            Thread.sleep(5000);
            // catch: calculate now time - startime
            
            // print how long sleepy has been asleep
            
            // print funny message
            
            // after catch print awake message
        } catch (InterruptedException ex) {
            long sleepTime = System.currentTimeMillis() - startTime;
            System.out.println(sleepTime);
            System.out.println("You woke me, you swine.");
        }
        
       
    }
    
    
    
}
