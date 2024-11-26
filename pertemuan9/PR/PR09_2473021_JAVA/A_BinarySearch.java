/**
 * Pertemuan 09
 * [PR] program yang meminta jumlah bilangan dalam bentuk array dan user dapat menginput bilangan untuk setiap indeksnya,
 * setelah itu user dapat mencari letak indeks angka yang diinginkan
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 24 November 2024
 */
package pertemuan9.PR.PR09_2473021_JAVA;

import java.util.Scanner;

public class A_BinarySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah bilangan: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Indeks ke-" + i + ": ");
            array[i] = sc.nextInt();
        }

        System.out.print("Angka yang dicari: ");
        int target = sc.nextInt();

        int left = 0, right = n - 1, result = -1;
        while (left <= right) {
            int middle = (left + right) / 2;

            if (array[middle] == target) {
                result = middle;
                break;
            } else if (array[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        if (result != -1) {
            System.out.println("Data ditemukan pada indeks: " + result);
        } else {
            System.out.println("Data tidak ditemukan.");
        }

    }
}
