/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;
import java.io.IOException;

public class InteruptingThread extends Thread{

    public void run(){
        System.out.println("i feel sleepy. wake me in eight hours");
        try{
            Thread.sleep(1000*60*60*8);
            System.out.println("That was a nap nice");
        }catch(InterruptedException ie){
            System.err.println("just five more minnutes");
        }
    }
    public static void main(String[] args) throws IOException {
        Thread sleepy = new InteruptingThread();
        sleepy.start();

        System.out.println("press enter to interrupt the thread");
        System.in.read();

        sleepy.interrupt();
    }
}
