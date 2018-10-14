/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

import java.io.IOException;

/**
 *
 * @author LAB_TI
 */
public class StoppingThread extends Thread {

    public void run() {
        int count = 1;
        System.out.println("I can count. watch me go !");
        for (;;) {
            System.out.print(count++ + " ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException ie) {
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        Thread counter = new StoppingThread();
        counter.start();
        
        System.out.println(
                "press enter to interrupt the thread");
        System.in.read();

        counter.stop();
    }
}

