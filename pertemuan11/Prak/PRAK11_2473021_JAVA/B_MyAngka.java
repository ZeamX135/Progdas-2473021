/**
 * Pertemuan 11
 * [PRAKTIKUM]  program yang akan menerima masukan n-buah bilangan bulat lalu akan menampilkan
 * nilai terbesar, nilai terkecil dan nilai mean dari n-buah bilangan tersebut.
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 03 Desember 2024
 */
package pertemuan11.Prak.PRAK11_2473021_JAVA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class B_MyAngka {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> bilangan = new ArrayList<>();

        System.out.print("Jumlah bilangan: ");
        int jumlah = sc.nextInt();

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
            bilangan.add(sc.nextInt());
        }

        int besar = Collections.max(bilangan);
        int kecil = Collections.min(bilangan);
        double mean = hitungMean(bilangan);

        System.out.println("Terbesar : " + besar);
        System.out.println("Terkecil : " + kecil);
        System.out.println("Mean : " + mean);

        sc.close();
    }

    public static double hitungMean(ArrayList<Integer> bilangan) {
        int total = 0;
        for (int num : bilangan) {
            total += num;
        }
        return (double) total / bilangan.size();
    }
}
