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
public class SleepDemo {
    
    public static void main(String[] args) throws InterruptedException {
        
        // create an array of important information
       String importantInfo [] = {"Go to school", "Get good grades", "wear clothes"};
        // create a for loop to loop and print contents of array
        for (int i = 0; i < importantInfo.length; i++){
            System.out.println(importantInfo[i]);
            Thread.sleep(5000);
        }
        // in loop, pause the thread of execution
    }
    
}
