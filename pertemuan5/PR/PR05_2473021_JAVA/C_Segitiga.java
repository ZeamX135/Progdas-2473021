/**
 * Pertemuan 05
 * [PR]  program bentuk pola segitiga sama kaki dengan bintang (*) yang tinggi segitiganya
 * menyesuaikan dengan inputan user.
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 20 Oktober 2024
 */
package pertemuan5.PR.PR05_2473021_JAVA;

import java.util.Scanner;

public class C_Segitiga {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==== SEGITIGA SAMA SISI ====");
        System.out.print("Input Tinggi: ");
        int tinggi = sc.nextInt();
        System.out.println("========== Hasil ==========");

        for (int i = 1; i <= tinggi; i++) {
            for (int j = i; j < tinggi; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
