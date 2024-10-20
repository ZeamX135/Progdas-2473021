/**
 * Pertemuan 05
 * [PR]  program bentuk pola silang dengan bintang (*) yang panjang garisnya menyesuaikan
 * dengan inputan user
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 20 Oktober 2024
 */
package pertemuan5.PR.PR05_2473021_JAVA;

import java.util.Scanner;

public class B_Silang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==== PROGRAM SILANG ====");
        System.out.print("Input Tinggi : ");
        int tinggi = sc.nextInt();
        System.out.println("========= HASIL ========");

        for (int i = 1; i <= tinggi; i++) {
            for (int j = 1; j <= tinggi; j++) {
                if (j == i || j == tinggi - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
