/**
 * Pertemuan 05
 * [PR] program yang dapat menampilkan persegi yang dibuat dari bintang(*) disetiap sisi, dan angka random antara 0-9
 * untuk isi dari persegi, panjang sisi dibuat sesuai dengan jumlah inputan user.
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 20 Oktober 2024
 */
package pertemuan5.PR.PR05_2473021_JAVA;

import java.util.Random;
import java.util.Scanner;

public class A_Persegi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("==== PROGRAM PERSEGI ====");
        System.out.print("Input Sisi : ");
        int sisi = sc.nextInt();
        System.out.println("========= HASIL =========");

        for (int i = 1; i <= sisi; i++) {
            for (int j = 1; j <= sisi; j++) {
                if (i == 1 || j == 1 || i == sisi || j == sisi) {
                    System.out.print(" * ");
                } else {
                    int isi = rand.nextInt(10);
                    System.out.print(" " + isi + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
