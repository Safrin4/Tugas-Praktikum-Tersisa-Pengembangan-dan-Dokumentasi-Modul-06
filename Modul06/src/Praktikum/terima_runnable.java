/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

public class terima_runnable implements Runnable {

    public void run() {
        for (int a = 1; a <= 20; a++) // genap
        {
            if (a % 2 == 0) {
                System.out.println(a++ + " adalah bilangan genap ");
            }
        }
    }

    public static void main(String[] args) {

        Runnable run = (Runnable) new RunnableThread();

        Thread genap = new Thread(run);
        genap.start();
    }
}
