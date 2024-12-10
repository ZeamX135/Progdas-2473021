/**
 * Pertemuan 11
 * [PRAKTIKUM]  program dalam bahasa Java untuk menentukan bilangan prima dalam rentang tertentu.
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 03 Desember 2024
 */
package pertemuan11.Prak.PRAK11_2473021_JAVA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A_BilanganPrima {

    public static boolean prima(int x) {
        if (x < 2) {
            return false;
        }
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> cariBilanganPrima(int awal, int akhir) {
        List<Integer> listBilanganPrima = new ArrayList<>();

        for (int x = awal; x <= akhir; x++) {
            if (prima(x)) {
                listBilanganPrima.add(x);
            }
        }

        return listBilanganPrima;
    }

    public static void cetakBilanganPrima(int awal, int akhir) {
        System.out.print("Bilangan prima dalam rentang " + awal + " hingga " + akhir + " adalah: ");
        for (int angka = awal; angka <= akhir; angka++) {
            if (prima(angka)) {
                System.out.print(angka + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka awal: ");
        int angkaAwal = sc.nextInt();

        System.out.print("Masukkan angka akhir: ");
        int angkaAkhir = sc.nextInt();

        cetakBilanganPrima(angkaAwal, angkaAkhir);

        sc.close();
    }
}
