/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

import java.io.IOException;

public class kirim extends Thread {

    public void run() {

        try {
            for (int a = 1; a <= 20; a++) // genap
            {
                if (a % 2 != 0) {
                    System.out.println( a++ + " adalah bilangan ganjil ");
                    Thread.sleep(500);
                }
            }
        } catch (InterruptedException ie) {
        }

    }

    public static void main(String[] args) throws IOException {
        Thread ganjil = new kirim();
        ganjil.start();

    }
}

