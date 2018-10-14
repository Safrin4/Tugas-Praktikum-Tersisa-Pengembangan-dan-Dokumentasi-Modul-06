/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

import java.io.IOException;

/**
 *
 * @author safrina
 */
public class No03_GanjilGenapBoolean extends Thread{
    int count = 1, last;
    boolean boolean_thread;

    public void setThread(boolean thread) {
        boolean_thread = thread;
    }

    public void run() {
        for (;;) {
            try {
                if (boolean_thread == true) {
                    count++;
                    this.last = count;

                    if (count % 2 == 0) {
                        System.out.print(count + "  ");
                    }
                } else if (boolean_thread == false) {
                    last--;
                    if (last % 2 != 0) {
                        System.out.print(last + "  ");
                    }
                }
                Thread.sleep(500);
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        No03_GanjilGenapBoolean counter = new No03_GanjilGenapBoolean();
        counter.start();
        
        counter.setThread(true);
        System.out.println("Bilangan Genap Increment");
        
        System.in.read();
        counter.resume();
        
        counter.setThread(false);
        System.out.println("Bilangan Ganjil Decrement");
        
        System.in.read();
        counter.stop();
    }
}

