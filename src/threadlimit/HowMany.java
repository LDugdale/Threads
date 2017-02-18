/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package threadlimit;


public class HowMany {
    private static Object s = new Object();
    private static int count = 0;
    
    public static void main(String[] argv){
        while(true){
            new Thread(new Runnable(){
                    public void run(){
                        synchronized(s){
                            count += 1;
                            System.err.println("New thread #"+count);
                        }
                        while(true){
                            try {
                                Thread.sleep(1000);
                            } catch (Exception e){
                                System.err.println(e);
                                
                            }
                        }
                    }
                }).start();
        }
    }
}
