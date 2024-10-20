/**
 * Pertemuan 05
 * [PRAKTIKUM] aplikasi yang menampilkan deret bilangan, dimana jarak antar bilangan akan selalu
 * ditambahkan dan panjang deret bilangan berdasarkan angka yang dimasukkan user
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 15 Oktober 2024
 */
package pertemuan5.Prak.PRAK05_2473021_JAVA;

import java.util.Scanner;

public class A_Deret {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PROGRAM DERET ANGKA");
        System.out.println("==========================");
        System.out.print("Masukkan Panjang Deret : ");
        int batas = sc.nextInt();
        System.out.println("Hasil Deret :");

        int hasil = 0;
        for (int i = 0; i < batas; i++) {
            hasil = hasil + i;
            System.out.print(hasil + " ");
        }
        sc.close();

    }
}
