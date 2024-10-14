/**
 * Pertemuan 04
 * [PRAKTIKUM] program kalkulator, dimana pengguna diminta untuk memilih operator penjumlahan, pengurangan, perkalian, atau pembagian.
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 08 Oktober 2024
 */
package pertemuan4.Prak.PRAK04_2473021_JAVA;

import java.util.Scanner;

public class A_Kalkulator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("========== KALKULATOR ==========");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("================================");

        // Input
        System.out.print("Pilih operator : ");
        int operator = sc.nextInt();

        switch (operator) {
            case 1:
                System.out.print("\nAngka pertama: ");
                int a1 = sc.nextInt();

                System.out.print("Angka kedua: ");
                int a2 = sc.nextInt();
                System.out.println("================================");
                int tambah = a1 + a2;
                System.out.println("hasil penambahan " + a1 + " dan " + a2 + " adalah " + tambah);
                break;
            case 2:
                System.out.print("\nAngka pertama: ");
                a1 = sc.nextInt();

                System.out.print("Angka kedua: ");
                a2 = sc.nextInt();
                System.out.println("================================");
                int kurang = a1 - a2;
                System.out.println("hasil pengurangan " + a1 + " dan " + a2 + " adalah " + kurang);
                break;
            case 3:
                System.out.print("\nAngka pertama: ");
                a1 = sc.nextInt();

                System.out.print("Angka kedua: ");
                a2 = sc.nextInt();
                System.out.println("================================");
                int kali = a1 * a2;
                System.out.println("hasil perkalian " + a1 + " dan " + a2 + " adalah " + kali);
                break;
            case 4:
                System.out.print("\nAngka pertama: ");
                a1 = sc.nextInt();

                System.out.print("Angka kedua: ");
                a2 = sc.nextInt();
                System.out.println("================================");

                if (a2 == 0) {
                    System.out.println("hasil pembagian " + a1 + " dan " + a2 + " adalah tak terhingga");
                } else {
                    double bagi = a1 / a2;
                    System.out.println("hasil pembagian " + a1 + " dan " + a2 + " adalah " + bagi);
                }
                break;
            default:
                System.out.println("\nPilihan Tidak Valid");
        }

        sc.close();
    }
}
