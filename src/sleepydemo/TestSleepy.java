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
public class TestSleepy {
    
    public static void main(String[] args) throws InterruptedException {
        //create new instance of Sleepy
        Sleepy s = new Sleepy();
        // assign sleepy to thread
       Thread t = new Thread(s);
        // start thread
        t.start();
        //sleepy sleep for 2 seconds
        t.sleep(2000);
        // print message you are waking sleepy up
        System.out.println("Haha, I'm gonna wake ya");
        //print isinterrupted
        System.out.println(t.isInterrupted());
        // call interrupt on sleepy
        t.interrupt();
        //print isinterrupt
        System.out.println(t.isInterrupted());
        //print end of main
        System.out.println("END OF MAIN METHOD");
        // check how long sleepy has slept for (why 2001?)
        
        
    }
    
}
