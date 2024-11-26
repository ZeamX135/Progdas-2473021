/**
 * Pertemuan 10
 * [PRAKTIKUM]   program yang meminta pengguna untuk memasukkan jumlah elemen yang ingin dimasukkan ke dalam daftar.
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 26 November 2024
 */
package pertemuan10.Prak.PRAK10_2473021_JAVA;

import java.util.Arrays;
import java.util.Scanner;

public class B_ListGanjilGenap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int elemen = sc.nextInt();

        int[] arr1 = new int[elemen];

        System.out.println("Masukkan elemen:");
        for (int i = 0; i < elemen; i++) {
            System.out.print("Elemen " + (i + 1) + ": ");
            arr1[i] = sc.nextInt();
        }

        int[] genap = new int[elemen];
        int[] ganjil = new int[elemen];
        int countGenap = 0, countGanjil = 0;

        for (int angka : arr1) {
            if (angka % 2 == 0) {
                genap[countGenap++] = angka;
            } else {
                ganjil[countGanjil++] = angka;
            }
        }

        int[] gabung = new int[countGanjil + countGenap];
        int index = 0;

        for (int i = 0; i < countGanjil; i++) {
            gabung[index++] = ganjil[i];
        }
        for (int i = 0; i < countGenap; i++) {
            gabung[index++] = genap[i];
        }

        Arrays.sort(gabung);

        System.out.println("Jumlah bilangan genap: " + countGenap);
        System.out.println("Jumlah bilangan ganjil: " + countGanjil);

        System.out.print("Bilangan genap: ");
        for (int i = 0; i < countGenap; i++) {
            System.out.print(genap[i] + " ");
        }
        System.out.println();

        System.out.print("Bilangan ganjil: ");
        for (int i = 0; i < countGanjil; i++) {
            System.out.print(ganjil[i] + " ");
        }
        System.out.println();

        System.out.print("Penggabungan list Ganjil Genap yang telah diurutkan: ");
        System.out.println(Arrays.toString(gabung));

        sc.close();
    }
}
