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
public class terima extends Thread {

    public void run() {

        try {
            System.out.print("");
            for (int a = 1; a <= 20; a++) // genap
            {
                if (a % 2 == 0) {
                    System.out.println( a++ + " adalah bilangan genap");
                    Thread.sleep(500);
                }
            }
        } catch (InterruptedException ie) {
        }
    }

    public static void main(String[] args) throws IOException {
        Thread genap = new terima();
        genap.start();

    }
}


