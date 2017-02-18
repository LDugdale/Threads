package threaddemo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author philsmith
 */
public class TestHelloRunnable {
    
    public static void main(String[] args) {
       
        //Instantiate Runnable object
        HelloRunnable hr = new HelloRunnable();
        // Assign it as an argument to thread
        Thread t = new Thread(hr);
        // start thread
        t.start();

    }
    
}
