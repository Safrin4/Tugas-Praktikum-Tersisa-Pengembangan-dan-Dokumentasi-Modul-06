/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

/**
 *
 * @author LAB_TI
 */
public class RunnableUtama implements Runnable {

    public static void main(String[] args) {
        
        Runnable run = (Runnable) new kirim_runnable();
        Thread ganjil = new Thread(run);
        ganjil.start();

        Runnable run2 = (Runnable) new terima_runnable();
        Thread genap = new Thread(run2);
        genap.start();
    }

    public void run() {
        System.out.println("");
    }
}

