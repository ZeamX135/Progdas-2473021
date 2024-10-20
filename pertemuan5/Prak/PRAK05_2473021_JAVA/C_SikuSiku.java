/**
 * Pertemuan 05
 * [PRAKTIKUM] program yang dapat menampilkan segitiga siku-siku yang terbuat dari bintang (*)
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 15 Oktober 2024
 */
package pertemuan5.Prak.PRAK05_2473021_JAVA;

import java.util.Scanner;

public class C_SikuSiku {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Tinggi : ");
        int tinggi = sc.nextInt();
        System.out.println("================================");
        System.out.println("Segitiga Siku-Siku Dengan Tinggi " + tinggi);

        for (int i = 1; i <= tinggi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
