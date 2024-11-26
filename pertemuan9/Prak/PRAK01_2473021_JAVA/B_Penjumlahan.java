/**
 * Pertemuan 09
 * [PRAKTIKUM]   program sederhana yang meminta pengguna memasukkan dua array berukuran N dengan elemen bilangan bulat
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 19 Oktober 2024
 */
package pertemuan9.Prak.PRAK01_2473021_JAVA;

import java.util.Scanner;

public class B_Penjumlahan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[100];
        int[] arr2 = new int[100];
        int[] hasil = new int[100];
        int arr_count, i, subtotal = 0, total = 0;

        System.out.print("Masukkan Ukuran Array (N) : ");
        arr_count = sc.nextInt();
        System.out.println();

        System.out.println("Masukkan Elemen Array Pertama");
        for (i = 0; i < arr_count; i++) {
            System.out.print("Elemen Ke-" + (i + 1) + ": ");
            arr1[i] = sc.nextInt();
        }

        System.out.println("Masukkan Elemen Array Kedua");
        for (i = 0; i < arr_count; i++) {
            System.out.print("Elemen Ke-" + (i + 1) + ": ");
            arr2[i] = sc.nextInt();
        }
        for (i = 0; i < arr_count; i++) {
            subtotal = arr1[i] + arr2[i];
            hasil[i] = subtotal;
        }
        for (i = 0; i < arr_count; i++) {
            hasil[i] = arr1[i] + arr2[i];
            System.out.println("Hasil Penjumlahan Ke-" + (i + 1) + ": " + hasil[i]);
            total += hasil[i];
        }
        System.out.println("Total Penjumlahan : " + total);
        sc.close();
    }
}
