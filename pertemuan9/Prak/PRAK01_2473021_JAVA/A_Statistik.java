/**
 * Pertemuan 09
 * [PRAKTIKUM]  program untuk menggabungkan dan menjumlahkan nilai dari array a dan array b
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 19 Oktober 2024
 */
package pertemuan9.Prak.PRAK01_2473021_JAVA;

import java.util.Arrays;

public class A_Statistik {

    public static void main(String[] args) {
        int a[] = {14, 16, 4, 32, 10, 256, 1};
        int b[] = {2, 8, 64, 128, 12, 512};
        int jumlah = 0;
        double median = 0, mean = 0;
        int arr1L = a.length;
        int arr2L = b.length;
        int arr3L = arr1L + arr2L;
        int[] c = new int[arr3L];
        for (int i = 0; i < arr1L; i = i + 1) {
            c[i] = a[i];
        }
        for (int i = 0; i < arr2L; i = i + 1) {
            c[arr1L + i] = b[i];
        }
        for (int i = 0; i < arr3L; i = i + 1) {
            System.out.print(c[i]);
        }

        Arrays.sort(c);

        System.out.println("Gabungan Data dari Kedua Array (diurutkan)\t: " + Arrays.toString(c));
        for (int i = 0; i <= 12; i++) {
            jumlah = jumlah + c[i];
            median = c[6];
            mean = jumlah / 13.0;
        }
        System.out.println("Jumlah Nilai dari kedua array\t\t\t: " + jumlah);
        System.out.println("Median\t\t\t\t\t\t: " + median);
        System.out.println("Mean\t\t\t\t\t\t: " + mean);
        System.out.println("Maximal\t\t\t\t\t\t: " + mean);
        System.out.println("Minimal\t\t\t\t\t\t: " + mean);
    }

}
