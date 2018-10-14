/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

public class WaitingThreadDead extends Thread {

    public void run() {
        System.out.println("I can count. watch me go !");
        System.out.print("This thread feels a little ill");
        try {
            Thread.sleep(500);
        } catch (InterruptedException ie) {
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread dying = new WaitingThreadDead();
        dying.start();

        System.out.println("Waiting for thread death");

        dying.join();
        System.out.println("Thread has died");
    }
}

