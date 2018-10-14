
package praktikum;

public class ThreadUtama {
    public static void main(String[] args) {
        Thread ganjil = new kirim();
        Thread genap = new terima();
        ganjil.start();
        genap.start();
    }
}
